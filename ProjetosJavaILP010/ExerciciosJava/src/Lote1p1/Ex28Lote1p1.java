package Lote1p1;
/* 
Programa: Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que:
- Se a média mensal de vendas for menor que 500 unidades e o preço atual for menor que 30 reais, o novo preço será o preço atual acrescido de 10%.
- Se a média mensal de vendas estiver entre 500 e 999 unidades (inclusive) e o preço atual estiver entre 30 e 79 reais (inclusive), o novo preço será o preço atual acrescido de 15%.
- Se a média mensal de vendas for maior ou igual a 1000 unidades e o preço atual for maior ou igual a 80 reais, o novo preço será o preço atual reduzido em 5%.
- Para todas as outras condições, o novo preço será igual ao preço atual.
Programador: Marcela Maciel, CodeSorceress24.
Versão 2.0
*/
import javax.swing.JOptionPane;
public class Ex28Lote1p1 {
    public static void main(String[] args) {
        // declaração das variáveis.
        double precoAtual, precoNovo;
        int vendaMensal;
        // entrada dos dados.
        precoAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço atual do produto: "));
        vendaMensal = Integer.parseInt(JOptionPane.showInputDialog("Digite a média mensal de vendas do produto: "));
        // processamento dos dados.
        if (vendaMensal < 500 && precoAtual < 30){
            precoNovo = precoAtual * 1.10; // aumento de 10%
        } else if (vendaMensal >= 500 && vendaMensal < 1000 && precoAtual >= 30 && precoAtual < 80){
            precoNovo = precoAtual * 1.15; // aumento de 15%
        } else if (vendaMensal >= 1000 && precoAtual >= 80){
            precoNovo = precoAtual * 0.95; // redução de 5%
        } else {
            precoNovo = precoAtual; // preço permanece o mesmo.
        }
        // saída dos dados.
        JOptionPane.showMessageDialog(null, "O novo preço do produto é: R$ " + String.format("%.2f", precoNovo) + ".");
    }
}