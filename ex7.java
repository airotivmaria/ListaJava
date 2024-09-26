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
