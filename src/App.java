import java.util.Calendar;

public class App {
    public static void main(String[] args) {
        PessoaFisica gabriel = new PessoaFisica();

        Calendar dtNascimentoGabriel = Calendar.getInstance();

        dtNascimentoGabriel.set(1996, 11, 16);

        gabriel.setDtNascimento(dtNascimentoGabriel);

        System.err.println(gabriel.getIdade());

    }
}
