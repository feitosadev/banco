package application;

import java.util.Scanner;

import exceptions.BusinessException;
import model.Conta;
import model.ContaEmpresa;

public class Program {

	public static void main(String[] args) {
		
		Conta contateste = new Conta(0002, "Carlos", 0.0, 300.0);
		ContaEmpresa contaEmpresa = new ContaEmpresa(0001, "José", 0.0, 1000.0, "345.574.0001-75", 500.0);
		
		//UPCASTING
		Conta conta1 = contaEmpresa;
		ContaEmpresa contaempresa1;
		
		
		Scanner entrada = new Scanner(System.in);		
		
		System.out.println("Informe os dados da conta.");
		System.out.print("Número: ");
		int numeroConta = entrada.nextInt();
		
		System.out.print("Titular: ");
		entrada.nextLine();
		String titular = entrada.nextLine();
		
		System.out.print("Digite o saldo inicial: ");
		double saldoInicial = entrada.nextDouble();
		
		System.out.print("Limite de saque: ");
		double limiteSaque = entrada.nextDouble();
		
		Conta conta = new Conta(numeroConta, titular, saldoInicial, limiteSaque);
		
		System.out.println();
		System.out.print("Valor que irá sacar: ");
		double quantia = entrada.nextDouble();
		
		try {
			conta.Saque(quantia);
			System.out.printf("Novo saldo: R$%,2f%n",conta.getSaldo());
		}
		catch(BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		entrada.close();
	}
}