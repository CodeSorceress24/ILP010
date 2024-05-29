package Lote1p1;
/* 
Programa: Receba a data de nascimento e atual em ano, mês e dia. Calcule e mostre a idade em anos, meses e dias, considerando os anos bissextos.
Programador: Marcela Maciel, CodeSorceress24.
Versão 1.0
*/
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.Period;
public class Ex30Lote1p1 {
    public static void main(String[] args){
        // declaração das variáveis.
        int anoNascimento, mesNascimento, diaNascimento;
        int anoAtual, mesAtual, diaAtual;
        // entrada de dados.
        anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento:"));
        mesNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês de nascimento:"));
        diaNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia de nascimento:"));
        anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual:"));
        mesAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês atual:"));
        diaAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia atual:"));
        // processamento de dados.
        // criação de objetos LocalDate para a data de nascimento e data atual.
        LocalDate dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
        LocalDate dataAtual = LocalDate.of(anoAtual, mesAtual, diaAtual);
        // calculando o período entre as duas datas.
        Period periodo = Period.between(dataNascimento, dataAtual);
        int anos = periodo.getYears();
        int meses = periodo.getMonths();
        int dias = periodo.getDays();
        // saída de dados.
        JOptionPane.showMessageDialog(null, "Idade: " + anos + " anos, " + meses + " meses e " + dias + " dias.");
    }
}