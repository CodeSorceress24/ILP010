package Lote1p1;
/* 
Programa: Receba 2 números inteiros. Calcule e mostre a soma dos quadrados.
Programador: Marcela Maciel, CodeSorceress24.
Versão 2.0
*/
import javax.swing.JOptionPane;
public class Ex09Lote1p1 {
    public static void main(String[] args) {
        // declaração de variáveis.
        int num1, num2, quadrado1, quadrado2, soma;
        // entrada de dados.
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 1º número inteiro: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 2º número inteiro: "));
        // processamento de dados.
        quadrado1 = (int) Math.pow(num1,2);
        quadrado2 = (int) Math.pow(num2,2);
        soma = quadrado1+quadrado2;
        // saída de dados.
        JOptionPane.showMessageDialog(null, "A soma dos quadrados dos 2 números inteiros é: " + soma + ".");
    }
}