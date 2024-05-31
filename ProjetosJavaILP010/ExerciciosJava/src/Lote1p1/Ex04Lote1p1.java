package Lote1p1;
/* 
Programa: Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em Fahrenheit F = (9*C+160)/5.
Programador: Marcela Maciel, CodeSorceress24.
versão 2.0
*/
import javax.swing.JOptionPane;
public class Ex04Lote1p1 {
    public static void main(String[] args) {
        // declaração de variáveis.
        double celsius, fahrenheit;
        // entrada de dados.
        celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em graus Celsius: "));
        fahrenheit = (9*celsius+160)/5;
        // saída de dados.
        JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é: " + fahrenheit + ".");
    }
}