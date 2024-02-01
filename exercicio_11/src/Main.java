import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inicio, fim, duracao;
		System.out.print("Informe o horario de inicio do jogo: ");
		inicio = sc.nextInt();		
		System.out.print("Informe o horario de fim dso jogo: ");
		fim = sc.nextInt();
		if (inicio < fim) {
			duracao = fim - inicio;
		}else {
			duracao = 24 - inicio + fim;
		}
		System.out.printf("O jogo durou %d horas(h)", duracao);
		sc.close();
	}
}
