import java.util.Calendar;

public class PessoaFisica extends Pessoa {
    private int cpf;
    private Calendar dtNascimento;
    private String genero;

    public int getCpf() {
        return this.cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Calendar getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Calendar dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {

        Calendar today = Calendar.getInstance();

        int difference = today.get(1) - this.dtNascimento.get(1);

        return difference;
    }
}
