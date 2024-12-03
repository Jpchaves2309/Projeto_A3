package com.FireWatch.classes;

public class UsuarioLogado {
    private static UsuarioLogado instance;
    private String nomeUsuario;
    private String senhaUsuario;

    private UsuarioLogado() {

    }

    public static UsuarioLogado getInstance() {
        if (instance == null) {
            instance = new UsuarioLogado();
        }
        return instance;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    
    public String getSenhaUsuario() {
        return senhaUsuario;
    }
    
    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }
}

