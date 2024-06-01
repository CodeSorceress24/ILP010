/* 
Programa: Série 4 = (N/1) + (N-1/2) + (N-2/3) + .... + (1/N). 
Programador: Marcela Maciel, CodeSorceress24.
Versão 1.0
*/
import java.util.Scanner;
public class Recursividade04 {
    // função recursiva para calcular a soma da série.
    public static double somaSerie(int N, int i) {
        // caso base: se i for maior que N, retorna 0.
        if (i > N) {
            return 0.0;
        } 
        // chamada recursiva: soma N/i com a soma da série ajustando os parâmetros.
        else {
            return (double) N/i + somaSerie(N-1, i+1);
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
        double resultado = somaSerie(N, 1);
        // saída de dados.
        System.out.println("A soma da série (" + N + "/1) + (" + (N-1) + "/2) + ... + (1/" + N + ") é: " + resultado + ".");
        scanner.close();
    }
}