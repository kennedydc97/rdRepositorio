public class Main {
    public static void main(String[] args) {
        Cliente kennedy = new Cliente("128738192", "dourado", "123718923", "18237813812");
        Cliente john = new Cliente("38127389", "fitzgerald", "38912391", "182973891237");
        Conta conta1 = new Conta(kennedy,100);
        Conta contap = new Conta(john, 200);
        CC cCorrente = new CC(kennedy, conta1.getSaldo(), 500);
        CP cPoupança = new CP(john, contap.getSaldo(), 0.10);


        cCorrente.consSaldo();
        cCorrente.sacar(200);
        cCorrente.consSaldo();
        cCorrente.depositar(1000);
        cCorrente.consSaldo();
        cCorrente.sacar(2000);
        cCorrente.depCheque(500, "itau", "20/12/2020");
        cCorrente.consSaldo();
        cCorrente.sacar(1400);
        System.out.println("--------- Conta poupança ------");
        cPoupança.depositar(200);
        cPoupança.consSaldo();
        cPoupança.recolher(2);





    }
}
