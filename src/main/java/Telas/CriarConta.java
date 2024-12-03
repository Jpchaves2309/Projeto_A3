/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import com.FireWatch.DAO.ConnectionFactory;
import com.FireWatch.classes.Usuario;
import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.text.MaskFormatter;


/**
 *
 * @author User
 */
public class CriarConta extends javax.swing.JFrame {

    /**
     * Creates new form CriarConta
     */
    public CriarConta() {
        initComponents();
        //máscara do telefone
        try {
        // Cria a máscara para o formato (xx)xxxx-xxxx
        MaskFormatter mascara = new MaskFormatter("(##)#####-####");
        mascara.setPlaceholderCharacter('_');  // Preenche com _ os campos vazios

        // Aplica a máscara
        Telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(mascara));
        
        } catch (Exception e) {
        e.printStackTrace();
        }
       
        //tela centralizada
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

        LoginInput = new javax.swing.JTextField();
        Nome = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        Senha = new javax.swing.JPasswordField();
        VoltarLogin = new javax.swing.JButton();
        Home = new javax.swing.JButton();
        Cidade = new javax.swing.JTextField();
        Telefone = new javax.swing.JFormattedTextField();
        Estado = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        LoginInput.setBackground(new java.awt.Color(123, 0, 0));
        LoginInput.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        LoginInput.setBorder(null);
        LoginInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginInputActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(690, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        Nome.setBackground(new java.awt.Color(123, 0, 0));
        Nome.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        Nome.setBorder(null);
        Nome.setForeground(new java.awt.Color(221, 221, 221));
        Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeActionPerformed(evt);
            }
        });
        getContentPane().add(Nome);
        Nome.setBounds(170, 212, 330, 30);

        Email.setBackground(new java.awt.Color(123, 0, 0));
        Email.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        Email.setBorder(null);
        Email.setForeground(new java.awt.Color(221, 221, 221));
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        getContentPane().add(Email);
        Email.setBounds(170, 290, 330, 30);

        Senha.setForeground(new java.awt.Color(221, 221, 221));
        Senha.setBackground(new java.awt.Color(123, 0, 0));
        Senha.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        Senha.setBorder(null);
        Senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhaActionPerformed(evt);
            }
        });
        getContentPane().add(Senha);
        Senha.setBounds(170, 512, 310, 30);

        VoltarLogin.setForeground(new java.awt.Color(221, 221, 221));
        VoltarLogin.setBackground(new java.awt.Color(123, 0, 0));
        VoltarLogin.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        VoltarLogin.setText("VOLTAR");
        VoltarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarLoginActionPerformed(evt);
            }
        });
        getContentPane().add(VoltarLogin);
        VoltarLogin.setBounds(297, 620, 79, 27);

        Home.setOpaque(false); // botão transparente
        Home.setContentAreaFilled(false); // Remove a cor de fundo
        Home.setBorderPainted(false); // Remove a borda
        Home.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Home.setText("CONFIRMAR");
        Home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        Home.setForeground(new java.awt.Color(221, 221, 221));

        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            private javax.swing.Timer timer; //animação

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (timer !=null) {
                    timer.stop();
                }
                //mudança de cor
                timer = new javax.swing.Timer(21, e -> { //velocidade
                    int r = Math.max(123, Home.getForeground().getRed() - 10);
                    int g = Math.max(230, Home.getForeground().getGreen() - 10);
                    int b = Math.max(76, Home.getForeground().getBlue() - 10);
                    Home.setForeground(new java.awt.Color(r, g, b));
                    if (r <= 123 && g <= 230 && b <= 76) {
                        timer.stop(); // Para o timer quando a cor preta for atingida
                    }
                });
                timer.start(); // Começa a animação
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {

                if (timer != null) {
                    timer.stop();
                }
                // Timer para a animação de volta à cor original
                timer = new javax.swing.Timer(21, e -> {
                    int r = Math.min(255, Home.getForeground().getRed() + 10);
                    int g = Math.min(255, Home.getForeground().getGreen() + 10);
                    int b = Math.min(255, Home.getForeground().getBlue() + 10);
                    Home.setForeground(new java.awt.Color(r, g, b));
                    if (r >= 221 && g >= 221 && b >= 221) {
                        timer.stop();
                    }
                });
                timer.start();
            }
        });
        getContentPane().add(Home);
        Home.setBounds(198, 565, 280, 40);

        Cidade.setBackground(new java.awt.Color(123, 0, 0));
        Cidade.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        Cidade.setBorder(null);
        Cidade.setForeground(new java.awt.Color(221, 221, 221));
        Cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CidadeActionPerformed(evt);
            }
        });
        getContentPane().add(Cidade);
        Cidade.setBounds(330, 439, 170, 30);

        Telefone.setBackground(new java.awt.Color(123, 0, 0));
        Telefone.setForeground(new java.awt.Color(221, 221, 221));
        Telefone.setBorder(null);
        Telefone.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        getContentPane().add(Telefone);
        Telefone.setBounds(172, 374, 330, 22);

        Estado.setBackground(new java.awt.Color(123, 0, 0));
        Estado.setForeground(new java.awt.Color(221, 221, 221));
        Estado.setBorder(null);
        Estado.setHorizontalAlignment(Estado.CENTER);
        Estado.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        getContentPane().add(Estado);
        Estado.setBounds(170, 440, 80, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Documentos\\NetBeansProjects\\A3_Testes\\src\\main\\resources\\images\\TelaCriarConta.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -20, 680, 710);

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(490, 510, 30, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents



    private void NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeActionPerformed

    private void LoginInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginInputActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void CidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CidadeActionPerformed

    private void VoltarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarLoginActionPerformed
        // TODO add your handling code here:
        
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VoltarLoginActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        // TODO add your handling code here:              
            String nomeusu = Nome.getText();
            String usuario = Email.getText();
            String foneusu = Telefone.getText();
            String estadousu = Estado.getText();
            String cidadeusu = Cidade.getText();
            String senhausu = new String(Senha.getPassword());
            
            if ("".equals(nomeusu) | "".equals(usuario) | "".equals(foneusu) | "".equals(estadousu) | "".equals(cidadeusu) | "".equals(senhausu)) {
                JOptionPane.showMessageDialog(null, "Campos obrigatórios não preenchidos!");
            } else {
        
                Usuario usu = new Usuario();
                usu.setNome(nomeusu);
                usu.setUsuario(usuario);
                usu.setTelefone(foneusu);
                usu.setEstado(estadousu);
                usu.setCidade(cidadeusu);
                usu.setSenha(senhausu);
        
                try {
                    if (usu.CriarUsu()) {
                        JOptionPane.showMessageDialog(null, "Usuário criado com sucesso!");
                        int x = this.getLocation().x;
                        int y = this.getLocation().y;
                
                        Login login = new Login();
                        login.setLocation(x, y);
                        login.setVisible(true);
                        this.dispose();
                    
                    }else {
                        JOptionPane.showMessageDialog(null, "Nome de usuário já está sendo utilizado!" + "\n" + "Caso o erro persista, entre em contato com os administradores.");
                    }
                }
                catch (SQLException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }  
        
                ConnectionFactory cf = new ConnectionFactory();
                cf.obtemConexao();
            }  
    }//GEN-LAST:event_HomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (Senha.getEchoChar() != '\u0000') {
            Senha.setEchoChar('\u0000');
        }else {
            Senha.setEchoChar('*');
        }
        if (Nome.getText()==null) 
        System.out.println(Nome.getText());
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SenhaActionPerformed

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
            java.util.logging.Logger.getLogger(CriarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CriarConta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cidade;
    private javax.swing.JTextField Email;
    private javax.swing.JFormattedTextField Estado;
    private javax.swing.JButton Home;
    private javax.swing.JTextField LoginInput;
    private javax.swing.JTextField Nome;
    private javax.swing.JPasswordField Senha;
    private javax.swing.JFormattedTextField Telefone;
    private javax.swing.JButton VoltarLogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}