/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import com.FireWatch.classes.Usuario;
import com.FireWatch.classes.UsuarioLogado;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author User
 */
public class Perfil extends javax.swing.JFrame {

    /**
     * Creates new form Perfil
     */
    
    
    public Perfil() {
        initComponents();
        
        String nomeUsuario = UsuarioLogado.getInstance().getNomeUsuario();       
        Usuario usuario = new Usuario();
        usuario.setUsuario(nomeUsuario);
                
        try { 
            Usuario usu = usuario.BuscarUsu();
            
            if (usu !=null) {  
            nomePerfil.setText(nomeUsuario);
            nomePerfil.setEditable(false);
            Nomepf.setText(usu.getNome());
            Nomepf.setEditable(false);
            Telefonepf.setText(usu.getTelefone());
            Telefonepf.setEditable(false);
            Estadopf.setText(usu.getEstado());
            Estadopf.setEditable(false);
            Cidadepf.setText(usu.getCidade());
            Cidadepf.setEditable(false);
            }
        } catch (SQLException ex) {
                Logger.getLogger(Perfil.class.getName()).log(Level.SEVERE, null, ex);
            }  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Home = new javax.swing.JButton();
        Denuncia = new javax.swing.JButton();
        Queimadas = new javax.swing.JButton();
        Perfil = new javax.swing.JButton();
        AboutUs = new javax.swing.JButton();
        nomePerfil = new javax.swing.JTextField();
        btApagar = new javax.swing.JButton();
        Nomepf = new javax.swing.JTextField();
        Telefonepf = new javax.swing.JTextField();
        Estadopf = new javax.swing.JTextField();
        Cidadepf = new javax.swing.JTextField();
        btEditar = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(970, 625));
        getContentPane().setLayout(null);

        Home.setOpaque(false); // botão transparente
        Home.setContentAreaFilled(false); // Remove a cor de fundo
        Home.setBorderPainted(false); // Remove a borda
        Home.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Home.setText("HOME");
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
                timer = new javax.swing.Timer(18, e -> { //velocidade
                    int r = Math.max(123, Home.getForeground().getRed() - 10);
                    int g = Math.max(0, Home.getForeground().getGreen() - 10);
                    int b = Math.max(0, Home.getForeground().getBlue() - 10);
                    Home.setForeground(new java.awt.Color(r, g, b));
                    if (r <= 123 && g <= 0 && b <= 0) {
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
                timer = new javax.swing.Timer(18, e -> {
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
        Home.setBounds(10, 10, 120, 44);

        Denuncia.setOpaque(false);
        Denuncia.setContentAreaFilled(false);
        Denuncia.setBorderPainted(false);
        Denuncia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Denuncia.setText("DENUNCIE");
        Denuncia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Denuncia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenunciaActionPerformed(evt);
            }
        });
        Denuncia.setForeground(new java.awt.Color(221, 221, 221));

        Denuncia.addMouseListener(new java.awt.event.MouseAdapter() {
            private javax.swing.Timer timer;

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (timer !=null) {
                    timer.stop();
                }

                timer = new javax.swing.Timer(18, e -> {
                    int r = Math.max(123, Denuncia.getForeground().getRed() - 10);
                    int g = Math.max(0, Denuncia.getForeground().getGreen() - 10);
                    int b = Math.max(0, Denuncia.getForeground().getBlue() - 10);
                    Denuncia.setForeground(new java.awt.Color(r, g, b));
                    if (r <= 123 && g <= 0 && b <= 0) {
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
                    int r = Math.min(255, Denuncia.getForeground().getRed() + 10);
                    int g = Math.min(255, Denuncia.getForeground().getGreen() + 10);
                    int b = Math.min(255, Denuncia.getForeground().getBlue() + 10);
                    Denuncia.setForeground(new java.awt.Color(r, g, b));
                    if (r >= 221 && g >= 221 && b >= 221) {
                        timer.stop();
                    }
                });
                timer.start();
            }
        });
        getContentPane().add(Denuncia);
        Denuncia.setBounds(154, 10, 120, 44);

        Queimadas.setOpaque(false);
        Queimadas.setContentAreaFilled(false);
        Queimadas.setBorderPainted(false);
        Queimadas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Queimadas.setText("QUEIMADAS");
        Queimadas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Queimadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QueimadasActionPerformed(evt);
            }
        });
        Queimadas.setForeground(new java.awt.Color(221, 221, 221));

        Queimadas.addMouseListener(new java.awt.event.MouseAdapter() {
            private javax.swing.Timer timer;

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (timer !=null) {
                    timer.stop();
                }

                timer = new javax.swing.Timer(18, e -> {
                    int r = Math.max(123, Queimadas.getForeground().getRed() - 10);
                    int g = Math.max(0, Queimadas.getForeground().getGreen() - 10);
                    int b = Math.max(0, Queimadas.getForeground().getBlue() - 10);
                    Queimadas.setForeground(new java.awt.Color(r, g, b));
                    if (r <= 123 && g <= 0 && b <= 0) {
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
                    int r = Math.min(255, Queimadas.getForeground().getRed() + 10);
                    int g = Math.min(255, Queimadas.getForeground().getGreen() + 10);
                    int b = Math.min(255, Queimadas.getForeground().getBlue() + 10);
                    Queimadas.setForeground(new java.awt.Color(r, g, b));
                    if (r >= 221 && g >= 221 && b >= 221) {
                        timer.stop();
                    }
                });
                timer.start();
            }
        });
        getContentPane().add(Queimadas);
        Queimadas.setBounds(297, 10, 120, 44);

        Perfil.setOpaque(false); // botão transparente
        Perfil.setContentAreaFilled(false); // Remove a cor de fundo
        Perfil.setBorderPainted(false); // Remove a borda
        Perfil.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Perfil.setText("PERFIL");
        Perfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerfilActionPerformed(evt);
            }
        });
        Perfil.setForeground(new java.awt.Color(221, 221, 221));

        Perfil.addMouseListener(new java.awt.event.MouseAdapter() {
            private javax.swing.Timer timer; //animação

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (timer !=null) {
                    timer.stop();
                }
                //mudança de cor
                timer = new javax.swing.Timer(18, e -> { //velocidade
                    int r = Math.max(0, Perfil.getForeground().getRed() - 10);
                    int g = Math.max(0, Perfil.getForeground().getGreen() - 10);
                    int b = Math.max(0, Perfil.getForeground().getBlue() - 10);
                    Perfil.setForeground(new java.awt.Color(r, g, b));
                    if (r <= 0 && g <= 0 && b <= 0) {
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
                timer = new javax.swing.Timer(18, e -> {
                    int r = Math.min(255, Perfil.getForeground().getRed() + 10);
                    int g = Math.min(255, Perfil.getForeground().getGreen() + 10);
                    int b = Math.min(255, Perfil.getForeground().getBlue() + 10);
                    Perfil.setForeground(new java.awt.Color(r, g, b));
                    if (r >= 221 && g >= 221 && b >= 221) {
                        timer.stop();
                    }
                });
                timer.start();
            }
        });
        getContentPane().add(Perfil);
        Perfil.setBounds(585, 10, 120, 44);

        AboutUs.setOpaque(false);
        AboutUs.setContentAreaFilled(false);
        AboutUs.setBorderPainted(false);
        AboutUs.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AboutUs.setText("SOBRE NÓS");
        AboutUs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutUsActionPerformed(evt);
            }
        });
        AboutUs.setForeground(new java.awt.Color(221, 221, 221));

        AboutUs.addMouseListener(new java.awt.event.MouseAdapter() {
            private javax.swing.Timer timer;

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (timer !=null) {
                    timer.stop();
                }

                timer = new javax.swing.Timer(18, e -> {
                    int r = Math.max(123, AboutUs.getForeground().getRed() - 10);
                    int g = Math.max(0, AboutUs.getForeground().getGreen() - 10);
                    int b = Math.max(0, AboutUs.getForeground().getBlue() - 10);
                    AboutUs.setForeground(new java.awt.Color(r, g, b));
                    if (r <= 123 && g <= 0 && b <= 0) {
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
                    int r = Math.min(255, AboutUs.getForeground().getRed() + 10);
                    int g = Math.min(255, AboutUs.getForeground().getGreen() + 10);
                    int b = Math.min(255, AboutUs.getForeground().getBlue() + 10);
                    AboutUs.setForeground(new java.awt.Color(r, g, b));
                    if (r >= 221 && g >= 221 && b >= 221) {
                        timer.stop();
                    }
                });
                timer.start();
            }
        });
        getContentPane().add(AboutUs);
        AboutUs.setBounds(442, 10, 120, 44);

        nomePerfil.setBackground(new java.awt.Color(123, 0, 0));
        nomePerfil.setForeground(new java.awt.Color(221, 221, 221));
        nomePerfil.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        nomePerfil.setBorder(null);
        nomePerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomePerfilActionPerformed(evt);
            }
        });
        getContentPane().add(nomePerfil);
        nomePerfil.setBounds(347, 259, 320, 30);

        btApagar.setBackground(new java.awt.Color(0, 0, 0, 0));
        btApagar.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        btApagar.setForeground(new java.awt.Color(221, 221, 221));
        btApagar.setText("APAGAR CONTA");
        btApagar.setBorder(null);
        btApagar.setForeground(new java.awt.Color(221, 221, 221));

        btApagar.addMouseListener(new java.awt.event.MouseAdapter() {
            private javax.swing.Timer timer;

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (timer !=null) {
                    timer.stop();
                }

                timer = new javax.swing.Timer(18, e -> {
                    int r = Math.max(123, btApagar.getForeground().getRed() - 10);
                    int g = Math.max(0, btApagar.getForeground().getGreen() - 10);
                    int b = Math.max(0, btApagar.getForeground().getBlue() - 10);
                    btApagar.setForeground(new java.awt.Color(r, g, b));
                    if (r <= 123 && g <= 0 && b <= 0) {
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
                    int r = Math.min(255, btApagar.getForeground().getRed() + 10);
                    int g = Math.min(255, btApagar.getForeground().getGreen() + 10);
                    int b = Math.min(255, btApagar.getForeground().getBlue() + 10);
                    btApagar.setForeground(new java.awt.Color(r, g, b));
                    if (r >= 221 && g >= 221 && b >= 221) {
                        timer.stop();
                    }
                });
                timer.start();
            }
        });
        btApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btApagarActionPerformed(evt);
            }
        });
        getContentPane().add(btApagar);
        btApagar.setBounds(320, 510, 360, 40);

        Nomepf.setBackground(new java.awt.Color(123, 0, 0));
        Nomepf.setForeground(new java.awt.Color(221, 221, 221));
        Nomepf.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        Nomepf.setBorder(null);
        getContentPane().add(Nomepf);
        Nomepf.setBounds(347, 184, 320, 30);

        Telefonepf.setBackground(new java.awt.Color(123, 0, 0));
        Telefonepf.setForeground(new java.awt.Color(221, 221, 221));
        Telefonepf.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        Telefonepf.setBorder(null);
        Telefonepf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonepfActionPerformed(evt);
            }
        });
        getContentPane().add(Telefonepf);
        Telefonepf.setBounds(347, 334, 320, 30);

        Estadopf.setBackground(new java.awt.Color(123, 0, 0));
        Estadopf.setForeground(new java.awt.Color(221, 221, 221));
        Estadopf.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        Estadopf.setBorder(null);
        Estadopf.setHorizontalAlignment(Estadopf.CENTER);
        getContentPane().add(Estadopf);
        Estadopf.setBounds(331, 406, 82, 30);

        Cidadepf.setBackground(new java.awt.Color(123, 0, 0));
        Cidadepf.setForeground(new java.awt.Color(221, 221, 221));
        Cidadepf.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        Cidadepf.setBorder(null);
        Cidadepf.setHorizontalAlignment(Cidadepf.CENTER);
        getContentPane().add(Cidadepf);
        Cidadepf.setBounds(480, 410, 190, 23);

        btEditar.setOpaque(false); // botão transparente
        btEditar.setContentAreaFilled(false); // Remove a cor de fundo
        btEditar.setBorderPainted(false); // Remove a borda
        btEditar.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        btEditar.setText("EDITAR DADOS");
        btEditar.setForeground(new java.awt.Color(221, 221, 221));
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        btEditar.setForeground(new java.awt.Color(221, 221, 221));

        btEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            private javax.swing.Timer timer;

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (timer !=null) {
                    timer.stop();
                }

                timer = new javax.swing.Timer(18, e -> {
                    int r = Math.max(255, btEditar.getForeground().getRed() - 10);
                    int g = Math.max(145, btEditar.getForeground().getGreen() - 10);
                    int b = Math.max(77, btEditar.getForeground().getBlue() - 10);
                    btEditar.setForeground(new java.awt.Color(r, g, b));
                    if (r <= 255 && g <= 145 && b <= 77) {
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
                    int r = Math.min(255, btEditar.getForeground().getRed() + 10);
                    int g = Math.min(255, btEditar.getForeground().getGreen() + 10);
                    int b = Math.min(255, btEditar.getForeground().getBlue() + 10);
                    btEditar.setForeground(new java.awt.Color(r, g, b));
                    if (r >= 221 && g >= 221 && b >= 221) {
                        timer.stop();
                    }
                });
                timer.start();
            }
        });
        getContentPane().add(btEditar);
        btEditar.setBounds(320, 460, 360, 40);

        sair.setForeground(new java.awt.Color(221, 221, 221));
        sair.setBackground(new java.awt.Color(0, 0, 0));
        sair.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        sair.setText("SAIR");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        getContentPane().add(sair);
        sair.setBounds(470, 560, 79, 27);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Documentos\\NetBeansProjects\\A3_Testes\\src\\main\\resources\\images\\TelaPerfil.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 960, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        // TODO add your handling code here:
        int x = this.getLocation().x;
        int y = this.getLocation().y;

        Home home = new Home();
        home.setLocation(x,y);
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeActionPerformed

    private void DenunciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenunciaActionPerformed
        // TODO add your handling code here:
        //pega a posição atual da tela
        int x = this.getLocationOnScreen().x;
        int y = this.getLocationOnScreen().y;

        Denuncia denuncia = new Denuncia();
        denuncia.setLocation(x, y);
        denuncia.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DenunciaActionPerformed

    private void QueimadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QueimadasActionPerformed
        // TODO add your handling code here:
        int x = this.getLocation().x;
        int y = this.getLocation().y;
        
        Queimadas queimadas = new Queimadas();
        queimadas.setLocation(x, y);
        queimadas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_QueimadasActionPerformed

    private void AboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutUsActionPerformed
        // TODO add your handling code here:
        int x = this.getLocation().x;
        int y = this.getLocation().y;

        SobreNos sobreNos = new SobreNos();
        sobreNos.setLocation(x,y);
        sobreNos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AboutUsActionPerformed

    private void PerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PerfilActionPerformed

    private void btApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btApagarActionPerformed
        // TODO add your handling code here:
        int op = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja apagar a sua conta?", "Apagar?", JOptionPane.YES_NO_OPTION);
        
        if (op == 0) {
            String usu = UsuarioLogado.getInstance().getNomeUsuario();
            String senhacf = UsuarioLogado.getInstance().getSenhaUsuario();
            
            JPasswordField Jsenha = new JPasswordField();
            Object[] mensg = {"Cofirme a sua senha: ", Jsenha};
            int senhaap = JOptionPane.showConfirmDialog(null, mensg, "Confirmar", JOptionPane.OK_CANCEL_OPTION);
            String senhaconf = new String(Jsenha.getPassword());
            
            if (senhaap == 0) {
            
                if (senhacf.equals(senhaconf)) {
                    Usuario usuario = new Usuario();
                    usuario.setUsuario(usu);
                    try {
                        usuario.DeletarUsu();
                        JOptionPane.showMessageDialog(null, "Usuário deletado com sucesso!");
                        int x = this.getLocation().x;
                        int y = this.getLocation().y;

                        Login login = new Login();
                        login.setLocation(x, y);
                        login.setVisible(true);
                        this.dispose();

                    } catch (SQLException ex) {
                        Logger.getLogger(Perfil.class.getName()).log(Level.SEVERE, null, ex);
                    }           
                }else {
                    JOptionPane.showMessageDialog(null, "Senha incorreta!");
                }    
            } else {
                
            }
        }else if (op == 1) {
            
        }
    }//GEN-LAST:event_btApagarActionPerformed

    private void nomePerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomePerfilActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_nomePerfilActionPerformed

    private void TelefonepfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonepfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonepfActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        // TODO add your handling code here:
        JPasswordField Jsenha = new JPasswordField();
        Object[] mensg = {"Cofirme a sua senha: ", Jsenha};
        int senha = JOptionPane.showConfirmDialog(null, mensg, "Confirmar", JOptionPane.OK_CANCEL_OPTION);
        String senhaconf = new String(Jsenha.getPassword());
        
        String senhacf = UsuarioLogado.getInstance().getSenhaUsuario();
        
        if (senha == 0) {
        
            if (senhacf.equals(senhaconf)) {

                EditarPerfil ef = new EditarPerfil();
                ef.setLocationRelativeTo(null);
                ef.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Senha incorreta!");
            }
        } else {
            
        }
        
    }//GEN-LAST:event_btEditarActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        // TODO add your handling code here:
        int x = JOptionPane.showConfirmDialog(null, "Dejesa sair?", "sair", JOptionPane.YES_NO_OPTION);
        
        if (x == 0) {
            Login login = new Login();
            login.setVisible(true);
            this.dispose();
        } else {
            
        }
    }//GEN-LAST:event_sairActionPerformed

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
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AboutUs;
    private javax.swing.JTextField Cidadepf;
    private javax.swing.JButton Denuncia;
    private javax.swing.JTextField Estadopf;
    private javax.swing.JButton Home;
    private javax.swing.JTextField Nomepf;
    private javax.swing.JButton Perfil;
    private javax.swing.JButton Queimadas;
    private javax.swing.JTextField Telefonepf;
    private javax.swing.JButton btApagar;
    private javax.swing.JButton btEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField nomePerfil;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables
}