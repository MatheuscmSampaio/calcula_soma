import java.util.Scanner;

public class CalculaSoma {
	public static void main(String[] args) {
		int i, soma;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o 1° numero: ");
		int valor1 = teclado.nextInt();
		System.out.println("Digite o 2° numero: ");
		int valor2 = teclado.nextInt();
		System.out.println("Digite o 3° numero: ");
		int valor3 = teclado.nextInt();
		soma = valor2 + valor3;
		if (valor1 > soma) {
			System.out.println("O primeiro é maior do que a soma dos dois últimos");
		} else {
			System.out.println("A soma dos ultimos numeros é maior que o primeiro numero");
		}
	}

}
