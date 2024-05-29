package Lote1p1;
/* 
Programa: Receba 3 coeficientes (A, B e C) de uma equação de 2º grau da fórmula: AX²+BX+C=0. Verifique e mostre a existência de raízes reais e se, caso exista, calcule e mostre.
Programador: Marcela Maciel, CodeSorceress24.
Versão 1.0
*/
import javax.swing.JOptionPane;
public class Ex21Lote1p1 {
    public static void main(String[] args) {
        // declaração de variáveis.
        double nota1, nota2, nota3, nota4, media;
        // entrada de dados.
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:"));
        nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota:"));
        // processamento de dados.
        media = (nota1 + nota2 + nota3 + nota4)/4;
        // saída de dados.
        if (media >= 6.0) {
            JOptionPane.showMessageDialog(null, "Média: " + String.format("%.2f", media) + "." + "\n O aluno está aprovado.");
        } else if (media >= 3.0) {
            JOptionPane.showMessageDialog(null, "Média: " + String.format("%.2f", media) + "." + "\n O aluno terá que realizar o exame.");
        } else {
            JOptionPane.showMessageDialog(null, "Média: " + String.format("%.2f", media) + "." + "\n O aluno está retido.");
        }
    }
}