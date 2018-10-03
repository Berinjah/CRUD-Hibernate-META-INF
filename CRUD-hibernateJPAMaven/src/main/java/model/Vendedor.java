package model;

import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_vendedor")
public class Vendedor {
	@Id
	private int id_vendedor;
	@Column
	private String nome;
	@Column
	private String endereco;
	@Column
	private String cpf;
	@Column
	private String rg;
	@Column
	private String ctps;
	@OneToMany(mappedBy="id_vendedor", targetEntity=Cliente.class, cascade=CascadeType.ALL)
	private List<Cliente> clientes;
	
	public int getId() {
		return id_vendedor;
	}
	public void setId(int id_vendedor) {
		this.id_vendedor = id_vendedor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
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
	public String getCtps() {
		return ctps;
	}
	public void setCtps(String ctps) {
		this.ctps = ctps;
	}
	
	
	
}
