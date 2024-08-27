import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a operação desejada
        System.out.println("Escolha a operação desejada (soma, divisão, multiplicação):");
        String operacao = scanner.nextLine().toLowerCase();

        // Solicita os números
        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();

        // Realiza a operação escolhida
        switch (operacao) {
            case "soma":
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case "divisão":
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Erro: divisão por zero não é permitida.");
                }
                break;
            case "multiplicação":
                System.out.println("Resultado: " + (num1 * num2));
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }

        // Fecha o scanner
        scanner.close();
    }
}

