import java.util.Scanner;

public class Secao5Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt();

		if (i % 2 == 0) {
			System.out.println("PAR");
		}

		else {
			System.out.println("IMPAR");
		}

		sc.close();
	}
}