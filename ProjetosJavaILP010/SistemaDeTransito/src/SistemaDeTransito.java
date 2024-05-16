/*
Programa: sistema de trânsito.
Programador: Marcela Maciel, CodeSorceress24.
versão 01, 15/05/2024.
*/
import javax.swing.JOptionPane;
public class SistemaDeTransito {
    public static void main(String[] args) {
        // instâncias: 
        Metodos met = new Metodos();
        //criação de instância, vetor:
        Estatistica[] vetor = new Estatistica[10];
        // transformação de métodos e estatísticas em classes instanciadas.
        // depois da criação do objeto abstrato, não é mais necessário alteração.
        // executor do construtor:
        for (int cta = 0 ; cta < vetor.length ; cta++){
            vetor[cta] = new Estatistica();
        }
        // declaração de variáveis:
        // variável só é global se tiver static antes.
        int menu = 0;
        // entrada de dados:
        while (menu != 9){
            menu = Integer.parseInt(JOptionPane.showInputDialog(
                "MENU - Sistema de Trânsito.\n" +
                "Estatísticas de acidentes em 2020.\n" +
                "1 - Cadastro de estatística.\n" + 
                "2 - Consulta por quantidade de acidentes.\n" + 
                "3 - Consulta por estatística de acidentes.\n" +
                "4 - Acidentes acima da média das 10 cidades.\n" +
                "9 - Encerrar."));
            switch (menu) {
                // cadastro de dados: código da cidade, nome da cidade, quantidade de acidentes.
                case 1:
                // chamada de procedimento dentro de outra classe com a instância met.nomeDoProcedimento.
                    met.cadastroEstatisticas(vetor);
                    break;
                // consulta por quantidade de acidentes, sendo >100 e <500.
                case 2:
                    met.AcidentesMaior100Menor500(vetor);
                // o resultado da consulta é exibido em console.
                    break;
                // consulta por menor/maior número de acidentes.
                case 3:
                    met.menorMaiorAcidentes(vetor);
                    break;
                // consulta por cidades com quantidade de acidentes acima da média das 10 cidades.
                case 4:
                    met.maiorQueMedia(vetor);
                    break;
                // finaliza o programa.
                case 9:
                    break;
                // entrada de qualquer outro valor, vulgo padrão.      
                default: 
                    JOptionPane.showMessageDialog(null, "Opção inválida."); // caixa de diálogo caso o usuário escolha algum dígito fora do intervalo dos casos.
                    break;
            }
        }
    
    }
}