package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import model.Excecao.Erro;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		try {
			System.out.println("Entre com os dados da conta: ");
			System.out.print("Numero da conta: ");
			int numeroConta = teclado.nextInt();
			System.out.print("Nome do titular: ");
			String nomeTitular = teclado.nextLine();
			teclado.nextLine();
			System.out.print("Saldo inicial: ");
			double saldo = teclado.nextDouble();
			System.out.print("Limite de saque: ");
			double limiteSaque = teclado.nextDouble();
			System.out.println();

			Conta p = new Conta(numeroConta, nomeTitular, saldo, limiteSaque);
			System.out.print("Entre com o valor do saque: ");
			double saque = teclado.nextDouble();
			p.saqueConta(saque);
			System.out.println("Saldo atualizado: " + String.format("%.2f", p.getSaldo()));
		} catch (Erro e) {
			System.err.println(e.getMessage());
		} catch (RuntimeException e) {
			System.err.println("Erro inesperado!!!");
		}

	}

}
