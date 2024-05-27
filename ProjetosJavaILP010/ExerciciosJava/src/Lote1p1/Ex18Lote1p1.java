package Lote1p1;
/* 
Programa: Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menor valor.
Programador: Marcela Maciel, CodeSorceress24.
Versão 1.0
*/
import javax.swing.JOptionPane;
public class Ex18Lote1p1 {
    public static void main(String[] args) {
        // declaração de variáveis. 
        int primeiroValor, segundoValor, diferença;
        // entrada de dados.
        primeiroValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        segundoValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        // processamento de dados.
        if (primeiroValor>segundoValor){
            diferença = primeiroValor-segundoValor;
        }else{
            diferença = segundoValor-primeiroValor;
        }
        // saída de dados.
        JOptionPane.showMessageDialog(null, "A diferença do maior valor para o menor valor é de: " + diferença + ".");
    }
}