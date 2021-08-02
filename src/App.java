public class App {
    public static void main(String[] args) {
        Conta conta1 = new Conta();

        Conta conta2 = new Conta();

        Pessoa pessoa1 = new Pessoa();

        conta1.setCliente(pessoa1);
        conta2.setCliente(pessoa1);        
    }
}
