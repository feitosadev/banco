package model;

public class ContaPoupanca extends Conta {
	
	private double cPF;
	private double taxaJuros;
	
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Integer numero, String titular, Double saldo, Double limiteSaque, double cPF,
			double taxaJuros) {
		super(numero, titular, saldo, limiteSaque);
		cPF = cPF;
		this.taxaJuros = taxaJuros;
	}

	public double getcPF() {
		return cPF;
	}

	public void setcPF(double cPF) {
		this.cPF = cPF;
	}

	public double getRendimento() {
		return taxaJuros;
	}

	public void setRendimento(double rendimento) {
		this.taxaJuros = rendimento;
	}
	
	public void atualizarSaldo() {
		saldo += saldo * taxaJuros;
	}
}