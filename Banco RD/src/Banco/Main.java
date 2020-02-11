package Banco;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Kennedy", "132132321");

        Conta conta1 = new Conta(cliente1, 0.0);

        conta1.deposito(1.20);
        conta1.saque(500);
    }
}
