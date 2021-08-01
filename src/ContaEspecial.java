public class ContaEspecial extends Conta {
    private double limite;

    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    protected boolean temSaldo(double valor) {
        if(valor <= this.getLimite()) return true;
        return false;
    }

    @Override
    public void abrirConta() {

        System.out.println("Abrindo conta...");

    }

}
