package Lote1p1;
/* 
Programa: Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a equação possui 2 raízes).
Programador: Marcela Maciel, CodeSorceress24.
Versão 1.0
*/
import javax.swing.JOptionPane;
public class Ex05Lote1p1 {
    public static void main(String[] args) {
        // declaração de variáveis.
        double a, b, c, delta, raiz1, raiz2;
        // entrada de dados.
        // para duas raízes reais, utilize 1, -5 e 6 para a, b e c, consecutivamente.
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B: "));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de C: "));
        // processamento de dados.
        delta = b*b-4*a*c;
        // caso delta diferente de 0, logo finaliza programa.
        if (delta<0){
            JOptionPane.showMessageDialog(null, "A equação não possui raízes reais.");
        } else{
            raiz1 = (-b+Math.sqrt(delta))/(2*a);
            raiz2 = (-b-Math.sqrt(delta))/(2*a);
            // saída de dados.
            JOptionPane.showMessageDialog(null, "A equação possui as seguintes raízes reais: " + raiz1 + " e " + raiz2 + ".");
        }
    }
}