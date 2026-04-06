package br.com.senac.techfix.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    @Column(unique = true)
    private String login;
    private String senha;
    private String tipo;
    public static Usuario sessao;
    
    public Usuario() {}

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getLogin() {return login;}
    public void setLogin(String login) {this.login = login;}

    public String getSenha() {return senha;}
    public void setSenha(String senha) {this.senha = senha;}

    public String getTipo() {return tipo;}
    public void setTipo(String tipo) {this.tipo = tipo;}

    
}
