import java.util.Scanner;

public class VerificarClima {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira a temperatura
        System.out.print("Digite a temperatura em graus Celsius: ");
        int temperatura = scanner.nextInt();

        // Verifica se o clima está quente ou frio
        if (temperatura >= 30) {
            System.out.println("O clima está quente.");
        } else {
            System.out.println("O clima está frio.");
        }

        // Fecha o scanner
        scanner.close();
    }

	@Override
	public String toString() {
		return "VerificarClima []";
	}
}
