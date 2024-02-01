import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.print("Informe o primeiro numero: ");
		num1 = sc.nextInt();
		System.out.print("Informe o segundo numeor: ");
		num2 = sc.nextInt();
		if(num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("Sao multiplos");
		}else {
			System.out.println("Nao sao multiplos");
		}
		sc.close();
	}

}
