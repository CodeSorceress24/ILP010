import javax.swing.JOptionPane;

public class Metodos {
    // criação de método/procedimento/FUNÇÃO (função tem tipo e retorno):
       public Estatistica[] cadastroEstatisticas(Estatistica[] cidade){
        for (int cta = 0 ; cta < cidade.length ; cta++){
        // tudo dentro dessa chave é conteúdo do for.
            cidade[cta].codCidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da cidade: "));
            cidade[cta].nomeCidade = (JOptionPane.showInputDialog("Digite o nome da cidade: "));
            cidade[cta].qntdAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de acidentes da cidade: "));
            // exibir em terminal a entrada de dados:
            // System.out.println(cidade[cta].codCidade);
            // System.out.println(cidade[cta].nomeCidade);
            // System.out.println(cidade[cta].qntdAcidentes);
        }
        JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso.");
        return cidade;
       }

       // todos com exceção do caso1, são procedimentos vazios que não retornam a lugar algum.
       // void garante que não haverá retorno.
       public void AcidentesMaior100Menor500(Estatistica[] cidade){
        for (int cta = 0 ; cta < cidade.length ; cta++) {
        if ( cidade[cta].qntdAcidentes > 100 && cidade[cta].qntdAcidentes < 500) {
                // mostra nome e código da cidade no intervalo.
                 System.out.println("\nCidade dentro do intervalo. Nome: "+ cidade[cta].nomeCidade + "\nCódigo: " + cidade[cta].codCidade);
        // JOptionPane.showMessageDialog(null, "Cidade dentro do intervalo. Nome da cidade: " + cidade[cta].nomeCidade + " e código: " + cidade[cta].codCidade);
        System.out.println("...");
        // mensagem de saída, ao fim do processo.
        JOptionPane.showMessageDialog(null, "Verificação concluída.");
        }
       }
    }

        public void menorMaiorAcidentes(Estatistica[] cidade){
            // definição de variáveis:
        int maior = -1, menor = -1;
        int maiorAcidenteCidades = -1, menorAcidenteCidades = -1;
        for (int cta = 0; cta < cidade.length; cta++){
            if (maior == -1){ // se primeira entrada:
                maior = cidade[cta].qntdAcidentes;
                maiorAcidenteCidades = cta;
                menor = cidade[cta].qntdAcidentes;
                menorAcidenteCidades = cta;
            } else { // proximas entradas
                if (cidade[cta].qntdAcidentes > maior){
                    maior = cidade[cta].qntdAcidentes;
                    menorAcidenteCidades = cta;
                }
                if (cidade[cta].qntdAcidentes < menor){
                    menor = cidade[cta].qntdAcidentes;
                    menorAcidenteCidades = cta;
                }
            }
        }
        System.out.println("\nCidade com a maior quantidade de acidentes: " + cidade[maiorAcidenteCidades].nomeCidade);
        System.out.println("Quantidade de acidentes: " + cidade[maiorAcidenteCidades].qntdAcidentes);
        System.out.println("\nCidade com a menor quantidade de acidentes: " + cidade[menorAcidenteCidades].nomeCidade);
        System.out.println("Quantidade de acidentes: " + cidade[menorAcidenteCidades].qntdAcidentes);
        // mensagem de saída, após o fim do procedimento.
        JOptionPane.showMessageDialog(null, "Verificação concluída.");
    }
    public void maiorQueMedia(Estatistica[] cidade){
        // definição de variáveis:
        int mediaTotal = 0, mediaQuant = 0;
        // cálculo de média:
        for(int cta = 0; cta < cidade.length; cta++){
            mediaTotal += cidade[cta].qntdAcidentes;
            mediaQuant += 1;
        }
        mediaTotal = mediaTotal/mediaQuant;
        // saída, cidades com maiores quantidades de acidentes que a média.
        System.out.println("\nNome e quantidade de acidente das cidade acima da média: \n");
        for (int cta = 0; cta < cidade.length; cta++){
            if (cidade[cta].qntdAcidentes > mediaTotal){
                System.out.println (cidade[cta].nomeCidade + "\n" + cidade[cta].qntdAcidentes);
            }
        }
        // Mensagem de saída
        JOptionPane.showMessageDialog(null, "Verificação concluída.");
    }
    }
    
