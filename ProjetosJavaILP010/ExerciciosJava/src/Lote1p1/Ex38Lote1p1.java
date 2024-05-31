package Lote1p1;
/* 
Programa: Receba 100 números inteiros reais. Verifique e mostre o maior e o menor valor. Obs.: somente valores positivos.
Programador: Marcela Maciel, CodeSorceress24.
Versão 1.0
*/
import javax.swing.JOptionPane;
public class Ex38Lote1p1
{
    public static void main(String[] args)
    {
      
        int i, maior, menor, num;

        num = 0;
        maior = 0;
        menor = 0;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        for(i = 0; i < 100; i++)
        {
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
            if(num > maior)
            {
                maior = num;
            }
            else if(num < menor)
            {
                menor = num;
            }
        }
        JOptionPane.showMessageDialog(null,"O maior número é: "+maior);
        JOptionPane.showMessageDialog(null,"O menor número é: "+menor);
    }
}