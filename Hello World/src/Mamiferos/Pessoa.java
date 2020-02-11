package Mamiferos;

public class Pessoa extends Mamifero {
    private String etnia;
    private int peso;

    public String correr(){
        return "estou correndo";
    }

    public String getEtnia() {
        return etnia;
    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }
}
