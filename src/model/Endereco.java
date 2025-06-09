package model;

public class Endereco {

	private String logradouro;
	private String bairro;
	private String estado;
	private Integer cep;
	
	public Endereco(String logradouro, String bairro, String estado, Integer cep) {
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.estado = estado;
		this.cep = cep;
	}
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public Integer getCep() {
		return cep;
	}
	public void setCep(Integer cep) {
		this.cep = cep;
	}
}
