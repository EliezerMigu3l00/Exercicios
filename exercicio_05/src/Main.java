import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numFunc, horasTrab;
		double valHora , salario;
		System.out.print("Informe o numero do funcionario: ");
		numFunc = sc.nextInt();
		System.out.print("Informe quantas horas o funcionario trabalhou: ");
		horasTrab = sc.nextInt();
		System.out.print("Valor da hora trabalhada do funcionario: ");
		valHora = sc.nextDouble();
		salario = horasTrab * valHora;
		System.out.printf("Number = %d \n", numFunc);
		System.out.printf("Salary = %.2f", salario);
		sc.close();
	}
}
