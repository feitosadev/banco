package model;

public class Conta {

	private Integer numero;
	private String titular;
	private Double saldo;
	private Double limiteSaque;
	
	public Conta() {
		saldo = 0.0;
	}
	
	public Conta(Integer numero, String titular, Double saldo, Double limiteSaque) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public void Saque(double valor) {
		if(saldo >= valor) {
			saldo -= valor;
		}
		else {
			System.out.println("Saldo insuficiente.");
		}
	}
	
	public void Deposito(double valor) {
		saldo += valor;
	}
	
	public String validacaoSaque(double quantia) {
		if(quantia > getLimiteSaque()) {
			return ("Erro ao sacar: A quantia excede o limite de saque.");
		}
		if(quantia > getSaldo()){
			return ("Erro ao sacar: Saldo insuficiente.");			
		}
		return null;		
	}
}