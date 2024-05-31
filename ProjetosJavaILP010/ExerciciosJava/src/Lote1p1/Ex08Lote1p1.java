package Lote1p1;
/* 
Programa: Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a.m.
Programador: Marcela Maciel, CodeSorceress24.
Versão 2.0
*/
import javax.swing.JOptionPane;
public class Ex08Lote1p1 {
    public static void main(String[] args) {
        // declaração de variáveis.
        double depósito, aplicação; 
        // entrada de dados.
        depósito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito: "));
        // processamento de dados.
        aplicação = depósito*1.3;
        // saída de dados.
        JOptionPane.showMessageDialog(null, "O valor da aplicação após 1 mês rendendo 1,3% é de: " + aplicação + ".");
    }
}