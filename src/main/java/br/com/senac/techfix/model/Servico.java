package br.com.senac.techfix.model;

import br.com.senac.techfix.model.Cliente;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "servicos")
public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String tipoServico;
    private String descricao;
    private double valor;
    private String data;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    public Servico() {}
    
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getTipoServico() {return tipoServico;}
    public void setTipoServico(String tipoServico) {this.tipoServico = tipoServico;}

    public String getDescricao() {return descricao;}
    public void setDescricao(String descricao) {this.descricao = descricao;}

    public double getValor() {return valor;}
    public void setValor(double valor) {this.valor = valor;}

    public String getData() {return data;}
    public void setData(String data) {this.data = data;}

    public Cliente getCliente() {return cliente;}
    public void setCliente(Cliente cliente) {this.cliente = cliente;}
    
    
}
