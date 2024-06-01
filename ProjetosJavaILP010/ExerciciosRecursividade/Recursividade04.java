/* 
Programa: Série 3 = (1/1) + (1/2) + (1/3) + ....+ (1/N).
Programador: Marcela Maciel, CodeSorceress24.
Versão 2.0
*/
import java.util.Scanner;

public class Recursividade04 {
    // Função recursiva para calcular a soma da série
    public static double somaSerie(int n) {
        // Caso base: se n for 1, retorna 1 (1/1)
        if (n == 1) {
            return 1.0;
        } 
        // Chamada recursiva: soma 1/n com a soma da série até n-1
        else {
            return 1.0 / n + somaSerie(n - 1);
        }
    }

    public static void main(String[] args) {
        // Declaração de variáveis
        int N;
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de dados
        System.out.print("Digite um número inteiro: ");
        N = scanner.nextInt();
        
        // Processamento de dados
        double resultado = somaSerie(N);
        
        // Saída de dados
        System.out.println("A soma da série (1/1) + (1/2) + ... + (1/" + N + ") é: " + resultado);
        scanner.close();
    }
}