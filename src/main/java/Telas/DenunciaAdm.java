/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import com.FireWatch.DAO.ConnectionFactory;
import com.FireWatch.classes.Denuncias;
import java.awt.Desktop;
import java.net.URI;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class DenunciaAdm extends javax.swing.JFrame {

    /**
     * Creates new form DenunciaAdm
     */
    public DenunciaAdm() {
        initComponents();
        
        
        
        String cidade = txtcidade.getText();
        String sql = "";
        
        DefaultTableModel model = new DefaultTableModel
            (new String[]{"ID", "Estado", "Cidade", "Endereço", "Número ou Km", "Data", "Hora", "Gravidade"},0) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                    }
        };
        
            sql = "SELECT * FROM tb_denuncias ORDER BY numden DESC";
        
        ConnectionFactory cf = new ConnectionFactory();
        
        try(Connection conn = cf.obtemConexao();
                PreparedStatement ps = conn.prepareStatement(sql);) {
            if (!"".equals(cidade)) {
                ps.setString(1, cidade);
            }
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                int txtid = rs.getInt("numden");
                String txtestado = rs.getString("estadoden");
                String txtcidade = rs.getString("cidadeden");
                String txtrua = rs.getString("endeden");
                String txtnum = rs.getString("numeden");
                String txtdata = rs.getString("dataden");
                String txthora = rs.getString("horaden");
                String txtgrav = rs.getString("gravden");
                
                model.addRow(new Object[]{txtid, txtestado, txtcidade, txtrua, txtnum, txtdata, txthora, txtgrav});
                        
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Não localizado!");
        }    
        
        tabela.setModel(model);
    }
    
        public static void abrirGoogleMaps(String endereco) {
    try {
        String enderecoCodificado = URLEncoder.encode(endereco, "UTF-8");
        String url = "https://www.google.com/maps/search/?api=1&query=" + enderecoCodificado;

        if (Desktop.isDesktopSupported()) {
            Desktop.getDesktop().browse(new URI(url));
            System.out.println("Abrindo o google maps!");
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível abrir o navegador!");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro ao abrir o Google Maps: " + e.getMessage());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        txtcidade = new javax.swing.JTextField();
        listar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        Home = new javax.swing.JButton();
        botaoDeletar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(975, 633));
        setPreferredSize(new java.awt.Dimension(0, 0));
        setResizable(false);
        getContentPane().setLayout(null);

        tabela.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Estado", "Cidade", "Rua", "Número ou KM", "Data", "Hora", "Gravidade"
            }
        ) {

            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tabela);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 180, 920, 350);

        txtcidade.setBackground(new java.awt.Color(244, 244, 244));
        txtcidade.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        txtcidade.setBorder(null);
        getContentPane().add(txtcidade);
        txtcidade.setBounds(70, 118, 600, 30);

        listar.setOpaque(false);
        listar.setContentAreaFilled(false);
        listar.setBorderPainted(false);
        listar.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        listar.setText("LISTAR");
        listar.setBorder(null);
        listar.setForeground(new java.awt.Color(221, 221, 221));

        listar.addMouseListener(new java.awt.event.MouseAdapter() {
            private javax.swing.Timer timer;

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (timer !=null) {
                    timer.stop();
                }

                timer = new javax.swing.Timer(18, e -> {
                    int r = Math.max(123, listar.getForeground().getRed() - 10);
                    int g = Math.max(0, listar.getForeground().getGreen() - 10);
                    int b = Math.max(0, listar.getForeground().getBlue() - 10);
                    listar.setForeground(new java.awt.Color(r, g, b));
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
                    int r = Math.min(255, listar.getForeground().getRed() + 10);
                    int g = Math.min(255, listar.getForeground().getGreen() + 10);
                    int b = Math.min(255, listar.getForeground().getBlue() + 10);
                    listar.setForeground(new java.awt.Color(r, g, b));
                    if (r >= 221 && g >= 221 && b >= 221) {
                        timer.stop();
                    }
                });
                timer.start();
            }
        });
        listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarActionPerformed(evt);
            }
        });
        getContentPane().add(listar);
        listar.setBounds(720, 107, 170, 50);

        buscar.setOpaque(false);
        buscar.setContentAreaFilled(false);
        buscar.setBorderPainted(false);
        buscar.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        buscar.setText("BUSCAR ENDEREÇO");
        buscar.setForeground(new java.awt.Color(221, 221, 221));

        buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            private javax.swing.Timer timer;

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (timer !=null) {
                    timer.stop();
                }

                timer = new javax.swing.Timer(18, e -> {
                    int r = Math.max(123, buscar.getForeground().getRed() - 10);
                    int g = Math.max(0, buscar.getForeground().getGreen() - 10);
                    int b = Math.max(0, buscar.getForeground().getBlue() - 10);
                    buscar.setForeground(new java.awt.Color(r, g, b));
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
                    int r = Math.min(255, buscar.getForeground().getRed() + 10);
                    int g = Math.min(255, buscar.getForeground().getGreen() + 10);
                    int b = Math.min(255, buscar.getForeground().getBlue() + 10);
                    buscar.setForeground(new java.awt.Color(r, g, b));
                    if (r >= 221 && g >= 221 && b >= 221) {
                        timer.stop();
                    }
                });
                timer.start();
            }
        });
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar);
        buscar.setBounds(370, 538, 220, 50);

        Home.setOpaque(false); // botão transparente
        Home.setContentAreaFilled(false); // Remove a cor de fundo
        Home.setBorderPainted(false); // Remove a borda
        Home.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Home.setText("SAIR");
        Home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Home.setForeground(new java.awt.Color(221, 221, 221));
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
                    int r = Math.min(221, Home.getForeground().getRed() + 10);
                    int g = Math.min(221, Home.getForeground().getGreen() + 10);
                    int b = Math.min(221, Home.getForeground().getBlue() + 10);
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

        botaoDeletar.setOpaque(false);
        botaoDeletar.setContentAreaFilled(false);
        botaoDeletar.setBorderPainted(false);
        botaoDeletar.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        botaoDeletar.setText("DELETAR");
        botaoDeletar.setForeground(new java.awt.Color(221, 221, 221));

        botaoDeletar.addMouseListener(new java.awt.event.MouseAdapter() {
            private javax.swing.Timer timer;

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (timer !=null) {
                    timer.stop();
                }

                timer = new javax.swing.Timer(18, e -> {
                    int r = Math.max(123, botaoDeletar.getForeground().getRed() - 10);
                    int g = Math.max(0, botaoDeletar.getForeground().getGreen() - 10);
                    int b = Math.max(0, botaoDeletar.getForeground().getBlue() - 10);
                    botaoDeletar.setForeground(new java.awt.Color(r, g, b));
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
                    int r = Math.min(255, botaoDeletar.getForeground().getRed() + 10);
                    int g = Math.min(255, botaoDeletar.getForeground().getGreen() + 10);
                    int b = Math.min(255, botaoDeletar.getForeground().getBlue() + 10);
                    botaoDeletar.setForeground(new java.awt.Color(r, g, b));
                    if (r >= 221 && g >= 221 && b >= 221) {
                        timer.stop();
                    }
                });
                timer.start();
            }
        });
        botaoDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDeletarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoDeletar);
        botaoDeletar.setBounds(672, 538, 220, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Documentos\\NetBeansProjects\\A3_Testes\\src\\main\\resources\\images\\DenunciaAdm.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 960, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarActionPerformed
        // TODO add your handling code here:

        String cidade = txtcidade.getText();
        String sql = "";

        DefaultTableModel model = new DefaultTableModel
        (new String[]{"ID", "Estado", "Cidade", "Endereço", "Número ou Km", "Data", "Hora", "Gravidade"},0) {

            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        if ("".equals(cidade))
        sql = "SELECT * FROM tb_denuncias ORDER BY numden DESC";
        else
        sql = "SELECT * FROM tb_denuncias WHERE cidadeden LIKE ? OR estadoden LIKE ? OR endeden LIKE ? OR dataden LIKE ? OR gravden LIKE ? ORDER BY numden DESC";

        ConnectionFactory cf = new ConnectionFactory();

        try(Connection conn = cf.obtemConexao();
            PreparedStatement ps = conn.prepareStatement(sql);) {
            if (!"".equals(cidade)) {

                String procurar = "%" + cidade + "%";

                ps.setString(1, procurar);
                ps.setString(2, procurar);
                ps.setString(3, procurar);
                ps.setString(4, procurar);
                ps.setString(5, procurar);

            }
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int txtid = rs.getInt("numden");
                String txtestado = rs.getString("estadoden");
                String txtcidade = rs.getString("cidadeden");
                String txtrua = rs.getString("endeden");
                String txtnum = rs.getString("numeden");
                String txtdata = rs.getString("dataden");
                String txthora = rs.getString("horaden");
                String txtgrav = rs.getString("gravden");

                model.addRow(new Object[]{txtid, txtestado, txtcidade, txtrua, txtnum, txtdata, txthora, txtgrav});

            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Não localizado!");
        }

        tabela.setModel(model);
    }//GEN-LAST:event_listarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
        int linhaSelec = tabela.getSelectedRow();

        if (linhaSelec == -1) {
            JOptionPane.showMessageDialog(null, "Por favor, selecione uma coluna!");
            return;
        }

        String rua = (String) tabela.getValueAt(linhaSelec, 3);
        String num = (String) tabela.getValueAt(linhaSelec, 4);
        String cidade = (String) tabela.getValueAt(linhaSelec, 2);
        String estado = (String) tabela.getValueAt(linhaSelec, 1);

        String endereco = rua + ", " + num + ", " + cidade + ", " + estado;

        abrirGoogleMaps(endereco);
    }//GEN-LAST:event_buscarActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        // TODO add your handling code here:
        int x = this.getLocation().x;
        int y = this.getLocation().y;

        TelaAdm ta = new TelaAdm();
        ta.setLocation(x,y);
        ta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeActionPerformed

    private void botaoDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDeletarActionPerformed
        // TODO add your handling code here:

        int x = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja deletar essa denúncia?", "deletar", JOptionPane.YES_NO_OPTION);

        if (x==0) {
            int linhaSelecionada = tabela.getSelectedRow(); // Obter a linha selecionada
            if (linhaSelecionada != -1) { // Verifica se há uma linha selecionada
                int codDenu = Integer.parseInt(tabela.getValueAt(linhaSelecionada, 0).toString()); // Obter o valor da 3ª coluna
                Denuncias usuario = new Denuncias();
                usuario.setNum(codDenu);
                try {
                    usuario.DeletarDen();
                } catch (SQLException ex) {
                    Logger.getLogger(DenunciaAdm.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(null, "Denúncia " + codDenu + " deletada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, selecione uma denúncia na tabela.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {

        }

    }//GEN-LAST:event_botaoDeletarActionPerformed

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
            java.util.logging.Logger.getLogger(DenunciaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DenunciaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DenunciaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DenunciaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DenunciaAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Home;
    private javax.swing.JButton botaoDeletar;
    private javax.swing.JButton buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listar;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtcidade;
    // End of variables declaration//GEN-END:variables
}