package Lote1p1;
/* 
Programa: Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
Programador: Marcela Maciel, CodeSorceress24.
Versão 2.0
*/
import javax.swing.JOptionPane;
public class Ex36Lote1p1{
    public static void main(String[] args) {
        // declaração de variáveis
        int N;
        double soma = 1.0; // inicia com 1 para considerar o primeiro termo da série.
        // entrada de dados.
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        // processamento de dados.
        double fatorial = 1;
        for (int i = 1; i <= N; i++){
            fatorial *= i; // calcula o fatorial de i.
            soma += 1.0 / fatorial; // adiciona o termo da série à soma.
        }
        // saída de dados.
        JOptionPane.showMessageDialog(null, "A soma da série é: " + soma + ".");
    }
}