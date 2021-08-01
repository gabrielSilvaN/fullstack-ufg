public class PessoaJuridica extends Pessoa {

    private int cnpj;
    private String atividade;

    public int getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getAtividade() {
        return this.atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

}
