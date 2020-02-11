package Banco;

public class Conta {
    private Cliente cliente;
    private double saldo;

    public Conta(Cliente cliente, double saldo){
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public void saque(double valor) {
        if (saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Seu saldo é: " + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void deposito(double valor){
            if(valor > 0){
                this.saldo += valor;
                System.out.println("Deposito realizado com sucesso!");
            }else{
                System.out.println("Valor inválido para deposito!");
            }
        }
    }
