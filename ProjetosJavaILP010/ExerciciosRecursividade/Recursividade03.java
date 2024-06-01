/* 
Programa: Série 2 = (N) + (N-1) + (N-2) + ... + (1) 
Programador: Marcela Maciel, CodeSorceress24.
Versão 2.0
*/
import java.util.Scanner;
public class Recursividade03 {
    // função recursiva para calcular a soma da série.
    public static int somaSerie(int n) {
        // caso base: se n for 0, retorna 0
        if (n == 0) {
            return 0;
        } 
        // chamada recursiva: soma n com a soma da série até n-1.
        else {
            return n + somaSerie(n - 1);
        }
    }
    public static void main(String[] args) {
        // declaração de variáveis.
        int N;
        Scanner scanner = new Scanner(System.in);
        // entrada de dados.
        System.out.print("Digite um número inteiro: ");
        N = scanner.nextInt();
        // processamento de dados.
        int resultado = somaSerie(N);
        // saída de dados.
        System.out.println("A soma da série " + N + " + (" + (N-1) + ") + ... + 1 é: " + resultado);
        scanner.close();
    }
}