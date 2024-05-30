package Lote1p1;
/* 
Programa: Receba um número inteiro. Calcule e mostre o seu fatorial.
Programador: Marcela Maciel, CodeSorceress24.
Versão 1.0
*/
import javax.swing.JOptionPane;
public class Ex32Lote1p1{
    public static void main (String[] args){
        // declaração de variáveis.
        int numero;
        long fatorial = 1;
        // entrada de dados.
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do qual deseja saber o fatorial: "));
        // processamento de dados.
        for (int i = 1; i <= numero; i++){
            fatorial *= i;
        }
        // saída de dados.
        JOptionPane.showMessageDialog(null, "O fatorial do número " + numero + " é: " + fatorial + ".");
    }
}