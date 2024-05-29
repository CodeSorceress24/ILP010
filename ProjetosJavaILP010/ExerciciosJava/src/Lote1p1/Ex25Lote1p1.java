package Lote1p1;
/* 
Programa: Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. Mostre os 4 números em ordem crescente.
Programador: Marcela Maciel, CodeSorceress24.
Versão 1.0
*/
import javax.swing.JOptionPane;
public class Ex25Lote1p1 {
    public static void main(String[] args){
        // entrada de dados.
        int horaInicio = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de início do jogo (0 a 23):"));
        int minInicio = Integer.parseInt(JOptionPane.showInputDialog("Digite os minutos de início do jogo (0 a 59):"));
        int horaTermino = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de término do jogo (0 a 23):"));
        int minTermino = Integer.parseInt(JOptionPane.showInputDialog("Digite os minutos de término do jogo (0 a 59):"));
        // cálculo do tempo de jogo em horas e minutos.
        int horasJogo, minutosJogo;
        // processamento de dados.
        if (horaInicio <= horaTermino) {
            horasJogo = horaTermino - horaInicio;
        } else {
            horasJogo = 24 - horaInicio + horaTermino;
        }
        if (minInicio <= minTermino) {
            minutosJogo = minTermino - minInicio;
        } else {
            horasJogo--;
            minutosJogo = 60 - minInicio + minTermino;
        }
        // Saída do tempo de jogo
        JOptionPane.showMessageDialog(null, "O tempo de jogo foi de " + horasJogo + " horas e " + minutosJogo + " minutos.");
    }
}