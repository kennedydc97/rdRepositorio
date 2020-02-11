package Lista;

public class JogarDeFutebol {
    private String nome;
    private int energia;
    private int alegria;
    private int gols;
    private int xp;

public JogarDeFutebol(String nome, int energia, int alegria, int gols, int xp){
    this.nome = nome;
    this.energia = energia;
    this.alegria = alegria;
    this.gols = gols;
    this.xp = xp;
}

    public void fazerGol(){
    if(this.energia>=5){
        this.energia-= 5;
        this.alegria+= 10;
        this.gols++;
        System.out.println("GOOOOOL!!!");
    }else{
        System.out.println("energia insuficiente!");
    }
}

    public void correr(){
        if(this.energia>=10) {
            energia -= 10;
            System.out.println("cansei!");
        }else{
            System.out.println("energia insuficiente");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp+= xp;
    }
}
