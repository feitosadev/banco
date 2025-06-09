package model;

public class Conta {

	private Integer numero;
	private String titular;
	private Double saldo;
	
	public Conta() {
		saldo = 0.0;
	}
	
	public Conta(Integer numero, String titular) {
		this();//chamada do construtor acima.
		this.numero = numero;
		this.titular = titular;
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
}