package Lista;

public class SessaoDeTreinamento {
    private int xp;

    public SessaoDeTreinamento() {

    }


    public void treinarA(JogarDeFutebol jogador) {
        System.out.println("experiência inicial: " + jogador.getXp());
        this.xp = jogador.getXp();
        jogador.correr();
        jogador.fazerGol();
        jogador.correr();
        this.xp++;
        jogador.setXp(this.xp);
        System.out.println("experiência final: " + jogador.getXp());
    }
}