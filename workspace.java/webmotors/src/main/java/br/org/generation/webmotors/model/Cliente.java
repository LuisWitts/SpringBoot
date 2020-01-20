package br.org.generation.webmotors.model;

public class Cliente {
	private int id;
	private String nome ;
	private String email ; 
	private String cpf ;
	private String telefone ;
	private String dataNa ;
	
	public Cliente(int id, String nome, String email, String cpf, String telefone, String dataNa) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.telefone = telefone;
		this.dataNa = dataNa;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getDataNa() {
		return dataNa;
	}
	public void setDataNa(String dataNa) {
		this.dataNa = dataNa;
	} 
}
