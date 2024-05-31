package Lote1p1;
/* 
Programa: Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. Mostre os 4 números em ordem crescente.
Programador: Marcela Maciel, CodeSorceress24.
Versão 2.0
*/
import javax.swing.JOptionPane;
public class Ex23Lote1p1 {
    public static void main(String[] args) {
        // Declaração de variáveis
        int valor1, valor2, valor3, valor4, temp;
        // entrada dos três primeiros valores em ordem crescente.
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor (inteiro):"));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor (inteiro) maior que o primeiro:"));
        while (valor2 <= valor1) {
            valor2 = Integer.parseInt(JOptionPane.showInputDialog("Erro! Digite o segundo valor maior que o primeiro:"));
        }
        valor3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor (inteiro) maior que o segundo:"));
        while (valor3 <= valor2) {
            valor3 = Integer.parseInt(JOptionPane.showInputDialog("Erro! Digite o terceiro valor maior que o segundo:"));
        }
        // entrada do quarto valor.
        valor4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto valor (inteiro) qualquer:"));
        // processamento de dados.
        if (valor4 < valor1) {
            temp = valor1;
            valor1 = valor4;
            valor4 = temp;
        }
        if (valor4 < valor2) {
            temp = valor2;
            valor2 = valor4;
            valor4 = temp;
        }
        if (valor4 < valor3) {
            temp = valor3;
            valor3 = valor4;
            valor4 = temp;
        }
        // Saída dos valores em ordem crescente
        JOptionPane.showMessageDialog(null, "Valores em ordem crescente: " + valor1 + ", " + valor2 + ", " + valor3 + ", " + valor4 + ".");
    }
}