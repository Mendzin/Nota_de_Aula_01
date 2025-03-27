import java.util.Scanner;

public class Questao2 {

    public static double somar(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    public static double dividir(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Erro: Divisão por zero.");
            return 0;
        }
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2;

        System.out.println("Escolha a operação que deseja realizar:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Divisão");
        System.out.println("4 - Multiplicação");
        System.out.print("Digite o número da opção desejada: ");
        int opcao = input.nextInt();

        System.out.print("Digite o primeiro número: ");
        num1 = input.nextDouble();
        System.out.print("Digite o segundo número: ");
        num2 = input.nextDouble();

        switch (opcao) {
            case 1:
                System.out.println("Resultado da soma: " + somar(num1, num2));
                break;
            case 2:
                System.out.println("Resultado da subtração: " + subtrair(num1, num2));
                break;
            case 3:
                System.out.println("Resultado da divisão: " + dividir(num1, num2));
                break;
            case 4:
                System.out.println("Resultado da multiplicação: " + multiplicar(num1, num2));
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        input.close(); 
    }
}
