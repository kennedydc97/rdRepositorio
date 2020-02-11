package meuBanco;

public class Main {
    public static void main(String[] args) {
        Cliente Kennedy = new Cliente("Kennedy", 10000.53);
        Conta kAccount = new Conta(Kennedy, 192873, 0);
        kAccount.deposito(11000);
        kAccount.saque(200);


        System.out.printf("novo saldo: %.2f", Kennedy.getqtdDinheiro());
        System.out.println("");

        System.out.println(kAccount.getSaldo());
        System.out.println(Kennedy);

        System.out.println(Kennedy.getqtdDinheiro());




    }
}
