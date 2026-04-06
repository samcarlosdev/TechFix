package br.com.senac.techfix.view;

import br.com.senac.techfix.controller.ViewController;
import br.com.senac.techfix.data.ServicoJPA;
import br.com.senac.techfix.model.Servico;
import br.com.senac.techfix.model.Usuario;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

public class telaPrincipalVIEW extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(telaPrincipalVIEW.class.getName());

    ViewController helper = new ViewController();
    
    public telaPrincipalVIEW() {
        initComponents();

        helper.exit(this);
        helper.atualizarTabelaHistorico(tblHistorico, null, true, false);
      
        if (Usuario.sessao != null) {
            lblBoasVindas.setText("Bem vindo, " + Usuario.sessao.getNome() + "!");
        }
        
        lblBoasVindas.setForeground(Color.WHITE);
        lblBoasVindas.setFont(new Font("Segoe UI", Font.BOLD, 44));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblBoasVindas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHistorico = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnInicial = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnHistorico = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(244, 247, 246));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));
        jPanel1.setToolTipText("");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 44)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TechFix - Painel");

        lblBoasVindas.setBackground(new java.awt.Color(255, 255, 255));
        lblBoasVindas.setFont(new java.awt.Font("Segoe UI", 1, 44)); // NOI18N
        lblBoasVindas.setForeground(new java.awt.Color(255, 255, 255));
        lblBoasVindas.setText("Bem vindo, (usúario)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 472, Short.MAX_VALUE)
                .addComponent(lblBoasVindas)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblBoasVindas))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        tblHistorico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "Serviço", "Data"
            }
        ));
        jScrollPane1.setViewportView(tblHistorico);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 187, 892, 494));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setText("Últimos Serviços");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 142, -1, -1));

        jPanel2.setBackground(new java.awt.Color(62, 86, 109));
        jPanel2.setPreferredSize(new java.awt.Dimension(201, 871));

        btnInicial.setBackground(new java.awt.Color(0, 78, 129));
        btnInicial.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnInicial.setText("Tela Inicial");

        btnClientes.setBackground(new java.awt.Color(41, 128, 185));
        btnClientes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClientes.setText("Cadastrar \nClientes");
        btnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClientesMouseExited(evt);
            }
        });
        btnClientes.addActionListener(this::btnClientesActionPerformed);

        btnRegistrar.setBackground(new java.awt.Color(41, 128, 185));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegistrar.setText("Registrar Serviços");
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseExited(evt);
            }
        });
        btnRegistrar.addActionListener(this::btnRegistrarActionPerformed);

        btnHistorico.setBackground(new java.awt.Color(41, 128, 185));
        btnHistorico.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnHistorico.setText("Consultar Histórico");
        btnHistorico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHistoricoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHistoricoMouseExited(evt);
            }
        });
        btnHistorico.addActionListener(this::btnHistoricoActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHistorico, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(btnHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(btnInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 105, 236, 620));

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/techfix/images/bin 1.png"))); // NOI18N
        btnExcluir.addActionListener(this::btnExcluirActionPerformed);
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 400, 70, 70));

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/techfix/images/printer 1.png"))); // NOI18N
        btnImprimir.addActionListener(this::btnImprimirActionPerformed);
        getContentPane().add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 200, 70, 70));

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/techfix/images/edit 1.png"))); // NOI18N
        btnEditar.addActionListener(this::btnEditarActionPerformed);
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 300, 70, 70));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseEntered
        btnClientes.setBackground(Color.decode("#004E81"));
    }//GEN-LAST:event_btnClientesMouseEntered

    private void btnClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseExited
        btnClientes.setBackground(Color.decode("#2980B9"));
    }//GEN-LAST:event_btnClientesMouseExited

    private void btnRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseEntered
        btnRegistrar.setBackground(Color.decode("#004E81"));
    }//GEN-LAST:event_btnRegistrarMouseEntered

    private void btnRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseExited
        btnRegistrar.setBackground(Color.decode("#2980B9"));
    }//GEN-LAST:event_btnRegistrarMouseExited

    private void btnHistoricoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHistoricoMouseEntered
        btnHistorico.setBackground(Color.decode("#004E81"));
    }//GEN-LAST:event_btnHistoricoMouseEntered

    private void btnHistoricoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHistoricoMouseExited
        btnHistorico.setBackground(Color.decode("#2980B9"));
    }//GEN-LAST:event_btnHistoricoMouseExited

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        helper.trocarTelas(new cadClienteVIEW(), this);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        helper.trocarTelas(new regServicoVIEW(), this);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoricoActionPerformed
        helper.trocarTelas(new conHistoricoVIEW(), this);
    }//GEN-LAST:event_btnHistoricoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linha = tblHistorico.getSelectedRow();
    
        if (linha != -1) 
        {
            int id = helper.getIdSelecionado(tblHistorico); 

            int resposta = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir este serviço?");

            if (resposta == JOptionPane.YES_OPTION) 
            {
                try 
                {
                    ServicoJPA dao = new ServicoJPA();
                    dao.remover(id);

                    JOptionPane.showMessageDialog(this, "Serviço excluído com sucesso!");
                    atualizarTabela();
                } 
                catch (Exception e) 
                {
                    JOptionPane.showMessageDialog(this, "Erro ao excluir: " + e.getMessage());
                }
            }
        } 
        else 
        {
            JOptionPane.showMessageDialog(this, "Selecione um serviço na tabela para excluir.");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        int linha = tblHistorico.getSelectedRow();

        if (linha != -1) {
            String data    = tblHistorico.getValueAt(linha, 1).toString();
            String cliente = tblHistorico.getValueAt(linha, 2).toString();
            String servico = tblHistorico.getValueAt(linha, 3).toString();
            String valor   = tblHistorico.getValueAt(linha, 4).toString();

            helper.gerarReciboPDF(cliente, servico, data, valor);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um serviço para gerar o recibo.");
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        int id = helper.getIdSelecionado(tblHistorico);
        
        if (id != -1)
        {
            ServicoJPA dao = new ServicoJPA();
            Servico servicoParaEditar = dao.buscarPorId(id);
            
            editServicoVIEW telaEditar = new editServicoVIEW(this, servicoParaEditar);
            telaEditar.setVisible(true);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new telaPrincipalVIEW().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnHistorico;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnInicial;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBoasVindas;
    private javax.swing.JTable tblHistorico;
    // End of variables declaration//GEN-END:variables

    public void atualizarTabela() {
        helper.atualizarTabelaHistorico(tblHistorico, null, true, false); 
    }
}
