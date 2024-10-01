// João aplicou seu dinheiro na poupança que rende 0,5% ao mês. Maria preferiu um fundo de renda fixa, que rende 1% ao mês. Sabendo que João aplicou R$ 1000,00 e maria começou seu investimento com R$ 100,00, calcule quantos messes são necessários para Maria ter mais dinheiro que João.

class ex4 {
    public static void main(String[] args) {
        double dinheiroJoao = 1000;
        double dinheiroMaria = 100;
        int contMes = 0;

        while(dinheiroMaria < dinheiroJoao) {
            double totalMaria = dinheiroMaria * (0.01);
            dinheiroMaria += totalMaria;
            
            double totalJoao = dinheiroJoao * (0.005);
            dinheiroJoao += totalJoao;
            contMes++;


        }
        System.out.println("Maria levou " + contMes + " meses e possuiu o momante de R$" + dinheiroMaria + " reais, enquanto João possuiu R$" + dinheiroJoao);
    }
}