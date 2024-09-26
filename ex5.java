import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        // Gasolina = 5,00
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual a distância em KM do deslocamento até a ESPEP: ");
        int distancia = scanner.nextInt();
        System.out.print("Informe o consumo médio do carro KM/L: ");
        int consumo = scanner.nextInt();

        double litros = (double) distancia/ (double) consumo;
        double gasto = litros * 5;

        System.out.println("O professor Thyago pecorre uma distância de " + distancia + " km, usa um total de " + litros + " litros de combustível e irá gastar um total de R$" + gasto);
    }
}
