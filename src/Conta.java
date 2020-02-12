public class Conta {
    private Cliente cliente;
    private double saldo;

    public Conta(){

    }

    public Conta(Cliente cliente, double saldo){
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public void sacar(double qtdDinheiro){
        if(saldo>=qtdDinheiro) {
            saldo -= qtdDinheiro;
            System.out.println("saque efetuado com sucesso!");
        }else{
            System.out.println("saldo indisponivel.");
        }
    }

    public void depositar(double qtdDinheiro){
        saldo+= qtdDinheiro;
    }

    public void consSaldo(){
        System.out.println("saldo atual: R$" + saldo);
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
