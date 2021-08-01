public class Conta {
    private Pessoa cliente;
    private int nrConta;
    private double saldo;

    public Pessoa getCliente() {
        return this.cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public int getNrConta() {
        return this.nrConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void abrirConta() {
        System.out.println("Abrindo conta...");
    }

    public double sacar(double valor) {
        this.debitar(valor);
        return valor;
    }

    private void debitar(double valor) {
        this.saldo -= valor;
    }

    protected boolean temSaldo(double valor) {
        if(valor <= this.getSaldo()) return true;
        return false;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void transferir(double valor, Conta contaDest) {
        if(this.temSaldo(valor)) {
            contaDest.depositar(valor);
            this.debitar(valor);
        }
    }

}
