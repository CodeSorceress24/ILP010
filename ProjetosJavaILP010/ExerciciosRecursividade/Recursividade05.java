/* 
Programa: Série 5 = (N)! + (N-1)! + (N-2)! + ... + (1)!
Programador: Marcela Maciel, CodeSorceress24.
Versão 1.0
*/
import java.util.Scanner;
public class Recursividade05 {
    // função recursiva para calcular o fatorial de um número.
    public static int fatorial(int n) {
        // caso base: se n for 0 ou 1, retorna 1.
        if (n <= 1) {
            return 1;
        } 
        // chamada recursiva: n*fatorial(n-1).
        else {
            return n * fatorial(n - 1);
        }
    }
    // função recursiva para calcular a soma dos fatoriais.
    public static int somaFatoriais(int N) {
        // caso base: se N for 1, retorna 1!
        if (N == 1) {
            return fatorial(1);
        } 
        // chamada recursiva: fatorial(N) + somaFatoriais(N-1).
        else {
            return fatorial(N) + somaFatoriais(N - 1);
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
        int resultado = somaFatoriais(N);
        // saída de dados.
        System.out.println("A soma da série " + N + "! + (" + (N-1) + ")! + ... + 1! é: " + resultado + ".");
        scanner.close();
    }
}