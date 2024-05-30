package Lote1p1;
/* 
Programa: Receba um número. Calcule e mostre os resultados da tabuada desse número.
Programador: Marcela Maciel, CodeSorceress24.
Versão 1.0
*/
import javax.swing.JOptionPane;
public class Ex34Lote1p1{
    public static void main(String[] args) {
        // declaração de variáveis.
        int numero;
        // entrada de dados.
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        // processamento de dados.
        StringBuilder tabuada = new StringBuilder();
        tabuada.append("Tabuada do número ").append(numero).append(":\n");
            for (int i = 1; i <= 10; i++) {
            tabuada.append(numero).append(" x ").append(i).append(" = ").append(numero * i).append("\n");
        }
    // saída de dados.
    JOptionPane.showMessageDialog(null, tabuada.toString());
    }
}