package br.com.senac.techfix.view;

import br.com.senac.techfix.controller.ViewController;
import br.com.senac.techfix.data.ServicoJPA;
import br.com.senac.techfix.model.Servico;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class editServicoVIEW extends javax.swing.JDialog {
    
    private JFrame telaPai;
    private Servico servicoParaEditar;
    
    public editServicoVIEW() {
        this(null, null);
    }
    
    public editServicoVIEW(JFrame tela, Servico s) {
        super(tela, "Editar Serviço", true); 
        initComponents();
        this.telaPai = tela;
        this.servicoParaEditar = s;

        this.setLocationRelativeTo(tela); 

        if (s != null) {
            preencherCampos();
        }
        
        ViewController helper = new ViewController();
        
        helper.preencherComboClientes(cmbCliente);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbCliente = new javax.swing.JComboBox<>();
        cmbServico = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextPane();
        txtData = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbCliente.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cmbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar Cliente..." }));
        getContentPane().add(cmbCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 659, -1));

        cmbServico.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cmbServico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de Serviço...", "Formatação Completa", "Limpeza Física+Pasta Térmica", "Instalação de SSD / Upgrade", "Reparo de Hardware/Placa", "Remoção de Vírus/Software", "Outros (Incluir Descrição)" }));
        getContentPane().add(cmbServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 659, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel8.setText("Descrição Detalhada:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel7.setText("Valor do Serviço:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, -1, -1));

        txtValor.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        getContentPane().add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, 218, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel9.setText("Data da Realização:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 550, -1, -1));

        btnSalvar.setBackground(new java.awt.Color(41, 128, 185));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(0, 0, 0));
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(this::btnSalvarActionPerformed);
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 660, -1, -1));

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));
        jPanel1.setToolTipText("");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 44)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Editar Serviço");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(348, 348, 348)
                .addComponent(jLabel2)
                .addContainerGap(356, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, -1));

        txtDescricao.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jScrollPane1.setViewportView(txtDescricao);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 890, 240));

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        getContentPane().add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 580, 240, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        ViewController helper = new ViewController();

            if (!helper.validarServico(cmbCliente, txtValor, (JFormattedTextField) txtData)) {
                return;
            }

            try {
                servicoParaEditar.setDescricao(txtDescricao.getText());
                servicoParaEditar.setValor(Double.parseDouble(txtValor.getText().replace(",", ".")));
                servicoParaEditar.setData(txtData.getText());

                ServicoJPA dao = new ServicoJPA();
                dao.atualizar(servicoParaEditar); 

                JOptionPane.showMessageDialog(null, "Serviço editado com sucesso!");

                if (telaPai != null) {
                    if (telaPai instanceof conHistoricoVIEW) {
                        ((conHistoricoVIEW) telaPai).atualizarTabela();
                    } else if (telaPai instanceof telaPrincipalVIEW) {
                        ((telaPrincipalVIEW) telaPai).atualizarTabela();
                    }
                }

                this.dispose();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + e.getMessage());
            }
    }//GEN-LAST:event_btnSalvarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace(); 
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new editServicoVIEW().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmbCliente;
    private javax.swing.JComboBox<String> cmbServico;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextPane txtDescricao;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

    private void preencherCampos() {
        if (servicoParaEditar != null) {
            txtDescricao.setText(servicoParaEditar.getDescricao());
            txtValor.setText(String.valueOf(servicoParaEditar.getValor()));
            txtData.setText(servicoParaEditar.getData());
            
            cmbCliente.setSelectedItem(servicoParaEditar.getCliente());
            cmbServico.setSelectedItem(servicoParaEditar.getTipoServico());
        }
    }
}
