// Solicite ao usuário que insira uma sequência de números inteiros positivos. O programa deve contar quantos números pares e quantos números ímpares foram inseridos. Ao final, o programa deve exibir o total de números pares e ímpares.

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contPares = 0;
        int contImpar = 0;

        for (int i = 0; i <= 9; i++) {
            System.out.print("Digite numéro inteiro: ");
            int num = scanner.nextInt();
            if(num % 2 == 0){
                contPares++;
            } else {
                contImpar++;
            }
        }

        System.out.println("Você digitos 10 números inteiros, " + contPares + " foram pares e " + contImpar+ " foram ímpares.");
    }
}
