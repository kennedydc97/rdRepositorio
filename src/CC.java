public class CC extends Conta {
    private double chequeEsp;
    private double divida;

    public CC(Cliente cliente, double saldo, double chequeEsp) {
        super(cliente, saldo);
        this.chequeEsp = chequeEsp;
    }

    public void depCheque(double valorCheque, String bancoEmissor, String data) {
        double saldoConta = getSaldo();
        setSaldo(saldoConta+valorCheque);
    }



    @Override
    public void consSaldo() {
        System.out.println("saldo em Conta Corrente: R$" + getSaldo());
    }

    @Override
    public void sacar(double qtdDinheiro) {
        double saldoConta = getSaldo();
        if (qtdDinheiro <= getSaldo()) {
            setSaldo(getSaldo()-qtdDinheiro);

            System.out.println("saque realizado com sucesso");
            consSaldo();
        }else if(qtdDinheiro > getSaldo() && qtdDinheiro <= getSaldo() + chequeEsp){
            chequeEsp-= qtdDinheiro - getSaldo();
            divida+= qtdDinheiro - getSaldo();
            setSaldo(0);

            System.out.println("saque realizado com sucesso, valor do cheque especial utilizado: " + divida);
            System.out.println("valor restante disponivel em cheque especial: " + chequeEsp);
        }else{
            System.out.println("saldo insuficiente (nem agregando o cheque especial)");
        }




    }
}
