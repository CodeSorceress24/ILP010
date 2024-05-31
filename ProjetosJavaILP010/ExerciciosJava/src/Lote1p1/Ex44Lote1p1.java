package Lote1p1;
/* 
Programa: Receba o número da base e do expoente. Calcule e mostre o valor da potência.
Programador: Marcela Maciel, CodeSorceress24.
Versão 2.0
*/
import javax.swing.JOptionPane;

public class Ex44Lote1p1 {
    public static void main(String[] args) {
        // declaração de variáveis.
        int base, expoente;
        long resultado = 1;
        // entrada de dados.
        base = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da base: "));
        expoente = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do expoente: "));
        // processamento de dados.
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        // saída de dados.
        JOptionPane.showMessageDialog(null, "O valor de " + base + " elevado a " + expoente + " é: " + resultado + ".");
    }
}