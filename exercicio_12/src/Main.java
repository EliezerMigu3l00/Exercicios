import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] codigo = new int[5];
		String[] especificacao = new String[5];
		double[] preco = new double[5];
		codigo[0] = 1;
		codigo[1] = 2;
		codigo[2] = 3;
		codigo[3] = 4;
		codigo[4] = 5;
		especificacao[0] = "Cachorro quente";
		especificacao[1] = "X-Salada";
		especificacao[2] = "X-Bacon";
		especificacao[3] = "Torrada Simples";
		especificacao[4] = "Refrigerante";
		preco[0] = 4.00;
		preco[1] = 4.50;
		preco[2] = 5.00;
		preco[3] = 2.00;
		preco[4] = 1.50;
		System.out.println("Cardapio:");
		System.out.println("============================================================");
		System.out.printf("Codigo: %d  -  Espesificacao: %s  -  Preco: %.2f\n", codigo[0], especificacao[0], preco[0]);
		System.out.println("============================================================");
		System.out.printf("Codigo: %d  -  Espesificacao: %s  -  Preco: %.2f\n",codigo[1], especificacao[1], preco[1]);
		System.out.println("============================================================");
		System.out.printf("Codigo: %d  -  Espesificacao: %s  -  Preco: %.2f\n",codigo[2], especificacao[2], preco[2]);
		System.out.println("============================================================");
		System.out.printf("Codigo: %d  -  Espesificacao: %s  -  Preco: %.2f\n",codigo[3], especificacao[3], preco[3]);
		System.out.println("============================================================");
		System.out.printf("Codigo: %d  -  Espesificacao: %s  -  Preco: %.2f\n", codigo[4], especificacao[4], preco[4]);
		System.out.println("============================================================");
		int codProd, quantidade;
		double valTot;
		System.out.print("Infome o codigo do produto: ");
		codProd = sc.nextInt();
		System.out.print("Informe a quantidade: ");
		quantidade = sc.nextInt();
		if(codProd == 1) {
			valTot = preco[0] * quantidade;
			System.out.printf("Quantidade: %d\nProduto: %s\nValor Total = %.2f R$", quantidade, especificacao[0], valTot);
		}else if(codProd == 2) {
			valTot = preco[1] * quantidade;
			System.out.printf("Quantidade: %d\nProduto: %s\nValor Total = %.2f R$", quantidade, especificacao[1], valTot);
		}else if(codProd == 3){
			valTot = preco[2] * quantidade;
			System.out.printf("Quantidade: %d\nProduto: %s\nValor Total = %.2f R$", quantidade, especificacao[2], valTot);
		}else if(codProd == 4){
			valTot = preco[3] * quantidade;
			System.out.printf("Quantidade: %d\nProduto: %s\nValor Total = %.2f R$", quantidade, especificacao[3], valTot);
		}else if(codProd == 5){
			valTot = preco[4] * quantidade;
			System.out.printf("Quantidade: %d\nProduto: %s\nValor Total = %.2f R$", quantidade, especificacao[4], valTot);
		}
		sc.close();
	}

}
