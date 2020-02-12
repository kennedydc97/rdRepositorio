public class Cliente {
    private String nmrCliente;
    private String sobrenome;
    private String RG;
    private String CPF;

    public Cliente(){

    }

    public Cliente(String nmrCliente, String sobrenome, String RG, String CPF){
        this.nmrCliente = nmrCliente;
        this.sobrenome = sobrenome;
        this.RG = RG;
        this.CPF = CPF;
    }
}
