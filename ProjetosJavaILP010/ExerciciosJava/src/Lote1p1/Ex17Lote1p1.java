package Lote1p1;
/* 
Programa: Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
Programador: Marcela Maciel, CodeSorceress24.
Versão 2.0
*/
import javax.swing.JOptionPane;
public class Ex17Lote1p1 {
    public static void main(String[] args) {
        // declaração de variáveis. 
        Double tempoPercurso, velocidadeMedia, distancia, litrosGastos;
        // entrada de dados.
        tempoPercurso = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo do percurso em horas: "));
        velocidadeMedia = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade média em quilômetros/hora: "));
        // processamento de dados.
        distancia = tempoPercurso * velocidadeMedia;
        litrosGastos = distancia/12; // levando em consideração que o automóvel faz 12 quilômetros/litro.
        // saída de dados.
        JOptionPane.showMessageDialog(null, "A quantidade de litros gastos em uma viagem, considerando que o automóvel faz 12km/l é de: " + litrosGastos + " litros.");
    }
}