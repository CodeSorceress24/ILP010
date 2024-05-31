package Lote1p1;
/* 
Programa: Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.
Programador: Marcela Maciel, CodeSorceress24.
Versão 2.0
*/
import javax.swing.JOptionPane;
public class Ex15Lote1p1 {
    public static void main(String[] args) {
        // declaração de variáveis.
        Double cateto1, cateto2, hipotenusa;
        // entrada de dados.
        cateto1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do primeiro cateto: "));
        cateto2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do segundo cateto: "));
        // processamento de dados. 
        hipotenusa = (Math.pow(cateto1, 2)) + (Math.pow(cateto2, 2));
        hipotenusa = Math.sqrt(hipotenusa);
        // "o quadrado da medida da hipotenusa é igual à soma dos quadrados das medidas dos catetos", logohipotenusa = c² = a²+b².
        // saída de dados.
        JOptionPane.showMessageDialog(null, "O valor da hipotenusa é: " + hipotenusa + ".");
        }
}