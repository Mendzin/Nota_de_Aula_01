import java.util.Scanner;

class Produto {
	private String nome;
	private double preco;
	private int quantidadeEstoque;

	public Produto(String nome, double preco, int quantidadeEstoque) {
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public void adicionarEstoque(int quantidade) {
		this.quantidadeEstoque += quantidade;
		System.out.println(quantidade + " unidades adicionadas ao estoque.");
	}

	public void venderProduto(int quantidade) {
		if (quantidade <= quantidadeEstoque) {
			this.quantidadeEstoque -= quantidade;
			System.out.println(quantidade + " unidades vendidas.");
		} else {
			System.out.println("Estoque insuficiente. Quantidade disponível: " + quantidadeEstoque);
		}
	}

	public void exibirEstoque() {
		System.out.println("Estoque atual do produto " + nome + ": " + quantidadeEstoque + " unidades.");
	}
}

public class Questao3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o nome do produto: ");
		String nome = input.nextLine();

		System.out.print("Digite o preço do produto: ");
		double preco = input.nextDouble();

		System.out.print("Digite a quantidade inicial em estoque: ");
		int quantidadeInicial = input.nextInt();

		Produto produto = new Produto(nome, preco, quantidadeInicial);

		int opcao;
		do {
			System.out.println("\nEscolha a operação desejada:");
			System.out.println("1 - Adicionar estoque");
			System.out.println("2 - Vender produto");
			System.out.println("3 - Exibir estoque");
			System.out.println("0 - Sair");
			System.out.print("Opção: ");
			opcao = input.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("Digite a quantidade para adicionar ao estoque: ");
				int adicionar = input.nextInt();
				produto.adicionarEstoque(adicionar);
				break;

			case 2:
				System.out.print("Digite a quantidade para vender: ");
				int vender = input.nextInt();
				produto.venderProduto(vender);
				break;

			case 3:
				produto.exibirEstoque();
				break;

			case 0:
				System.out.println("Encerrando o programa.");
				break;

			default:
				System.out.println("Opção inválida.");
				break;
			}

		} while (opcao != 0);

		input.close();
	}
}
