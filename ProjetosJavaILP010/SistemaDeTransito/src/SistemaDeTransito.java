import javax.swing.JOptionPane;
public class SistemaDeTransito {
    public static void main(String[] args) {
        // declaração de variáveis:
        int menu = 0;
        // entrada de dados:
        while (menu != 9){
            menu = Integer.parseInt(JOptionPane.showInputDialog(
                "MENU - Sistema de Trânsito.\n1 - Cadastro de estatística.\n2 - Consulta por quantidade de acidentes.\n3 - Consulta por estatística de acidentes.\n4 - Acidentes acima da média das 10 cidades.\n9 - Encerrar."));
            switch (menu) {
                //cadastro de dados: código da cidade, nome da cidade, quantidade de acidentes.
                case 1:
                    break;
                //consulta por quantidade de acidentes, sendo >100 e <500.
                case 2:
                    break;
                //consulta por menor/maior número de acidentes.
                case 3:
                    break;
                //consulta por cidades com quantidade de acidentes acima da média das 10 cidades.
                case 4:
                    break;
                //finaliza o programa.
                case 9:
                    break;
                //entrada de qualquer outro valor, vulgo padrão.      
                default: 
                    JOptionPane.showMessageDialog(null, "Opção inválida."); //caixa de diálogo caso o usuário escolha algum dígito fora do intervalo dos casos.
                    break;
            }
        }
    
    }
}