/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

/**
 *
 * @author User
 */
public class TelaAdm extends javax.swing.JFrame {

    /**
     * Creates new form TelaAdm
     */
    public TelaAdm() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(970, 635));
        setPreferredSize(new java.awt.Dimension(975, 630));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton2.setOpaque(false); // botão transparente
        jButton2.setContentAreaFilled(false); // Remove a cor de fundo
        jButton2.setBorderPainted(false);
        jButton2.setBackground(new java.awt.Color(255, 145, 77));
        jButton2.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jButton2.setText("ACESSAR");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setForeground(new java.awt.Color(221, 221, 221));

        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            private javax.swing.Timer timer;

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (timer !=null) {
                    timer.stop();
                }

                timer = new javax.swing.Timer(18, e -> {
                    int r = Math.max(0, jButton2.getForeground().getRed() - 10);
                    int g = Math.max(0, jButton2.getForeground().getGreen() - 10);
                    int b = Math.max(0, jButton2.getForeground().getBlue() - 10);
                    jButton2.setForeground(new java.awt.Color(r, g, b));
                    if (r <= 0 && g <= 0 && b <= 0) {
                        timer.stop();
                    }
                });
                timer.start();
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {

                if (timer != null) {
                    timer.stop();
                }
                // Timer para a animação de volta à cor original
                timer = new javax.swing.Timer(18, e -> {
                    int r = Math.min(255, jButton2.getForeground().getRed() + 10);
                    int g = Math.min(255, jButton2.getForeground().getGreen() + 10);
                    int b = Math.min(255, jButton2.getForeground().getBlue() + 10);
                    jButton2.setForeground(new java.awt.Color(r, g, b));
                    if (r >= 221 && g >= 221 && b >= 221) {
                        timer.stop();
                    }
                });
                timer.start();
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(496, 286, 360, 40);

        jButton3.setOpaque(false); // botão transparente
        jButton3.setContentAreaFilled(false); // Remove a cor de fundo
        jButton3.setBorderPainted(false);
        jButton3.setBackground(new java.awt.Color(255, 145, 77));
        jButton3.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jButton3.setText("ACESSAR");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setForeground(new java.awt.Color(221, 221, 221));

        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            private javax.swing.Timer timer;

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (timer !=null) {
                    timer.stop();
                }

                timer = new javax.swing.Timer(18, e -> {
                    int r = Math.max(0, jButton3.getForeground().getRed() - 10);
                    int g = Math.max(0, jButton3.getForeground().getGreen() - 10);
                    int b = Math.max(0, jButton3.getForeground().getBlue() - 10);
                    jButton3.setForeground(new java.awt.Color(r, g, b));
                    if (r <= 0 && g <= 0 && b <= 0) {
                        timer.stop();
                    }
                });
                timer.start();
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {

                if (timer != null) {
                    timer.stop();
                }
                // Timer para a animação de volta à cor original
                timer = new javax.swing.Timer(18, e -> {
                    int r = Math.min(255, jButton3.getForeground().getRed() + 10);
                    int g = Math.min(255, jButton3.getForeground().getGreen() + 10);
                    int b = Math.min(255, jButton3.getForeground().getBlue() + 10);
                    jButton3.setForeground(new java.awt.Color(r, g, b));
                    if (r >= 221 && g >= 221 && b >= 221) {
                        timer.stop();
                    }
                });
                timer.start();
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(496, 404, 360, 40);

        jButton4.setOpaque(false); // botão transparente
        jButton4.setContentAreaFilled(false); // Remove a cor de fundo
        jButton4.setBorderPainted(false);
        jButton4.setBackground(new java.awt.Color(255, 145, 77));
        jButton4.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jButton4.setText("ACESSAR");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setForeground(new java.awt.Color(221, 221, 221));

        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            private javax.swing.Timer timer;

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (timer !=null) {
                    timer.stop();
                }

                timer = new javax.swing.Timer(18, e -> {
                    int r = Math.max(0, jButton4.getForeground().getRed() - 10);
                    int g = Math.max(0, jButton4.getForeground().getGreen() - 10);
                    int b = Math.max(0, jButton4.getForeground().getBlue() - 10);
                    jButton4.setForeground(new java.awt.Color(r, g, b));
                    if (r <= 0 && g <= 0 && b <= 0) {
                        timer.stop();
                    }
                });
                timer.start();
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {

                if (timer != null) {
                    timer.stop();
                }
                // Timer para a animação de volta à cor original
                timer = new javax.swing.Timer(18, e -> {
                    int r = Math.min(255, jButton4.getForeground().getRed() + 10);
                    int g = Math.min(255, jButton4.getForeground().getGreen() + 10);
                    int b = Math.min(255, jButton4.getForeground().getBlue() + 10);
                    jButton4.setForeground(new java.awt.Color(r, g, b));
                    if (r >= 221 && g >= 221 && b >= 221) {
                        timer.stop();
                    }
                });
                timer.start();
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(496, 521, 360, 40);

        jButton1.setOpaque(false); // botão transparente
        jButton1.setContentAreaFilled(false); // Remove a cor de fundo
        jButton1.setBorderPainted(false);
        jButton1.setBackground(new java.awt.Color(255, 145, 77));
        jButton1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jButton1.setText("ACESSAR");
        jButton1.setBorder(null);
        jButton1.setForeground(new java.awt.Color(221, 221, 221));
        jButton1.setBorderPainted(false);
        jButton1.setForeground(new java.awt.Color(221, 221, 221));

        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            private javax.swing.Timer timer;

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (timer !=null) {
                    timer.stop();
                }

                timer = new javax.swing.Timer(18, e -> {
                    int r = Math.max(0, jButton1.getForeground().getRed() - 10);
                    int g = Math.max(0, jButton1.getForeground().getGreen() - 10);
                    int b = Math.max(0, jButton1.getForeground().getBlue() - 10);
                    jButton1.setForeground(new java.awt.Color(r, g, b));
                    if (r <= 0 && g <= 0 && b <= 0) {
                        timer.stop();
                    }
                });
                timer.start();
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {

                if (timer != null) {
                    timer.stop();
                }
                // Timer para a animação de volta à cor original
                timer = new javax.swing.Timer(18, e -> {
                    int r = Math.min(255, jButton1.getForeground().getRed() + 10);
                    int g = Math.min(255, jButton1.getForeground().getGreen() + 10);
                    int b = Math.min(255, jButton1.getForeground().getBlue() + 10);
                    jButton1.setForeground(new java.awt.Color(r, g, b));
                    if (r >= 221 && g >= 221 && b >= 221) {
                        timer.stop();
                    }
                });
                timer.start();
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(496, 170, 360, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Documentos\\NetBeansProjects\\A3_Testes\\src\\main\\resources\\images\\TelaAdm.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 960, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int x = this.getLocation().x;
        int y = this.getLocation().y;
        
        ListagemAdm la = new ListagemAdm();
        la.setVisible(true);
        la.setLocation(x, y);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int x = this.getLocation().x;
        int y = this.getLocation().y;
        
        DenunciaAdm da = new DenunciaAdm();
        da.setVisible(true);
        da.setLocation(x,y);
        this.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int x = this.getLocation().x;
        int y = this.getLocation().y;
        
        DenAdm den = new DenAdm();
        den.setVisible(true);
        den.setLocation(x,y);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:      
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}