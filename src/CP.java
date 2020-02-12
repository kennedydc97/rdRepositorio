public class CP extends Conta {
    private double rendimento;
    private double taxa;

    public CP(Cliente cliente, double saldo, double taxa) {
        super(cliente, saldo);
        this.taxa= taxa;
    }

    public void recolher(int meses){
        this.rendimento = getSaldo() * meses * taxa;
        System.out.println(rendimento);
        setSaldo(getSaldo()+rendimento);

        System.out.println("saldo após rendimento " + getSaldo());
    }
}
