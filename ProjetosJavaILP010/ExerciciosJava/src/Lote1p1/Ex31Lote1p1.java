package Lote1p1;
/* 
Programa: Calcule e mostre o quadrado dos números entre 10 e 150.
Programador: Marcela Maciel, CodeSorceress24.
Versão 1.0
*/
public class Ex31Lote1p1{
    public static void main (String[] args){
        // declaração de variáveis.
        int numero, quadrado;
        // processamento de dados.
        for (numero = 10; numero <= 150; numero++){
            quadrado = numero * numero;
        // saída de dados.
        System.out.println("Quadrado de " + numero + ": " + quadrado + ".");
        }
    }
}