import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, rest;
		System.out.println("Insira um numero para que o programa indentifique como par ou impar: ");
		num = sc.nextInt();
		rest = num % 2; 
		if (rest == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		sc.close();
	}
}
