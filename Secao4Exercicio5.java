import java.util.Locale;
import java.util.Scanner;

public class Secao4Exercicio5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		//int peca1 = sc.nextInt();
		int qtd1 = sc.nextInt();
		double vlr1 = sc.nextDouble();

		//int peca2 = sc.nextInt();
		int qtd2 = sc.nextInt();
		double vlr2 = sc.nextDouble();

		double total = (qtd1 * vlr1) + (qtd2 * vlr2);

		System.out.printf("VALOR A PAGAR: R$  %.2f%n", total);

		sc.close();

	}

}