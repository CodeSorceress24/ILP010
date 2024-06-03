package EstudosP2;
import java.util.Scanner;
public class DecBin {
    public static void main(String[] args) {
        int numeroValido;
        // Obter um valor válido
        numeroValido = obterValorValido();
        // Converter para binário e exibir resultados
        converterEExibirBinario(numeroValido);
    }
    // Função para obter um valor válido entre 0 e 31
    public static int obterValorValido() {
        Scanner scanner = new Scanner(System.in);
        int numero;
        // Repetir até obter um valor válido
        while (true) {
            System.out.print("Digite um número decimal (0 a 31): ");
            numero = scanner.nextInt();
            
            if (numero >= 0 && numero <= 31) {
                return numero;
            } else {
                System.out.println("VALOR INVÁLIDO.");
            }
        }
    }
    // Procedimento para converter e exibir o número em binário
    public static void converterEExibirBinario(int numero) {
        int[] vetorBinario = new int[5];
        int valor = numero;
        // Inicializa o vetor com zeros
        for (int i = 0; i < 5; i++) {
            vetorBinario[i] = 0;
        }
        // Converte o número decimal para binário
        int i = 4;
        while (valor > 0) {
            vetorBinario[i] = valor % 2;
            valor = valor / 2;
            i--;
        }
        // Exibe o número decimal
        System.out.println("Número decimal: " + numero);
        // Exibe a sequência binária
        System.out.print("Número em binário: ");
        for (i = 0; i < 5; i++) {
            System.out.print(vetorBinario[i]);
        }
        System.out.println();
    }
}