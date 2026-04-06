package br.com.senac.techfix.view;

import br.com.senac.techfix.controller.ViewController;
import br.com.senac.techfix.data.ServicoJPA;
import br.com.senac.techfix.model.Servico;
import java.awt.Color;
import javax.swing.JOptionPane;

public class conHistoricoVIEW extends javax.swing.JFrame {
    
    private boolean isNome = true;
    
    ViewController helper = new ViewController();
    
    public conHistoricoVIEW() {
        initComponents();
        
        helper.exit(this);
        
        atualizarTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnInicial = new javax.swing.JButton();
        btnCadClientes = new javax.swing.JButton();
        btnRegServicos = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        rdbTipo = new javax.swing.JRadioButton();
        rdbNome = new javax.swing.JRadioButton();
        txtPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHistorico = new javax.swing.JTable();
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

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 44)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Histórcio de Serviços");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 481, Short.MAX_VALUE)
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

        btnInicial.setBackground(new java.awt.Color(41, 128, 185));
        btnInicial.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnInicial.setText("Tela Inicial");
        btnInicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInicialMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInicialMouseExited(evt);
            }
        });
        btnInicial.addActionListener(this::btnInicialActionPerformed);

        btnCadClientes.setBackground(new java.awt.Color(41, 128, 185));
        btnCadClientes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCadClientes.setText("Cadastrar \nClientes");
        btnCadClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCadClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCadClientesMouseExited(evt);
            }
        });
        btnCadClientes.addActionListener(this::btnCadClientesActionPerformed);

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

        jButton4.setBackground(new java.awt.Color(0, 78, 129));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setText("Consultar Histórico");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegServicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnCadClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(btnRegServicos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(btnInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 105, 236, 620));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel8.setText("Pesquisar por:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 137, -1, -1));

        buttonGroup1.add(rdbTipo);
        rdbTipo.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        rdbTipo.setText("Tipo de Texto");
        getContentPane().add(rdbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 135, -1, -1));

        buttonGroup1.add(rdbNome);
        rdbNome.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        rdbNome.setSelected(true);
        rdbNome.setText("Nome do Cliente");
        rdbNome.addActionListener(this::rdbNomeActionPerformed);
        getContentPane().add(rdbNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 135, -1, -1));

        txtPesquisa.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtPesquisa.addActionListener(this::txtPesquisaActionPerformed);
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });
        getContentPane().add(txtPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 179, 617, -1));

        tblHistorico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Data", "Cliente", "Tipo de Serviço", "Valor (R$)"
            }
        ));
        jScrollPane1.setViewportView(tblHistorico);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 243, 997, 476));

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/techfix/images/bin 1.png"))); // NOI18N
        btnExcluir.addActionListener(this::btnExcluirActionPerformed);
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 150, 70, 70));

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/techfix/images/printer 1.png"))); // NOI18N
        btnImprimir.addActionListener(this::btnImprimirActionPerformed);
        getContentPane().add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 150, 70, 70));

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/techfix/images/edit 1.png"))); // NOI18N
        btnEditar.addActionListener(this::btnEditarActionPerformed);
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 150, 70, 70));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadClientesActionPerformed
        helper.trocarTelas(new cadClienteVIEW(), this);
    }//GEN-LAST:event_btnCadClientesActionPerformed

    private void btnRegServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegServicosActionPerformed
        helper.trocarTelas(new regServicoVIEW(), this);
    }//GEN-LAST:event_btnRegServicosActionPerformed

    private void btnInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicialActionPerformed
        helper.trocarTelas(new telaPrincipalVIEW(), this);
    }//GEN-LAST:event_btnInicialActionPerformed

    private void btnCadClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadClientesMouseEntered
        btnCadClientes.setBackground(Color.decode("#004E81"));
    }//GEN-LAST:event_btnCadClientesMouseEntered

    private void btnCadClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadClientesMouseExited
        btnCadClientes.setBackground(Color.decode("#2980B9"));
    }//GEN-LAST:event_btnCadClientesMouseExited

    private void btnRegServicosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegServicosMouseEntered
        btnRegServicos.setBackground(Color.decode("#004E81"));
    }//GEN-LAST:event_btnRegServicosMouseEntered

    private void btnRegServicosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegServicosMouseExited
        btnRegServicos.setBackground(Color.decode("#2980B9"));
    }//GEN-LAST:event_btnRegServicosMouseExited

    private void btnInicialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicialMouseEntered
        btnInicial.setBackground(Color.decode("#004E81"));
    }//GEN-LAST:event_btnInicialMouseEntered

    private void btnInicialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicialMouseExited
        btnInicial.setBackground(Color.decode("#2980B9"));
    }//GEN-LAST:event_btnInicialMouseExited

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

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int id = helper.getIdSelecionado(tblHistorico);
        
        if(id != -1)
        {
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
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void rdbNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbNomeActionPerformed
    }//GEN-LAST:event_rdbNomeActionPerformed

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed

                
    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        atualizarTabela();
    }//GEN-LAST:event_txtPesquisaKeyReleased

    public static void main(String args[]) {
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

        java.awt.EventQueue.invokeLater(() -> new conHistoricoVIEW().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadClientes;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnInicial;
    private javax.swing.JButton btnRegServicos;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdbNome;
    private javax.swing.JRadioButton rdbTipo;
    private javax.swing.JTable tblHistorico;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
    
    void atualizarTabela()
    {
        if(rdbNome.isSelected())
        {
            isNome = true;
        }
        else if(rdbTipo.isSelected())
        {
            isNome = false;
        }
        
        helper.atualizarTabelaHistorico(tblHistorico, txtPesquisa.getText(), isNome, true);
    }

}
