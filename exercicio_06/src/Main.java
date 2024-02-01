import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codPec1, quantPec1, codPec2, quantPec2;
		double valPec1, valPec2, valPag1, valPag2, total;
		System.out.print("Informe o codigo do primeiro produto: ");
		codPec1 = sc.nextInt();
		System.out.print("Informe a quantidade de preças: ");
		quantPec1 = sc.nextInt();
		System.out.print("Informe o valor do primeiro produto; ");
		valPec1 = sc.nextDouble();
		valPag1 = quantPec1 * valPec1;
		System.out.print("Informe o codigo do segundo produto: ");
		codPec2 = sc.nextInt();
		System.out.print("Informe a quantidade de preças: ");
		quantPec2 = sc.nextInt();
		System.out.print("Informe o valor do segundo produto; ");
		valPec2 = sc.nextDouble();
		valPag2 = quantPec2 * valPec2;
		total = valPag1 + valPag2;
		System.out.printf("Valor a pagar: R$ %.2f", total);
		sc.close();
	}
}
