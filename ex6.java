// Deve receber 2 números e verificar se o segundo número é múltiplo do primeiro. Caso o segundo número seja múltiplo do primeiro, o seu programa deve imprimir a mensagem “São múltiplos”. Caso contrário, a mensagem impressa pelo seu programa deve ser: “Não são múltiplos”.

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        if (num2 % num1 == 0) {
            System.out.println("São múltiplos.");
        } else {
            System.out.println("Não são múltiplos.");
        }
    }
}
