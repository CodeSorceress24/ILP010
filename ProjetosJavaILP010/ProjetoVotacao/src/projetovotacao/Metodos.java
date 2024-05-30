/*
Nome do programa: Sistema de votação.
Objetivo: Carregar seção/número eleitor, classificar por seção, votacao2024 e mostrar indicadores.                   
Nome do programador: Paulo e Marcela.
Data de desenvolvimento: 22/05/2024.
Versão 1.0
 */
import java.util.Random;
public class Metodos
{
    public Votacao2024[] FCADRASTRAVOTACAO(Votacao2024[] votacao2024)
    {
        int i;
        Random random = new Random();
        
        for(i = 0 ; i < 200; i++)
        {
            votacao2024[i] = new Votacao2024();
        }
        
        for(i = 0; i < 200; i++)
        {
            votacao2024[i].numeroSecao = random.nextInt(11); // número da seção de 0 a 10.
            votacao2024[i].numeroCandidato = random.nextInt(301); // número do candidato de 0 a 300.
            System.out.println("Número da seção: " + votacao2024[i].numeroSecao + ". Número do candidato: " + votacao2024[i].numeroCandidato + ".")
        }
        return votacao2024;
    }
}