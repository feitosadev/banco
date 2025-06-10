package application;

import java.util.Scanner;

import exceptions.BusinessException;
import model.Conta;

public class Program {

	public static void main(String[] args) {
		
		//ContaEmpresa contaEmpresa = new ContaEmpresa(1, "José", "1002040", 1000.0);
		
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