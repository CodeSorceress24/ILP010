package Lote1p1;
/* 
Programa: Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.
Programador: Marcela Maciel, CodeSorceress24.
Versão 1.0
*/
import javax.swing.JOptionPane;
public class Ex35Lote1p1 {
    public static void main(String[] args) {
        // declaração de variáveis.
        int numero1, numero2;
        int maior, menor;
        int soma = 0;
        // entrada de dados.
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro: "));
        // processamento de dados.
        if (numero1 > numero2){ // verifica qual número é maior.
            maior = numero1;
            menor = numero2;
        } else {
            maior = numero2;
            menor = numero1;
        }
        for (int i = menor + 1; i < maior; i++){ // calcula e soma os números ímpares entre os valores.
            if (i % 2 != 0) {
                soma += i;
            }
        }
        // saída de dados.
        JOptionPane.showMessageDialog(null, "O maior número entre " + numero1 + " e " + numero2 + " é: " + maior + "." +
                "\nA soma dos números ímpares entre eles é: " + soma + ".");
    }
}