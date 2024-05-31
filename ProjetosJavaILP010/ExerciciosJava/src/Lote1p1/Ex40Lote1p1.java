package Lote1p1;
/* 
Programa: Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.
Programador: Marcela Maciel, CodeSorceress24.
Versão 2.0
*/
import javax.swing.JOptionPane;

public class Ex40Lote1p1 {
    public static void main(String[] args) {
        // declaração de variáveis.
        int num1, num2, menor, maior;
        // entrada de dados.
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro: "));
        // determinar o menor e o maior número.
        if (num1 < num2) {
            menor = num1;
            maior = num2;
        } else {
            menor = num2;
            maior = num1;
        }
        // verificar e mostrar números primos entre menor e maior.
        StringBuilder primos = new StringBuilder();
        for (int i = menor; i <= maior; i++) {
            if (isPrime(i)) {
                primos.append(i).append(" ");
            }
        }
        // saída de dados.
        if (primos.length() > 0) {
            JOptionPane.showMessageDialog(null, "Números primos entre " + menor + " e " + maior + ":\n" + primos.toString());
        } else {
            JOptionPane.showMessageDialog(null, "Não há números primos entre " + menor + " e " + maior + ".");
        }
    }
    // método auxiliar para verificar se um número é primo.
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}