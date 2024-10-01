//Realize a implementação de um jogo que imprima na tela os valores de 1 a 50. No entanto, os múltiplos de 4 devem ser substituídos pela palavra PIM.

class ex1{
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 4 == 0) {
                System.out.print(" PIM");
            } else {
                System.out.print(" " + i);
            }
            
        }
    }
}