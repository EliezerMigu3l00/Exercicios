import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double renda;
		System.out.print("Informe sua renda: ");
		renda = sc.nextDouble();
		if(renda < 0) {
			System.out.println("Renda invalida");
			System.out.print("Informe sua renda: ");
			renda = sc.nextDouble();
		}else if (renda > 0 && renda < 2000) {
			System.out.println("Isento");
		}else if(renda > 2000 && renda < 3000) {
			double imposto = (renda - 2000.00) * 0.08; 
			System.out.printf("R$ %.2f", imposto);	
		}else if (renda > 3000 && renda < 4500){
			double imposto = (renda - 3000.00) * 0.18 + 1000 * 0.08; 
			System.out.printf("R$ %.2f", imposto);
		}else {
			double imposto = (renda - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
			System.out.printf("R$ %.2f", imposto);
		}
		sc.close();
	}

}
