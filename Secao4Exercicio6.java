import java.util.Locale;
import java.util.Scanner;

public class Secao4Exercicio6 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner geometria = new Scanner(System.in);

		double TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO;

		double pi = 3.14159;

		double A = geometria.nextDouble();
		double B = geometria.nextDouble();
		double C = geometria.nextDouble();

		TRIANGULO = (A * C) / 2;
		CIRCULO = (C * C) * pi;
		TRAPEZIO = (A + B) * C / 2;
		QUADRADO = B * B;
		RETANGULO = A * B;

		System.out.printf("TRIANGULO: %.3f%n", TRIANGULO);
		System.out.printf("CIRCULO: %.3f%n", CIRCULO);
		System.out.printf("TRAPEZIO: %.3f%n", TRAPEZIO);
		System.out.printf("QUADRADO: %.3f%n", QUADRADO);
		System.out.printf("RETANGULO: %.3f%n", RETANGULO);

		geometria.close();

	}
}