/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package univs.edu.telasUsuario;

import univs.edu.instituicao.Instituicao;
import univs.edu.telaInfoDocumentos.TelaInfoCarteira;
import univs.edu.telaInfoDocumentos.TelaInfoCpf;
import univs.edu.telaInfoDocumentos.TelaInfoIdentidade;
import univs.edu.telaInfoDocumentos.TelaInfoTitulo;

public class InfoInstituicao extends javax.swing.JFrame {

    Instituicao instituicao = new Instituicao();
    String documento;

    public InfoInstituicao() {
        initComponents();
        atualizarLista();
        atualizarCampos();
    }

    public void atualizarCampos() {
        instituicao = Instituicao.infoInstituicao;
        tfNomeI.setText(instituicao.getNomeInstituicao());
        tfCidadeI.setText(instituicao.getCidadeInstituicao());
        tfEmailI.setText(instituicao.getEmail());
        tfRuaI.setText(instituicao.getRuaInstituicao());
        tfTelafoneI.setText(instituicao.getTelefone());
    }
    
    public void atualizarLista() {
        this.tfDocumentos.removeAllItems();
        instituicao = Instituicao.infoInstituicao;
        if (instituicao.isCpf() == true) {
            this.tfDocumentos.addItem("CPF");
        }
        
        if (instituicao.isIdentidade() == true) {
            this.tfDocumentos.addItem("Identidade");
        }
        
        if (instituicao.isCarteira() == true) {
            this.tfDocumentos.addItem("Carteira de Trabalho");
        }
        
        if (instituicao.isTitulo() == true) {
            this.tfDocumentos.addItem("Título de Eleitor");
        }
        
        documento = this.tfDocumentos.getSelectedItem().toString();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfDocumentos = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tfTelafoneI = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfNomeI = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfEmailI = new javax.swing.JTextField();
        tfCidadeI = new javax.swing.JTextField();
        tfRuaI = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfDocumentos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(tfDocumentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 157, 30));

        jButton1.setText("Detalhes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Telefone");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        tfTelafoneI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelafoneIActionPerformed(evt);
            }
        });
        getContentPane().add(tfTelafoneI, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 160, 30));

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Empresa");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));
        getContentPane().add(tfNomeI, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 360, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Email");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        getContentPane().add(tfEmailI, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 360, 30));
        getContentPane().add(tfCidadeI, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 160, 30));
        getContentPane().add(tfRuaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 180, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Cidade");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Rua");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Documentos Disponiveis");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 470, 300));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Informações sobre a Empresa");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/univs/edu/imagens/IconeEmpresa.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 80));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (documento.equalsIgnoreCase("CPF")) {
            TelaInfoCpf info = new TelaInfoCpf();
            info.setVisible(true);
            dispose();
        }else if (documento.equalsIgnoreCase("Identidade")) {
            TelaInfoIdentidade info = new TelaInfoIdentidade();
            info.setVisible(true);
            dispose();
        }else if (documento.equalsIgnoreCase("Carteira de Trabalho")) {
            TelaInfoCarteira info = new TelaInfoCarteira();
            info.setVisible(true);
            dispose();
        }else if (documento.equalsIgnoreCase("Título de Eleitor")) {
            TelaInfoTitulo info = new TelaInfoTitulo();
            info.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PaginaUsuario pagina = new PaginaUsuario();
        pagina.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tfTelafoneIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelafoneIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTelafoneIActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InfoInstituicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfoInstituicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfoInstituicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoInstituicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InfoInstituicao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tfCidadeI;
    private javax.swing.JComboBox<String> tfDocumentos;
    private javax.swing.JTextField tfEmailI;
    private javax.swing.JTextField tfNomeI;
    private javax.swing.JTextField tfRuaI;
    private javax.swing.JTextField tfTelafoneI;
    // End of variables declaration//GEN-END:variables
}
