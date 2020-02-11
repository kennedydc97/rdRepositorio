package Mamiferos;

public class Cachorro extends Mamifero {
    private String raca;
    private int idade;

    public String brincar(){
        return "brincando";
    }

    public Cachorro(String novaRaca, int novaIdade){
        this.raca = novaRaca;
        this.idade = novaIdade;
    }

    public String getRaca(){
        return raca;
    }
    public void setRaca(String novaRaca){
        this.raca = novaRaca;
    }
}
