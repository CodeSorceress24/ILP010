import java.util.Scanner;
public class EstanteCosmeticos {
    public static void main(String[] args) {
        // declaração de variáveis.
        int[][] estante = new int[5][5];
        int[] contador = new int[5];
        int i, j, produto;
        Scanner scanner = new Scanner(System.in);
        // inicializar o contador de produtos.
        for (i = 0; i < 5; i++) {
            contador[i] = 0;
        }
        // ler os códigos dos produtos e armazená-los na matriz ESTANTE.
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print("Digite o código do produto na posição (" + i + ", " + j + "): ");
                estante[i][j] = scanner.nextInt();
                // atualizar o contador de produtos, se não for vazio.
                produto = estante[i][j];
                if (produto != 0) {
                    contador[produto - 1]++;
                }
            }
        }
        // mostrar os produtos na sequência em que foram inseridos.
        System.out.println("Produtos na sequência em que foram inseridos:");
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(estante[i][j] + " ");
            }
            System.out.println();
        }
        // mostrar a quantidade de caixas de cada tipo de produto.
        System.out.println("Quantidade de caixas de cada tipo de produto:");
        System.out.println("Xampu: " + contador[0]);
        System.out.println("Condicionador: " + contador[1]);
        System.out.println("Hidratante: " + contador[2]);
        System.out.println("Tintura: " + contador[3]);
        System.out.println("Demaquilante: " + contador[4]);
    }
}