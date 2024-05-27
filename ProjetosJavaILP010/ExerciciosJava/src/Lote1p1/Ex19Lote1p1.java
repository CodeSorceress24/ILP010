package Lote1p1;
/* 
Programa: Receba 2 valores reais. Mostre o maior deles. 
Programador: Marcela Maciel, CodeSorceress24.
Versão 1.0
*/
import javax.swing.JOptionPane;
public class Ex19Lote1p1 {
    public static void main(String[] args) {
        // declaração de variáveis. 
        Double valor1, valor2, maior;
        // entrada de dados.
        valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
        // processamento de dados.
        if (valor1>valor2){
            maior = valor1;
        // saída de dados.
            JOptionPane.showMessageDialog(null, "O maior valor é: " + maior + ".");
        }else{
            maior = valor2;
        // saída de dados.
        JOptionPane.showMessageDialog(null, "O maior valor é: " + maior + ".");
        }
    }
}