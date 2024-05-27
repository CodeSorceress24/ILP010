package Lote1p1;
/* 
Programa: Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes. Calcule o salário que serão as horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.
Programador: Marcela Maciel, CodeSorceress24.
Versão 1.0
*/
import javax.swing.JOptionPane;
public class Ex16Lote1p1 {
    public static void main(String[] args) {
        // declaração de variáveis.
        Double horasTrabalhadas, valorHora, percentualDesconto, salarioBruto, salarioLiquido, salarioFinal;
        int qntdDescendentes;
        final Double acrescimoDependente = 100.0;
        // entrada de dados. 
        horasTrabalhadas = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas: "));
        valorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por hora: "));
        percentualDesconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto: "));
        qntdDescendentes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de descendentes: "));
        // processamento de dados. 
        salarioBruto = horasTrabalhadas*valorHora;
        Double desconto = salarioBruto*(percentualDesconto/100);
        salarioLiquido = salarioBruto-desconto;
        salarioFinal = salarioBruto-desconto+qntdDescendentes*acrescimoDependente;
        // saída de dados.
        JOptionPane.showMessageDialog(null, "O salário bruto será de: R$ " + String.format("%.2f", salarioBruto) + 
                                      ".\nO salário líquido será de: R$ " + String.format("%.2f", salarioLiquido) + 
                                      ".\nE o total com acréscimo de R$ 100 por dependente, será de: R$ " + String.format("%.2f", salarioFinal) + ".");
    }
}