// definição de genérico.
public class Estatistica {
    // declaração de variáveis:
    int codCidade;
    String nomeCidade;
    int qntdAcidentes;
    // método construtor vazio.
    Estatistica() {
        this(0,"",0);
    }
    // procedimento construtor:
    Estatistica(int cidade, String nCidade, int qtdAcid) {
        codCidade = cidade;
        nomeCidade = nCidade;
        qntdAcidentes = qtdAcid;
    // classe objeto abstrato é a junção do construtor vazio e procedimento construtor, + variáveis.
    }
}
