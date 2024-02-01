import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, num4, difer;
		System.out.println("Esse programa irar calcular o diferencial e para isso precisamos que voce insira 4 numeros");
		System.out.print("Digite o primeiro numero: ");
		num1 = sc.nextInt();
		System.out.print("Digite o segundo numero: ");
		num2 = sc.nextInt();
		System.out.print("Digite o terceiro numero: ");
		num3 = sc.nextInt();
		System.out.print("Digite o quarto numero: ");
		num4 = sc.nextInt();
		difer = (num1 * num2) - (num3 * num4);
		System.out.printf("O resultado da multiplicacao do %d * %d subitraido do resultado de %d * %d infere na diferença de %d", num1, num2, num3, num4, difer);		
		sc.close();
	}
}
