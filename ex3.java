// Solicite ao usuário o tanto de números que ele quer informar. Após isso realize a soma de todos os números pares que ele informou e imprima ao final.

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos números deseja informar para soma: ");
        int quantosNumeros = scanner.nextInt();
        int soma = 0;
        int contPares = 0;

        for (int i = 0; i <= quantosNumeros; i++) {
            System.out.print("Digite um número inteiro: ");
            int num = scanner.nextInt();
            if (num % 2 == 0){
                soma += num;
                contPares++;
            }
        }
        System.out.println("A soma dos " + contPares + " números pares informados foi de " + soma);
    }
}
