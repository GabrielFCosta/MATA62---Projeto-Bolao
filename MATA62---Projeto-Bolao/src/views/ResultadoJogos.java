
package views;

import controller.ControladorApostador;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author FABIO
 */
public class ResultadoJogos extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarFunc
     */
    public ResultadoJogos() {
        initComponents();
        setIcon();
        jCampoMat.setDocument(new Documento2()); 
        jCampoPesqMat.setDocument(new Documento2());
        desabilitarBotoes();
        desabilitarCampos();
    }
private void desabilitarBotoes(){
    BtnNovo.setEnabled(true);
    BtnSalvar.setEnabled(false);
    BtnCancelar.setEnabled(false);
    jBtnExcluir.setEnabled(false);
    
   
   } 
   
   private void habilitarBotoes(){
    BtnNovo.setEnabled(false);
    BtnSalvar.setEnabled(true);
    BtnCancelar.setEnabled(true);
   }
   private void desabilitarCampos(){
    jCampoNome.setEnabled(false);
    jCampoMat.setEnabled(false);
    jCampoSetor.setEnabled(false);
    jCampoCargo.setEnabled(false);
    jCampoSenhaFunc.setEnabled(false);
    jCampoNome.setText("");
    jCampoMat.setText("");
    jCampoSetor.setText("");
    jCampoCargo.setText("");
    jCampoSenhaFunc.setText("");
   } 
   
   private void habilitarCampos(){
   jCampoNome.setEnabled(true);
    jCampoMat.setEnabled(true);
    jCampoSetor.setEnabled(true);
    jCampoCargo.setEnabled(true);
    jCampoSenhaFunc.setEnabled(true);
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCampoPesqMat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jCampoFunc = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jCampoPesqMat1 = new javax.swing.JTextField();
        jCampoPesqMat2 = new javax.swing.JTextField();
        jCampoPesqMat3 = new javax.swing.JTextField();
        jCampoPesqMat4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jCampoPesqMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCampoPesqMatActionPerformed(evt);
            }
        });

        jLabel7.setText("Jogo");

        jLabel8.setText("Apostas");

        jButton1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jCampoFunc.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCampoFunc.setForeground(new java.awt.Color(0, 0, 204));
        jCampoFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCampoFuncActionPerformed(evt);
            }
        });

        jLabel10.setText("RESULTADOS DE APOSTAS");

        jLabel11.setText("Placar");

        jCampoPesqMat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCampoPesqMat1ActionPerformed(evt);
            }
        });

        jCampoPesqMat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCampoPesqMat2ActionPerformed(evt);
            }
        });

        jCampoPesqMat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCampoPesqMat3ActionPerformed(evt);
            }
        });

        jCampoPesqMat4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCampoPesqMat4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCampoPesqMat2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)
                                .addGap(113, 113, 113))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel7))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCampoPesqMat1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCampoPesqMat, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCampoPesqMat3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCampoPesqMat4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jCampoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(49, 49, 49))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel10)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCampoPesqMat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCampoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jCampoPesqMat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCampoPesqMat4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCampoPesqMat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCampoPesqMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(216, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCampoPesqMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCampoPesqMatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCampoPesqMatActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String mat = jCampoPesqMat.getText();
    int campopesqMat = Integer.parseInt(mat);
    ControladorApostador.pesquisa_Funcionario(campopesqMat,jCampoFunc.getText());
    jBtnExcluir.setEnabled(true);
    
    
    
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCampoFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCampoFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCampoFuncActionPerformed

    private void jCampoPesqMat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCampoPesqMat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCampoPesqMat1ActionPerformed

    private void jCampoPesqMat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCampoPesqMat2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCampoPesqMat2ActionPerformed

    private void jCampoPesqMat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCampoPesqMat3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCampoPesqMat3ActionPerformed

    private void jCampoPesqMat4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCampoPesqMat4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCampoPesqMat4ActionPerformed

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
            java.util.logging.Logger.getLogger(ResultadoJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultadoJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultadoJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultadoJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResultadoJogos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    public static javax.swing.JTextField jCampoFunc;
    private javax.swing.JTextField jCampoPesqMat;
    private javax.swing.JTextField jCampoPesqMat1;
    private javax.swing.JTextField jCampoPesqMat2;
    private javax.swing.JTextField jCampoPesqMat3;
    private javax.swing.JTextField jCampoPesqMat4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
         
        this.setIconImage(new ImageIcon(getClass().getResource("/janelas/relogio_ponto.png")).getImage());
    }
    
   
}
class Documento2 extends PlainDocument{

      public void insertString(int offs, String str, AttributeSet a)throws BadLocationException {
          int tamanho= (this.getLength()+ str.length());
          if(tamanho<=7){
             super.insertString(offs, str.replaceAll("[aA-zZ]", ""), a);
          }
          else{    
            super.insertString(offs, str.replaceAll("[aA0-zZ9]", ""), a);
          }
      }

      
}