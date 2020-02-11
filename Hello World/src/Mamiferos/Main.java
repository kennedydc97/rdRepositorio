package Mamiferos;

public class Main {
    public static void main(String[] args) {
        Cachorro pluto = new Cachorro("dog alemão", 2);
        Cachorro rex = new Cachorro("doberman", 5);
        Pessoa Kennedy = new Pessoa();
        Leao Simba = new Leao();
        pluto.setRaca("DOG ALEMÃO");
        rex.setRaca("Doberman");
        Kennedy.setEtnia("Branco");
        Simba.setPatas(4);

        System.out.println(pluto.comer());
        System.out.println(Kennedy.correr());
        System.out.println(Simba.correr());

        System.out.println(pluto.getRaca());
        System.out.println(Kennedy.getEtnia());
        System.out.println(Simba.getPatas());
    }
}
