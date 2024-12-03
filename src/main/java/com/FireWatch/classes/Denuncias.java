package com.FireWatch.classes;
import com.FireWatch.DAO.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Denuncias {
    private int num;
    private String estado;
    private String cidade;
    private String rua;
    private String numero;
    private String data;
    private String hora;
    private String gravidade;
    private String info;
    
    public Denuncias() {
        
    }
    
    public Denuncias(int num, String estado, String cidade, String rua, String numero, String data, String hora, String gravidade, String info) {
        this.num = num;
        this.estado = estado;
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
        this.data = data;
        this.hora = hora;
        this.gravidade = gravidade;
        this.info = info;
            
    }
    
    public Denuncias(String estado, String cidade, String rua, String numero, String data, String hora, String gravidade, String info) {
        this.estado = estado;
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
        this.data = data;
        this.hora = hora;
        this.gravidade = gravidade;
        this.info = info;
            
    }
    
    public Denuncias(String estado, String cidade, String rua, String numero, String data, String hora, String gravidade) {    
        this.estado = estado;
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
        this.data = data;
        this.hora = hora;
        this.gravidade = gravidade;
            
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
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

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getGravidade() {
        return gravidade;
    }

    public void setGravidade(String gravidade) {
        this.gravidade = gravidade;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    
    
    public boolean CriarDen() throws SQLException {
        String sql = "INSERT INTO tb_denuncias(estadoden, cidadeden, endeden, numeden, dataden, horaden, gravden) VALUES(?, ?, ?, ?, ?, ?, ?)";
        
        ConnectionFactory cf = new ConnectionFactory();
        
                try(Connection conn = cf.obtemConexao();
            PreparedStatement ps = conn.prepareStatement(sql);) {
                    
                    ps.setString(1, estado);
                    ps.setString(2, cidade);
                    ps.setString(3, rua);
                    ps.setString(4, numero);
                    ps.setString(5, data);
                    ps.setString(6, hora);
                    ps.setString(7, gravidade);
                    
                    ps.execute();
                    
                    return true;
                    
                }catch(Exception e){
            e.printStackTrace();
            System.out.println("Não Criado"); 
            return false;
        }              
    }   
    
    public boolean DeletarDen() throws SQLException {
        String sql = "DELETE FROM tb_denuncias WHERE numden = ?";
        
        ConnectionFactory cf = new ConnectionFactory();
        try(Connection c = cf.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, num);
            ps.execute();
            return true;
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }  
    }
    
}