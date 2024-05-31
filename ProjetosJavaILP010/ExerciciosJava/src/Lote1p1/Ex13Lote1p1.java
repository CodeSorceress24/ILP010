package Lote1p1;
/* 
Programa: Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia.
Programador: Marcela Maciel, CodeSorceress24.
Versão 2.0
*/
import javax.swing.JOptionPane;
public class Ex13Lote1p1 {
    public static void main(String[] args) {
        // declaração de variáveis.
        Double qntdQuilo, qntdGrama, duraçãoDias;
        // entrada de dados.
        qntdQuilo = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de alimento em quilos: "));
        // processamento de dados.
        qntdGrama = qntdQuilo*1000; // converte a quantidade de alimento de quilos para gramas.
        duraçãoDias = qntdGrama/50;
        // saída de dados.
        JOptionPane.showMessageDialog(null, "Consumindo 50 gramas de alimento por dia, essa quantidade irá durar: " + duraçãoDias + " dias.");
    }
}