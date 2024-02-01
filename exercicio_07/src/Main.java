import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		double pi = 3.14159;
		System.out.print("Informe o valor de A: ");
		A = sc.nextDouble();
		System.out.print("Informe o valor de B: ");
		B = sc.nextDouble();
		System.out.print("Informe o valor de C: ");
		C = sc.nextDouble();
		triangulo = (A * C) / 2;
		circulo = pi * Math.pow(C, 2.0);
		trapezio = ((A + B) * C) / 2;
		quadrado = B * B;
		retangulo = A * B;
		System.out.printf("TRIANGULO: %.3f \nCIRCULO: %.3f\n TRAPEZIO: %.3f \nQUADRADO: %.3f \nRETANGULO: %.3f \n", triangulo, circulo, trapezio, quadrado, retangulo);

		sc.close();
	}

}
