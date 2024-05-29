package Lote1p1;
/* 
Programa: Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
Programador: Marcela Maciel, CodeSorceress24.
Versão 1.0
*/
import javax.swing.JOptionPane;
public class Ex26Lote1p1 {
    public static void main(String[] args){
        // entrada de dados.
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro:"));
        // processamento de dados.
        int maior, menor;
        if (num1 > num2) {
            maior = num1;
            menor = num2;
        } else {
            maior = num2;
            menor = num1;
        }
        // verificação se o maior é múltiplo do menor, e saída de dados.
        if (maior % menor == 0) {
            JOptionPane.showMessageDialog(null, "O número " + maior + " é múltiplo do número " + menor + ".");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + maior + " não é múltiplo do número " + menor + ".");
        }
    }
}