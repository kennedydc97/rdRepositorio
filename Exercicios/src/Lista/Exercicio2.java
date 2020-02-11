package Lista;

public class Exercicio2 {
    public static void main(String[] args) {
        JogarDeFutebol Neymar = new JogarDeFutebol("meninoNey", 10, 10, 10, 10);
        JogarDeFutebol CR7 = new JogarDeFutebol("CR7", 11, 11, 11, 11);
        SessaoDeTreinamento treinoA = new SessaoDeTreinamento();

        treinoA.treinarA(Neymar);
        treinoA.treinarA(CR7);
    }
}
