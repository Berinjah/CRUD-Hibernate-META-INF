package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cliente")
public class Cliente {
	@Id
    private int id_cliente;
    @Column
    private String nome;
    @Column
    private String cpf;
    @Column
    private String rg;
    @ManyToOne
    @JoinColumn(name="id_vendedor")
    private Vendedor id_vendedor;
    
	public int getId() {
              return id_cliente;
    }
    public void setId(int id_cliente) {
              this.id_cliente = id_cliente;
    }
    public String getNome() {
              return nome;
    }
    public void setNome(String nome) {
              this.nome = nome;
    }
    public String getCpf() {
              return cpf;
    }
    public void setCpf(String cpf) {
              this.cpf = cpf;
    }
    public String getRg() {
              return rg;
    }
    public void setRg(String rg) {
              this.rg = rg;
    }
    public Vendedor getId_vendedor() {
		return id_vendedor;
	}
	public void setId_vendedor(Vendedor id_vendedor) {
		this.id_vendedor = id_vendedor;
	}
}
