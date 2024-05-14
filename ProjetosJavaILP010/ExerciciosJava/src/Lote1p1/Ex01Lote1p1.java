package Lote1p1;
/* 
Programa: Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.
Programador: Marcela Maciel, CodeSorceress24.
versão 1.0
*/
import javax.swing.JOptionPane;
public class Ex01Lote1p1 {
    public static void main(String[] args) {
        //declaração de variáveis.
        int lado, area;
        //entrada de dados.
        lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado: "));
        area = lado*lado;
        //saída de dados.
        JOptionPane.showMessageDialog(null, "A área do quadrado é: " + area);
    }
}
