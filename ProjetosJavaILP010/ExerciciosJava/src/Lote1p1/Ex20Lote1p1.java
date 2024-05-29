package Lote1p1;
/* 
Programa: Receba 3 coeficientes (A, B e C) de uma equação de 2º grau da fórmula: AX²+BX+C=0. Verifique e mostre a existência de raízes reais e se, caso exista, calcule e mostre.
Programador: Marcela Maciel, CodeSorceress24.
Versão 1.0
*/
import javax.swing.JOptionPane;
public class Ex20Lote1p1 {
    public static void main(String[] args) {
        // declaração de variáveis.
        double a, b, c;
        double delta, raiz1, raiz2;
        // entrada de dados.
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente A:"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente B:"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente C:"));
        // sugestão de teste:
        // nenhuma raiz real: A = 1, B = -4, C =5
        // uma única raiz real: A = 4, B = -4, C = 1
        // duas raízes reais: A = 1, B = -5, C = 6
        // processamento de dados.
        delta = b * b - 4 * a * c; // Δ = b2 – 4ac
        if (delta < 0) {
            // não existem raízes reais.
            JOptionPane.showMessageDialog(null, "Não existem raízes reais.");
        } else if (delta == 0) {
            // existe uma raiz real.
            raiz1 = -b / (2 * a);
            JOptionPane.showMessageDialog(null, "Existe uma raiz real: " + String.format("%.2f", raiz1));
        } else {
            // existem duas raízes reais.
            raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            JOptionPane.showMessageDialog(null, "Existem duas raízes reais:\n" + 
                                            "Raiz 1: " + String.format("%.2f", raiz1) + "."  + "\n" +
                                            "Raiz 2: " + String.format("%.2f", raiz2) + ".");
        }
    }
}