
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double primeiroValor, segundoValor;

        System.out.println("Informe o primeiro valor:");
        primeiroValor = scanner.nextDouble();

        do {
            System.out.println("Informe o segundo valor (não pode ser zero):");
            segundoValor = scanner.nextDouble();
        } while (segundoValor == 0);

        double resultado = primeiroValor / segundoValor;
        System.out.println("Resultado da divisão: " + resultado);

        scanner.close();
    }
}
