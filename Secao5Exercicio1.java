import java.util.Scanner;

public class Secao5Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt();

		if (i >= 0) {
			System.out.println("NAO NEGATIVO");
		}

		else {
			System.out.println("NEGATIVO");
		}
		sc.close();
	}

}