/*
Nome do programa: Sistema de votação.
Objetivo: Sistema de votação.
Nome do programador: Paulo e Marcela.
Data de desenvolvimento: 22/05/2024.
Versão 1.0
*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class ProjetoVotacao
{
    public static void main(String[] args) throws IOException
    {
        int opcao = 0, i;

        Votacao2024[] votacao2024 = new Votacao2024[200];
        Metodos m = new Metodos();
        
        while(opcao != 9)
        {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(" SISTEMA DE VOTAÇÃO\n 1 - Carregar seção/número do eleitor.\n 2 - Classificar por seção.\n 3 - Gravar registros.\n 4 - Mostrar indicadores.\n 9 - Finalizar."));
                switch(opcao)
                {
                    case 1:
                    votacao2024 = m.FCADRASTRAVOTACAO(votacao2024);
                    break;
                    
                    case 2:
                    break;
                    
                    case 3:
                    break;
                    
                    case 4:
                    break;
                    
                    case 9:
                    break;
                    
                    default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
                }
        }
    
    }
}