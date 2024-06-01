/* 
Programa: Série 3 = (1/1) + (1/2) + (1/3) + ....+ (1/N).
Programador: Marcela Maciel, CodeSorceress24.
Versão 1.0
*/
import java.util.Scanner;
public class Recursividade03 {
    // função recursiva para calcular a soma da série.
    public static double somaSerie(int N) {
        // caso base: se N for 1, retorna 1.0.
        if (N == 1) {
            return 1.0;
        } 
        // chamada recursiva: soma 1/N com a soma da série ajustando os parâmetros.
        else {
            return 1.0 / N + somaSerie(N - 1);
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
        double resultado = somaSerie(N);
        // saída de dados.
        System.out.println("A soma da série (1/1) + (1/2) + (1/3) + ... + (1/" + N + ") é: " + resultado + ".");
        scanner.close();
    }
}