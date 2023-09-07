import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2;

        // Leitura da 1ª nota
        do {
            System.out.println("Informe a nota da 1ª avaliação (entre 0 e 10):");
            nota1 = scanner.nextDouble();
        } while (nota1 < 0 || nota1 > 10);

        // Leitura da 2ª nota
        do {
            System.out.println("Informe a nota da 2ª avaliação (entre 0 e 10):");
            nota2 = scanner.nextDouble();
        } while (nota2 < 0 || nota2 > 10);

        // Cálculo da média
        double media = (nota1 + nota2) / 2;

        // Impressão da média
        System.out.println("Média do aluno: " + media);

        scanner.close();
    }
}
