package meuBanco;

public class Conta {
    private Cliente cliente;
    private int nmrConta;
    private double saldo;

    public void deposito(double qtdDinheiro){
        if (cliente.getqtdDinheiro() >= qtdDinheiro) {
            saldo += qtdDinheiro;
            cliente.difDeposito(qtdDinheiro);
            System.out.println("saque feito com sucesso!");
        }
    }

    public void saque(double qtdDinheiro){
        if (saldo>=qtdDinheiro) {
            saldo -= qtdDinheiro;
            cliente.difSaque(qtdDinheiro);
        }
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double novoSaldo){
        this.saldo = novoSaldo;
    }

    public int getNmrConta(){
        return nmrConta;
    }

    public void setNmrConta(int novoNmrConta) {
        this.nmrConta = novoNmrConta;
    }

    public Conta(Cliente cliente, int novoNmrConta, double novoSaldo){
        this.cliente = cliente;
        this.nmrConta = novoNmrConta;
        this.saldo = novoSaldo;
    }
}



