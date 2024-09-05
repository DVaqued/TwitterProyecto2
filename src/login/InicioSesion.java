/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;

import javax.swing.JOptionPane;

/**
 *
 * @author angel
 */
public class InicioSesion extends javax.swing.JFrame {

    /**
     * Creates new form InicioSesion
     */
    private String usuarioA;
   
    
    public InicioSesion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cerrarSesion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textTweets = new javax.swing.JTextPane();
        usuarioActual = new javax.swing.JLabel();
        perfil = new javax.swing.JButton();
        publicarTwit = new javax.swing.JButton();
        hashtags = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtweetfield = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        fotoperfil = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Twitter");
        jLabel1.setToolTipText("");

        cerrarSesion.setText("Cerrar sesion");
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_twitter/twitter-removebg-preview (1).png"))); // NOI18N
        jLabel2.setText("jLabel2");

        textTweets.setEditable(false);
        textTweets.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textTweetsKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(textTweets);

        usuarioActual.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usuarioActual.setText(usuario.usuarioSesion);

        perfil.setText("Perfil");
        perfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                perfilMouseClicked(evt);
            }
        });
        perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilActionPerformed(evt);
            }
        });

        publicarTwit.setText("Publicar Twit");

        hashtags.setText("Hashtags");
        hashtags.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hashtagsActionPerformed(evt);
            }
        });

        jLabel3.setText("Twitter Timeline");

        jtweetfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtweetfieldActionPerformed(evt);
            }
        });
        jtweetfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtweetfieldKeyTyped(evt);
            }
        });

        jButton1.setText("Publicar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        fotoperfil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fotoperfilKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 306, Short.MAX_VALUE)
                        .addComponent(cerrarSesion)
                        .addGap(86, 86, 86))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(publicarTwit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(hashtags))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(perfil)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(fotoperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(usuarioActual))))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtweetfield, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(cerrarSesion))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                            .addComponent(jtweetfield))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fotoperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(usuarioActual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(perfil)
                        .addGap(18, 18, 18)
                        .addComponent(publicarTwit)
                        .addGap(18, 18, 18)
                        .addComponent(hashtags)))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        // TODO add your handling code here:
        VentanaIncioSesion v = new VentanaIncioSesion();

        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cerrarSesionActionPerformed

    private void hashtagsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hashtagsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hashtagsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  if(jtweetfield.getText().length()>=140){
         JOptionPane.showMessageDialog(null,"NO se puede publicar este tweet");
         }else{
       String tweet=jtweetfield.getText();
     inicioTwitter InT=new inicioTwitter("carlos",tweet);
        InT.mensajeTweet();
       textTweets.setText(InT.mensajeTweet());    
          
  }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_perfilActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       
    
    }//GEN-LAST:event_jButton1MouseClicked

    private void jtweetfieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtweetfieldKeyTyped
     if(jtweetfield.getText().length()>=140){
     evt.consume();
     JOptionPane.showMessageDialog(null,"Excediste los 140 caracteres.");
     
     }
     
    }//GEN-LAST:event_jtweetfieldKeyTyped

    private void jtweetfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtweetfieldActionPerformed
  
       
    }//GEN-LAST:event_jtweetfieldActionPerformed

    private void textTweetsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTweetsKeyTyped
   
    }//GEN-LAST:event_textTweetsKeyTyped

    private void perfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_perfilMouseClicked
       perfil ventanaP=new perfil();
       ventanaP.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_perfilMouseClicked

    private void fotoperfilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fotoperfilKeyTyped
      usuario us=new usuario();
     
    }//GEN-LAST:event_fotoperfilKeyTyped
    public void setUsuarioActual(String usuarioA) {
        this.usuarioA = usuarioA;
        usuarioActual.setText(usuarioA);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerrarSesion;
    private javax.swing.JLabel fotoperfil;
    private javax.swing.JButton hashtags;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jtweetfield;
    private javax.swing.JButton perfil;
    private javax.swing.JButton publicarTwit;
    private javax.swing.JTextPane textTweets;
    private javax.swing.JLabel usuarioActual;
    // End of variables declaration//GEN-END:variables

  
}
