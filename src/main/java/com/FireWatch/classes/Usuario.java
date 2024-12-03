package com.FireWatch.classes;
import com.FireWatch.DAO.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Usuario {
    private int codigo;
    private String nome;
    private String usuario;
    private String senha;
    private String email;
    private String telefone;
    private String estado;
    private String cidade;
    private boolean tpUsuario;

    public Usuario() {
        
    }

    public Usuario(String nome, String usuario, String senha, String email, String telefone, String estado, String cidade, boolean tpUsuario) {
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
        this.email = email;
        this.telefone = telefone;
        this.estado = estado;
        this.cidade = cidade;
        this.tpUsuario = tpUsuario;
    }
             
    
    public Usuario(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }   

    public Usuario(int codigo, String nome, String usuario, String senha, String email, String telefone, String estado, String cidade, boolean tpUsuario) {
        this.codigo = codigo;
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
        this.email = email;
        this.telefone = telefone;
        this.estado = estado;
        this.cidade = cidade;
        this.tpUsuario = tpUsuario;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isTpUsuario() {
        return tpUsuario;
    }

    public void setTpUsuario(boolean tpUsuario) {
        this.tpUsuario = tpUsuario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
   
    public boolean ValidaUsu() throws SQLException {
        String sql = "SELECT * FROM tb_pessoas WHERE usuario = ? "
                + "AND senhausu= ?";
       
        ConnectionFactory cf = new ConnectionFactory();
       
        try(Connection conn = cf.obtemConexao();
            PreparedStatement ps = conn.prepareStatement(sql);)
        {
        ps.setString(1, getUsuario());
        ps.setString(2, getSenha());
            System.out.println(sql);
            System.out.println(getUsuario());
            System.out.println(getSenha());
            
        ResultSet rs = ps.executeQuery();
        return rs.next();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Não Localizado!!");
            return false;
           
        }      
    }
    
    public boolean CriarUsu() throws SQLException {
        String sql = "INSERT INTO tb_pessoas(nomeusu, usuario, senhausu, foneusu, estadousu, cidadeusu) VALUES(?, ?, ?, ?, ?, ?)";
        
        ConnectionFactory cf = new ConnectionFactory();
        
        try(Connection conn = cf.obtemConexao();
            PreparedStatement ps = conn.prepareStatement(sql);) {       
            
            ps.setString(1, nome);
            ps.setString(2, usuario);
            ps.setString(3, senha);
            ps.setString(4, telefone);
            ps.setString(5, estado);
            ps.setString(6, cidade);
            System.out.println(sql);
            System.out.println(nome);
            
            ps.execute();
            
            return true;
            
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Não criado");
            return false;
        }        
    }    
    
    public boolean DeletarUsu() throws SQLException {
        String sql = "DELETE FROM tb_pessoas WHERE usuario = ?";
        
        ConnectionFactory cf = new ConnectionFactory();
        try(Connection c = cf.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.execute();
            return true;
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }        
    }


    public Usuario BuscarUsu() throws SQLException {
        String sql = "SELECT * FROM tb_pessoas WHERE usuario = ?";
        Usuario usu = null;
        
        ConnectionFactory cf = new ConnectionFactory();
        try(Connection c = cf.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, usuario);
           
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                usu = new Usuario();
                usu.setNome(rs.getString("nomeusu"));
                usu.setUsuario(rs.getString("usuario"));
                usu.setTelefone(rs.getString("foneusu"));
                usu.setCidade(rs.getString("cidadeusu"));
                usu.setEstado(rs.getString("estadousu"));
                usu.setSenha(rs.getString("senhausu"));
                usu.setCodigo(rs.getInt("codusu"));
                

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return usu;
    }
    //método
    public boolean EditarUsu() throws SQLException {
        String sql = "UPDATE tb_pessoas SET nomeusu = ?, usuario = ?, senhausu = ?, foneusu = ?, estadousu = ?, cidadeusu = ? WHERE codusu = ?";
        
        ConnectionFactory cf = new ConnectionFactory();
        try(Connection c = cf.obtemConexao()) {
            
            PreparedStatement ps = c.prepareStatement(sql);
            
            ps.setString(1, nome);
            ps.setString(2, usuario);
            ps.setString(3, senha);
            ps.setString(4, telefone);
            ps.setString(5, estado);
            ps.setString(6, cidade);
            ps.setInt(7, codigo);
            
            ps.execute();
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }       
    }
    
    public boolean UsuExistente(String usuario) throws SQLException {
        String sql = "SELECT COUNT(*) FROM tb_pessoas WHERE usuario = ?";
        ConnectionFactory cf = new ConnectionFactory();

        try (Connection c = cf.obtemConexao(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, usuario);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                return rs.getInt(1) > 0; // Retorna true se já existir
            }
        }

        return false; // Retorna false se não existir
    }


    

}