public class ContaPoupanca extends Conta {
    private double txCorrecao;

    public double getTxCorrecao() {
        return this.txCorrecao;
    }

    public void setTxCorrecao(double txCorrecao) {
        this.txCorrecao = txCorrecao;
    }

    public void atualizaSaldoRendimento() {
        System.err.println("Atualizando saldo rendimento...");
    }

    @Override
    public void abrirConta() {
        System.out.println("Abrindo conta...");
    }
}
