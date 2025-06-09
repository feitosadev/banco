package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		//ContaEmpresa contaEmpresa = new ContaEmpresa(1, "José", "1002040", 1000.0);
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Informe os dados da conta.");
		System.out.print("Número: ");
		int numeroConta = entrada.nextInt();
		
		System.out.print("Titular: ");
		String titular = entrada.nextLine();
		
		
	}
}