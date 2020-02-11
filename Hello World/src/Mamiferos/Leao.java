package Mamiferos;

public class Leao extends Mamifero {
    private int patas;

    public String correr(){
        return "estou correndo pakrai";
    }

    public int getPatas(){
        return patas;
    }

    public void setPatas(int novasPatas) {
        this.patas = novasPatas;
    }
}
