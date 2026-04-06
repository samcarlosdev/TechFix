package br.com.senac.techfix.controller;

import br.com.senac.techfix.data.ClienteJPA;
import br.com.senac.techfix.data.ServicoJPA;
import br.com.senac.techfix.data.UsuarioJPA;
import br.com.senac.techfix.model.Cliente;
import br.com.senac.techfix.model.Servico;
import br.com.senac.techfix.model.Usuario;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Document;
import java.awt.Component;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;

public class ViewController 
{
    public void trocarTelas(JFrame tela, JFrame atual)
    {
        if(tela != null)
        {
            tela.setVisible(true);
        }

        if(atual != null)
        {
            atual.dispose();
        }
    }
    
    public void exit(JFrame atual)
    {
        atual.addWindowListener(new java.awt.event.WindowAdapter() 
        {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) 
            {
                confirmarSaida(atual);
            }
        });
    }
        
    private void confirmarSaida(JFrame atual) 
    {
        int acao = JOptionPane.showConfirmDialog
        (
            atual, 
            "Você realmente deseja sair?", 
            "Confirmar Saída", 
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );

        if (acao == JOptionPane.YES_OPTION) 
        {
            System.exit(0); 
        }
    }

    public Cliente coletarCliente(JTextField nome, JFormattedTextField cpf, JFormattedTextField telefone, JTextField endereco, JTextPane observacoes)
    {
        Cliente cliente = new Cliente();
        
        String txtNome = nome.getText();
        String txtCpf = cpf.getText();
        String txtTelefone = telefone.getText();
        String txtEndereco = endereco.getText();
        String txtObservacoes = observacoes.getText();
    
        cliente.setNome(txtNome);
        cliente.setCpf(txtCpf);
        cliente.setEndereco(txtEndereco);
        cliente.setObservacoes(txtObservacoes);
        cliente.setTelefone(txtTelefone);
        
        return cliente;
    }

    public Servico coletarServico(JComboBox cmbCliente, JComboBox cmbServico, JTextPane txtDescricao, JTextField txtValor, JFormattedTextField txtData) 
    {
        Servico s = new Servico();

        if (cmbCliente.getSelectedItem() instanceof Cliente) {
            s.setCliente((Cliente) cmbCliente.getSelectedItem());
        }

        s.setTipoServico(cmbServico.getSelectedItem().toString());
        s.setDescricao(txtDescricao.getText().trim());

        try {
            String valorLimpo = txtValor.getText().replace(",", ".");
            s.setValor(Double.parseDouble(valorLimpo));
        } catch (NumberFormatException e) {
            s.setValor(0.0);
        }

        s.setData(txtData.getText().trim());
        return s;
    }

    public void limparCampos(JTextField nome, JFormattedTextField cpf, JFormattedTextField telefone, JTextField endereco, JTextPane observacoes)
    {
        nome.setText("");
        cpf.setValue(null);
        telefone.setValue(null);
        endereco.setText("");
        observacoes.setText("");
    }
    
    public void limparCampos(JComboBox cmbCliente, JComboBox cmbServico, JTextPane txtObservacao, JTextField txtValor, JFormattedTextField txtData)
    {
        cmbCliente.setSelectedIndex(0);
        cmbServico.setSelectedIndex(0);
        txtObservacao.setText("");
        txtValor.setText("");
        txtData.setValue(null);
    }
   
    public boolean camposPreenchidos(JTextField login, JPasswordField senha) 
    {
        String user = login.getText().trim();
        String password = new String(senha.getPassword()).trim();

        return !user.isEmpty() && !password.isEmpty();
    }

    public void atualizarTabelaHistorico(JTable tabela, String filtro, boolean isNome, boolean completa) 
    {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        ServicoJPA dao = new ServicoJPA();
        List<Servico> lista = dao.listar(filtro, isNome);
        
        if(completa)
        {
            for (Servico s : lista) {
                modelo.addRow(new Object[]{
                    s.getId(),
                    s.getData(),
                    s.getCliente() != null ? s.getCliente().getNome() : "Sem Cliente",
                    s.getTipoServico(),
                    s.getValor()
                });
            }
        }
        else
        {
            for (Servico s : lista) {
                modelo.addRow(new Object[]{
                    s.getId(),
                    s.getCliente() != null ? s.getCliente().getNome() : "Sem Cliente",
                    s.getTipoServico(),
                    s.getData(),
                });
            }
        }
        
    }

    public void gerarReciboPDF(String cliente, String servico, String data, String valor) {
       Document documento = new Document();
        String nomeArquivo = "Recibo_" + cliente.replaceAll("[^a-zA-Z0-9]", "_") + ".pdf";

        try {
            PdfWriter.getInstance(documento, new FileOutputStream(nomeArquivo));
            documento.open();

            documento.add(new Paragraph("TECHFIX - ASSISTÊNCIA TÉCNICA"));
            documento.add(new Paragraph("--------------------------------------------------"));
            documento.add(new Paragraph("RECIBO DE SERVIÇO"));
            documento.add(new Paragraph(" ")); 

            documento.add(new Paragraph("Cliente: " + cliente));
            documento.add(new Paragraph("Serviço: " + servico));
            documento.add(new Paragraph("Data: " + data));
            documento.add(new Paragraph("Valor: R$ " + valor));

            documento.add(new Paragraph(" "));
            documento.add(new Paragraph("--------------------------------------------------"));
            documento.add(new Paragraph("Assinatura: ___________________________"));

            documento.close();
            JOptionPane.showMessageDialog(null, "PDF gerado com sucesso!");
            abrirArquivo(nomeArquivo);

        } catch (Exception e) {
            if (documento.isOpen()) documento.close();
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

    private void abrirArquivo(String nomeArquivo) {
        try {
            File arquivoPdf = new File(nomeArquivo);
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(arquivoPdf);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "PDF gerado, mas não foi possível abrir automaticamente.");
        }
    }

    public boolean validarCliente(JTextField nome, JFormattedTextField cpf) 
    {
        if (nome.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O Nome do Cliente é obrigatório (RF001).");
            return false;
        }

        String valorCpf = cpf.getText().trim();
        ClienteJPA dao = new ClienteJPA();
        if (dao.cpfJaExiste(valorCpf)) {
            JOptionPane.showMessageDialog(null, "Este CPF já está cadastrado (RN001).");
            return false;
        }
        return true;
    }

    public boolean validarServico(JComboBox cmbCliente, JTextField txtValor, JFormattedTextField txtData) 
    {
        if (cmbCliente.getSelectedIndex() <= 0) 
        { 
            JOptionPane.showMessageDialog(null, "Selecione um cliente válido (RN002).");
            return false;
        }

        try 
        {
            double valor = Double.parseDouble(txtValor.getText().replace(",", "."));
            if (valor <= 0) 
            {
                JOptionPane.showMessageDialog(null, "O valor do serviço deve ser maior que zero (RN003).");
                return false;
            }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Informe um valor numérivo válido.");
            return false;
        }

        if (txtData.getText().trim().equals("/  /")) 
        {
            JOptionPane.showMessageDialog(null, "A data do serviço é obrigatória.");
            return false;
        }

        return true;
    }
    
    public void preencherComboClientes(JComboBox combo) 
    {
        ClienteJPA dao = new ClienteJPA();
        List<Cliente> lista = dao.listar();

        combo.removeAllItems();
        combo.addItem("Selecione um cliente...");

        for (Cliente c : lista) {
            combo.addItem(c);
        }
    }
    
    public void configurarEnterTeclado(Component atual, Component proximo) 
    {
        atual.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent e) {
                if (e.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    proximo.requestFocus();
                }
            }
        });
    }
    
    public void porDataAtual(JFormattedTextField campoData) 
    {
        LocalDate hoje = LocalDate.now();

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        campoData.setText(hoje.format(formatador));
    }
    
    public int getIdSelecionado(JTable tabela) 
    {
        int linha = tabela.getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(null, "Por favor, selecione um item na tabela.");
            return -1;
        }

        return (int) tabela.getValueAt(linha, 0);
    }
    
    public int escolherTela()
    {
        String[] opcoes = {"Cadastrar Usuário", "Não, vou fazer login"};
        
        int resposta = JOptionPane.showOptionDialog(
            null, 
            "Você deseja cadastrar usuário?",
            "Seleção de Telas",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opcoes,
            opcoes[0]
        );
        
        return resposta;
    }
    
    public Usuario coletarUsuario(JTextField txtNome, JTextField txtLogin, JTextField txtSenha, JComboBox cmbTipo) {
        Usuario u = new Usuario();
        u.setNome(txtNome.getText());
        u.setLogin(txtLogin.getText());
        u.setSenha(txtSenha.getText());
        u.setTipo(cmbTipo.getSelectedItem().toString());
        return u;
    }

    public boolean validarUsuario(JTextField txtNome, JTextField txtLogin, JTextField txtSenha, JComboBox cmbTipo) {
        if (txtNome.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Escreva um nome!");
            return false;
        }
        
        if (txtLogin.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Escreva um login!");
            return false;
        }
        
        if (txtSenha.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Escreva uma senha!");
            return false;
        }
        
        if (cmbTipo.getSelectedIndex() <= 0) {
            JOptionPane.showMessageDialog(null, "Selecione um tipo de usuário!");
            return false;
        }

        return true;
    }

}