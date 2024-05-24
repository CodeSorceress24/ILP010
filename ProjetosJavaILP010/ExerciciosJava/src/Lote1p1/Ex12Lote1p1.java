package Lote1p1;
/* 
Programa: Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.
Programador: Marcela Maciel, CodeSorceress24.
Versão 1.0
*/
import javax.swing.JOptionPane;
public class Ex12Lote1p1 {
    public static void main(String[] args) {
        // declaração de variáveis.
        int anoNascimento, anoAtual, idade, idadeFutura;
        // entrada de dados.
        anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento: "));
        anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
        // processamento de dados.
        idade = anoAtual-anoNascimento;
        idadeFutura = idade+17;
        // saída de dados.
        JOptionPane.showMessageDialog(null,"A idade atual é de: " + idade + " anos. E a idade futura será: " + idadeFutura);
    }
}