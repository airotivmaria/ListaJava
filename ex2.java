// Solicite 20 valores inteiros e calcule as suas médias.

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int cont = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite um número inteiro: ");
            int num = scanner.nextInt();
            soma += num;
            cont++;
        }
        int media = soma / cont;
        System.out.println("A média dos 20 números solicitados é de " + media);
    }
}
