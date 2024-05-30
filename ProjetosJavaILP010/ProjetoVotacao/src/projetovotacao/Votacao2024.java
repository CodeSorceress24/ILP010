/*
Nome do programa: Sistema de votação.
Objetivo: Método construtor e procedimentos de chamada de dados e exibição dos mesmos.
Nome do programador: Paulo e Marcela.
Data de desenvolvimento: 22/05/2024.
Versão 1.0
 */
package projetovotacao;
// import java.util.Random;
class Votacao2024
{
    int numeroSecao;
    int numeroCandidato;

    Votacao2024() // construtor.
    {
        this (0,0);
    }

    Votacao2024(int numSec, int numCand) // procedimento método construtor.
    {
        numeroSecao = numSec;
        numeroCandidato = numCand;
    }
}