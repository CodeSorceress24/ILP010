package Lote1p1;
/* 
Programa: Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). Calcule e mostre a velocidade média em km/h.
Programador: Marcela Maciel, CodeSorceress24.
Versão 2.0
*/
import javax.swing.JOptionPane;
public class Ex27Lote1p1 {
    public static void main(String[] args) {
        // declaração das variáveis.
        int numeroVoltas;
        double extensaoCircuito, tempoDuracao, distanciaTotal, tempoDuracaoHoras, distanciaTotalKm, velocidadeMedia;
        // entrada dos dados.
        numeroVoltas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de voltas: "));
        extensaoCircuito = Double.parseDouble(JOptionPane.showInputDialog("Digite a extensão do circuito (em metros): "));
        tempoDuracao = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de duração (em minutos): "));
        // processamento de dados.
        distanciaTotal = numeroVoltas * extensaoCircuito; // cálculo da distância total percorrida (em metros)
        tempoDuracaoHoras = tempoDuracao / 60.0; // conversão do tempo de duração de minutos para horas
        distanciaTotalKm = distanciaTotal / 1000.0; // conversão da distância total de metros para quilômetros
        velocidadeMedia = distanciaTotalKm / tempoDuracaoHoras; // cálculo da velocidade média (em km/h)
        // saída de dados.
        JOptionPane.showMessageDialog(null, "A velocidade média é: " + String.format("%.2f", velocidadeMedia) + " km/h" + ".");
    }
}