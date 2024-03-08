import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("String: ");
        String entrada = scanner.nextLine();
        scanner.close();

        // Chamada da função para inverter a string
        String resultado = Inverter(entrada);

        // Exibição do resultado
        System.out.println("String original: " + entrada);
        System.out.println("String invertida: " + resultado);
    }

    // Função para inverter a string
    private static String Inverter(String s) {
        int tamanho = s.length();
        StringBuilder stringInvertida = new StringBuilder();
        for (int i = tamanho - 1; i >= 0; i--) {
            stringInvertida.append(s.charAt(i));
        }
        return stringInvertida.toString();
    }
}

