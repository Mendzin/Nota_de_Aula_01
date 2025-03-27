import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, nota3;
		double media;
		String name;
		
		System.out.println("Digite seu nome: ");
			name= sc.nextLine();
		
		System.out.println("Digite sua primeira nota: ");
			nota1 = sc.nextDouble();
		
		System.out.println("Digite sua segunda nota: ");
			nota2 = sc.nextDouble();	
			
		System.out.println("Digite sua terceira nota: ");
			nota3 = sc.nextDouble();
			
		media = ((nota1+nota2+nota3)/3)*10;
		
		if (media>=70) {
			System.out.printf("Media final: %.2f Parabens %s você esta aprovado!!!",media, name);
		
		}else if(media<=69&&media<=40){
			System.out.printf("Media final: %.2f %s Você esta na final.",media, name);
		
		}else if (media<=39) {
			System.out.printf("Media final: %.2f %s Você esta reprovado",media, name);
		}
		
		
		
		
		sc.close();
	

	}

}
