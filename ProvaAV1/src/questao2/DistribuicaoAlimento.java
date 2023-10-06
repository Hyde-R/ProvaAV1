package questao2;

//Prova de Luan Maxwell R.A = 12118287
public class DistribuicaoAlimento extends Projeto{

    private String descAlimento;
    private float qtde;

    public DistribuicaoAlimento(String nomeProjeto, String descricao, String endereco, String dataInicio, String dataFim, String descAlimento, float qtde) {
        super(nomeProjeto, descricao, endereco, dataInicio, dataFim);
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }

    public String getDescAlimento() {
        return descAlimento;
    }

    public void setDescAlimento(String descAlimento) {
        this.descAlimento = descAlimento;
    }

    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }

    public boolean validaProjeto(String nomeProjeto) {
        if(getDataFim() == null){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String imprimeProjeto() {
        return "Nome projeto: " + getNomeProjeto() + "\nDescrição: " + getDescricao()
                + "\nData Início: " + getDataInicio() + "\nData Fim: " + getDataFim()
                + "\nDescrição Alimento: " + getDescAlimento() + "\nQuantidade: " + getQtde();
    }
}
