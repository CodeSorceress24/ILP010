package Lote1p1;
/* 
Programa: Calcule e mostre quantos anos serão necessários para que Ana seja maior que Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.
Programador: Marcela Maciel, CodeSorceress24.
Versão 2.0
*/
public class Ex43Lote1p1 {
    public static void main(String[] args) {
        // declaração de variáveis.
        double alturaAna = 1.10;
        double alturaMaria = 1.50;
        double crescimentoAna = 0.03;  // 3 cm em metros
        double crescimentoMaria = 0.02;  // 2 cm em metros
        int anos = 0;
        // processamento de dados.
        while (alturaAna <= alturaMaria) {
            alturaAna += crescimentoAna;
            alturaMaria += crescimentoMaria;
            anos++;
        }
        // saída de dados.
        System.out.println("Serão necessários " + anos + " anos para que Ana seja maior que Maria.");
    }
}