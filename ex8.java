// Peça ao usuário para digitar um número inteiro positivo N. O programa deve verificar se N é um número primo ou não.

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();
        int cont = 0;
        
        for (int i = 1; i <= num; i++) {
            int resto = num % i;
            if (resto == 0) {
                cont++;
            }
        }
        
        if (cont == 2) {
            System.out.println("O número " + num + " é primo.");
        } else {
            System.out.println("O número " + num + " não é primo.");
        }
    }
    
}