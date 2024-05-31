/* 
Programa: Serie1 = (1+2+3+...+100)
Programador: Marcela Maciel, CodeSorceress24.
Versão 2.0
*/
public class Recursividade01 {
    // função recursiva para calcular a soma da série.
    public static int somaSerie(int n) {
        // processamento de dados.
        // caso base: se n for 0, retorna 0.
        if (n == 0) {
            return 0;
        }
        //chamada recursiva: soma n com a soma da série até n-1.
        else {
            return n + somaSerie(n - 1);
        }
    }
    public static void main(String[] args) {
        // chama a função somaSerie com o valor 100.
        int resultado = somaSerie(100);
        // saída de dados.
        System.out.println("A soma da série 1 + 2 + 3 + ... + 100 é: " + resultado + ".");
    }
}