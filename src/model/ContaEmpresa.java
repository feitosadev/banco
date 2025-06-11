package model;

public class ContaEmpresa extends Conta{

	private String CNPJ;
	private Double emprestimoDisponivel;
	
	public ContaEmpresa() {
		super();
	}
	
	public ContaEmpresa(Integer numero, String titular, Double saldo, Double limiteSaque, String cNPJ,
			Double emprestimoDisponivel) {
		super(numero, titular, saldo, limiteSaque);
		CNPJ = cNPJ;
		this.emprestimoDisponivel = emprestimoDisponivel;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public Double getEmprestimoDisponivel() {
		return emprestimoDisponivel;
	}

	public void setEmprestimoDisponivel(Double emprestimoDisponivel) {
		this.emprestimoDisponivel = emprestimoDisponivel;
	}
	
	public void Emprestimo(double valor) {
		if(emprestimoDisponivel <= valor) {
			Deposito(valor);
		}
		else {
			throw new RuntimeException ("Valor não disponível para emprestimo.");
		}
	}
}