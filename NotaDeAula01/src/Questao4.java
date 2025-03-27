import java.util.Scanner;

class ContaBancaria {
	private double saldo;

	public ContaBancaria() {
		this.saldo = 0;
	}

	public void consultarSaldo() {
		System.out.println("Saldo atual: R$ " + saldo);
	}

	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
			System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
		} else {
			System.out.println("Valor de depósito inválido.");
		}
	}

	public void sacar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
		} else {
			System.out.println("Saldo insuficiente para saque.");
		}
	}

	public void transferir(double valor, ContaBancaria contaDestino) {
		if (saldo >= valor) {
			saldo -= valor;
			contaDestino.depositar(valor);
			System.out.println("Transferência de R$ " + valor + " realizada com sucesso.");
		} else {
			System.out.println("Saldo insuficiente para transferência.");
		}
	}
}

public class Questao4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ContaBancaria contaCliente = new ContaBancaria();
		ContaBancaria contaDestino = new ContaBancaria();
		int opcao;

		do {
			System.out.println("\nSistema Bancário - Escolha uma operação:");
			System.out.println("1 - Consultar saldo");
			System.out.println("2 - Depositar");
			System.out.println("3 - Sacar");
			System.out.println("4 - Transferir");
			System.out.println("0 - Sair");
			System.out.print("Opção: ");
			opcao = input.nextInt();

			switch (opcao) {
			case 1:
				contaCliente.consultarSaldo();
				break;

			case 2:
				System.out.print("Digite o valor para depósito: R$ ");
				double valorDeposito = input.nextDouble();
				contaCliente.depositar(valorDeposito);
				break;

			case 3:
				System.out.print("Digite o valor para saque: R$ ");
				double valorSaque = input.nextDouble();
				contaCliente.sacar(valorSaque);
				break;

			case 4:
				System.out.print("Digite o valor para transferência: R$ ");
				double valorTransferencia = input.nextDouble();
				contaCliente.transferir(valorTransferencia, contaDestino);
				break;

			case 0:
				System.out.println("Encerrando o sistema.");
				break;

			default:
				System.out.println("Opção inválida.");
				break;
			}

		} while (opcao != 0);

		input.close();
	}
}
