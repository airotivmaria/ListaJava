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