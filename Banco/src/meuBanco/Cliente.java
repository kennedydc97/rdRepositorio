package meuBanco;

public class Cliente {
    private String nome;
    private double qtdDinheiro;

    public String getNome(){
        return nome;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public double getqtdDinheiro(){
        return qtdDinheiro;
    }

    public void setQtdDinheiro(double novaQtdDinheiro){
        this.qtdDinheiro = novaQtdDinheiro;
    }

    public void difDeposito(double novaQtdDinheiro){
        this.qtdDinheiro-= novaQtdDinheiro;
    }

    public void difSaque(double novaQtdDinheiro){
        this.qtdDinheiro+= novaQtdDinheiro;
    }

    public Cliente(String novoNome, double novaQtdDinheiro){
        this.qtdDinheiro = novaQtdDinheiro;
        this.nome = novoNome;
    }
}
