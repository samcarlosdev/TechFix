package br.com.senac.techfix.view;

import br.com.senac.techfix.controller.ViewController;
import br.com.senac.techfix.data.ClienteJPA;
import br.com.senac.techfix.model.Cliente;
import java.awt.Color;
import javax.swing.JOptionPane;

public class cadClienteVIEW extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(cadClienteVIEW.class.getName());

    public cadClienteVIEW() {
        initComponents();
        
        ViewController helper = new ViewController();
        
        helper.exit(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnPrincipal = new javax.swing.JButton();
        btnCadClientes = new javax.swing.JButton();
        btnRegServicos = new javax.swing.JButton();
        btnConHistorico = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservacoes = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(244, 247, 246));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));
        jPanel1.setToolTipText("");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 44)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastrar Cliente");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 44)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TechFix - Painel");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 564, Short.MAX_VALUE)
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

        btnPrincipal.setBackground(new java.awt.Color(41, 128, 185));
        btnPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPrincipal.setText("Tela Inicial");
        btnPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPrincipalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPrincipalMouseExited(evt);
            }
        });
        btnPrincipal.addActionListener(this::btnPrincipalActionPerformed);

        btnCadClientes.setBackground(new java.awt.Color(0, 78, 129));
        btnCadClientes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCadClientes.setText("Cadastrar \nClientes");

        btnRegServicos.setBackground(new java.awt.Color(41, 128, 185));
        btnRegServicos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegServicos.setText("Registrar Serviços");
        btnRegServicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegServicosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegServicosMouseExited(evt);
            }
        });
        btnRegServicos.addActionListener(this::btnRegServicosActionPerformed);

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
                    .addComponent(btnCadClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegServicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnConHistorico, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(btnCadClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(btnRegServicos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(btnConHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(btnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 105, 236, 620));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setText("Nome Completo:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 130, -1, -1));

        txtEndereco.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        getContentPane().add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 409, 768, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setText("CPF:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 212, -1, -1));

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        getContentPane().add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 245, 294, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setText("Telefone:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 294, -1, -1));

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        getContentPane().add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 327, 294, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setText("Endereço:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 376, -1, -1));

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 163, 965, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel7.setText("Observações:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 458, -1, -1));

        btnSalvar.setBackground(new java.awt.Color(41, 128, 185));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(0, 0, 0));
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(this::btnSalvarActionPerformed);
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 668, -1, -1));

        txtObservacoes.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jScrollPane1.setViewportView(txtObservacoes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 491, 965, 146));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegServicosActionPerformed
        ViewController helper = new ViewController();
        helper.trocarTelas(new regServicoVIEW(), this);
    }//GEN-LAST:event_btnRegServicosActionPerformed

    private void btnConHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConHistoricoActionPerformed
        ViewController helper = new ViewController();
        helper.trocarTelas(new conHistoricoVIEW(), this);
    }//GEN-LAST:event_btnConHistoricoActionPerformed

    private void btnPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalActionPerformed
        ViewController helper = new ViewController();
        helper.trocarTelas(new telaPrincipalVIEW(), this);
    }//GEN-LAST:event_btnPrincipalActionPerformed

    private void btnRegServicosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegServicosMouseEntered
        btnRegServicos.setBackground(Color.decode("#004E81"));
    }//GEN-LAST:event_btnRegServicosMouseEntered

    private void btnRegServicosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegServicosMouseExited
        btnRegServicos.setBackground(Color.decode("#2980B9"));
    }//GEN-LAST:event_btnRegServicosMouseExited

    private void btnConHistoricoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConHistoricoMouseEntered
        btnConHistorico.setBackground(Color.decode("#004E81"));
    }//GEN-LAST:event_btnConHistoricoMouseEntered

    private void btnConHistoricoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConHistoricoMouseExited
        btnConHistorico.setBackground(Color.decode("#2980B9"));
    }//GEN-LAST:event_btnConHistoricoMouseExited

    private void btnPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrincipalMouseEntered
        btnPrincipal.setBackground(Color.decode("#004E81"));
    }//GEN-LAST:event_btnPrincipalMouseEntered

    private void btnPrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrincipalMouseExited
        btnPrincipal.setBackground(Color.decode("#2980B9"));
    }//GEN-LAST:event_btnPrincipalMouseExited

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        ViewController helper = new ViewController();

        if (!helper.validarCliente(txtNome, txtCpf)) {
            return;
        }

        Cliente novoCliente = helper.coletarCliente(txtNome, txtCpf, txtTelefone, txtEndereco, txtObservacoes);
        try 
        {
            ClienteJPA dao = new ClienteJPA();
            dao.cadastrar(novoCliente);

            JOptionPane.showMessageDialog(null, "Cliente " + novoCliente.getNome() + " salvo com sucesso!");
            helper.limparCampos(txtNome, txtCpf, txtTelefone, txtEndereco, txtObservacoes);
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + e.getMessage());
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new cadClienteVIEW().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadClientes;
    private javax.swing.JButton btnConHistorico;
    private javax.swing.JButton btnPrincipal;
    private javax.swing.JButton btnRegServicos;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextPane txtObservacoes;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
