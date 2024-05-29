package Lote1p1;
/* 
Programa: Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados.
Programador: Marcela Maciel, CodeSorceress24.
Versão 1.0
*/
import javax.swing.JOptionPane;
public class Ex29Lote1p1 {
    public static void main(String[] args){
        // declaração das variáveis.
        int tipoInvestimento;
        double valorInvestimento, valorCorrigido;
        // entrada dos dados.
        tipoInvestimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de investimento:\n1 = Poupança\n2 = Renda Fixa"));
        valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento: "));
        // processamento dos dados.
        if (tipoInvestimento == 1){
            valorCorrigido = valorInvestimento * 1.03; // poupança com 3% de rendimento.
        } else if (tipoInvestimento == 2){
            valorCorrigido = valorInvestimento * 1.05; // renda Fixa com 5% de rendimento.
        } else {
            JOptionPane.showMessageDialog(null, "Tipo de investimento não considerado.");
            return; // encerra o programa se o tipo de investimento for inválido.
        }
        // saída dos dados.
        JOptionPane.showMessageDialog(null, "O valor corrigido do investimento em 30 dias é: R$ " + String.format("%.2f", valorCorrigido) + ".");
    }
}