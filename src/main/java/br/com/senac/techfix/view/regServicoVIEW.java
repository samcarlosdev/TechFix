package br.com.senac.techfix.view;

import br.com.senac.techfix.controller.ViewController;
import br.com.senac.techfix.data.ServicoJPA;
import br.com.senac.techfix.model.Servico;
import java.awt.Color;
import javax.swing.JOptionPane;

public class regServicoVIEW extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(regServicoVIEW.class.getName());

    public regServicoVIEW() {
        initComponents();
        
        ViewController helper = new ViewController();
        helper.exit(this);
        
        helper.preencherComboClientes(cmbCliente);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnTelaInicial = new javax.swing.JButton();
        btnCadCliente = new javax.swing.JButton();
        btnRegServico = new javax.swing.JButton();
        btnConHistorico = new javax.swing.JButton();
        cmbServico = new javax.swing.JComboBox<>();
        cmbCliente = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        chkAtual = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextPane();
        txtData = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(244, 247, 246));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));
        jPanel1.setToolTipText("");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 44)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TechFix - Painel");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 44)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar Serviços");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 544, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(62, 86, 109));
        jPanel2.setPreferredSize(new java.awt.Dimension(201, 871));

        btnTelaInicial.setBackground(new java.awt.Color(41, 128, 185));
        btnTelaInicial.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTelaInicial.setText("Tela Inicial");
        btnTelaInicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTelaInicialMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTelaInicialMouseExited(evt);
            }
        });
        btnTelaInicial.addActionListener(this::btnTelaInicialActionPerformed);

        btnCadCliente.setBackground(new java.awt.Color(41, 128, 185));
        btnCadCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCadCliente.setText("Cadastrar \nClientes");
        btnCadCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCadClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCadClienteMouseExited(evt);
            }
        });
        btnCadCliente.addActionListener(this::btnCadClienteActionPerformed);

        btnRegServico.setBackground(new java.awt.Color(0, 78, 129));
        btnRegServico.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegServico.setText("Registrar Serviços");

        btnConHistorico.setBackground(new java.awt.Color(41, 128, 185));
        btnConHistorico.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnConHistorico.setText("Consultar Histórico");
        btnConHistorico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConHistoricoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConHistoricoMouseExited(evt);
            }
        });
        btnConHistorico.addActionListener(this::btnConHistoricoActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnTelaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnConHistorico, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnCadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(btnRegServico, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(btnConHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(btnTelaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 107, 236, 620));

        cmbServico.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cmbServico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de Serviço...", "Formatação Completa", "Limpeza Física+Pasta Térmica", "Instalação de SSD / Upgrade", "Reparo de Hardware/Placa", "Remoção de Vírus/Software", "Outros (Incluir Descrição)" }));
        getContentPane().add(cmbServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 200, 659, -1));

        cmbCliente.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cmbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar Cliente..." }));
        getContentPane().add(cmbCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 135, 659, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel7.setText("Valor do Serviço:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 580, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel8.setText("Descrição Detalhada:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        txtValor.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        getContentPane().add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 610, 218, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel9.setText("Data da Realização:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 580, -1, -1));

        btnSalvar.setBackground(new java.awt.Color(41, 128, 185));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(0, 0, 0));
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(this::btnSalvarActionPerformed);
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 670, -1, -1));

        chkAtual.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chkAtual.setText("Usar Data Atual");
        chkAtual.addActionListener(this::chkAtualActionPerformed);
        getContentPane().add(chkAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 610, -1, -1));

        txtDescricao.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jScrollPane1.setViewportView(txtDescricao);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 970, 280));

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        getContentPane().add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 610, 220, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadClienteActionPerformed
        ViewController helper = new ViewController();
        helper.trocarTelas(new cadClienteVIEW(), this);
    }//GEN-LAST:event_btnCadClienteActionPerformed

    private void btnConHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConHistoricoActionPerformed
        ViewController helper = new ViewController();
        helper.trocarTelas(new conHistoricoVIEW(), this);
    }//GEN-LAST:event_btnConHistoricoActionPerformed

    private void btnTelaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaInicialActionPerformed
        ViewController helper = new ViewController();
        helper.trocarTelas(new telaPrincipalVIEW(), this);
    }//GEN-LAST:event_btnTelaInicialActionPerformed

    private void btnCadClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadClienteMouseEntered
        btnCadCliente.setBackground(Color.decode("#004E81"));
    }//GEN-LAST:event_btnCadClienteMouseEntered

    private void btnCadClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadClienteMouseExited
        btnCadCliente.setBackground(Color.decode("#2980B9"));
    }//GEN-LAST:event_btnCadClienteMouseExited

    private void btnConHistoricoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConHistoricoMouseEntered
        btnConHistorico.setBackground(Color.decode("#004E81"));
    }//GEN-LAST:event_btnConHistoricoMouseEntered

    private void btnConHistoricoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConHistoricoMouseExited
        btnConHistorico.setBackground(Color.decode("#2980B9"));
    }//GEN-LAST:event_btnConHistoricoMouseExited

    private void btnTelaInicialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTelaInicialMouseEntered
        btnTelaInicial.setBackground(Color.decode("#004E81"));
    }//GEN-LAST:event_btnTelaInicialMouseEntered

    private void btnTelaInicialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTelaInicialMouseExited
        btnTelaInicial.setBackground(Color.decode("#2980B9"));
    }//GEN-LAST:event_btnTelaInicialMouseExited

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        ViewController helper = new ViewController();

        if (!helper.validarServico(cmbCliente, txtValor, txtData)) {
            return;
        }

        Servico novoServico = helper.coletarServico(cmbCliente, cmbServico, txtDescricao, txtValor, txtData);
        
        try 
        {
            ServicoJPA dao = new ServicoJPA();
            dao.cadastrar(novoServico);

            JOptionPane.showMessageDialog(null, "Serviço registrado com sucesso!");
            helper.limparCampos(cmbCliente, cmbServico, txtDescricao, txtValor, txtData);
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Erro ao salvar serviço: " + e.getMessage());
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void chkAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAtualActionPerformed
        ViewController helper = new ViewController();
        
        if(chkAtual.isSelected())
        {
            helper.porDataAtual(txtData);
            txtData.setEnabled(false);
        }
        else
        {
            txtData.setEnabled(true);
        }
    }//GEN-LAST:event_chkAtualActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new regServicoVIEW().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadCliente;
    private javax.swing.JButton btnConHistorico;
    private javax.swing.JButton btnRegServico;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnTelaInicial;
    private javax.swing.JCheckBox chkAtual;
    private javax.swing.JComboBox<String> cmbCliente;
    private javax.swing.JComboBox<String> cmbServico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextPane txtDescricao;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
