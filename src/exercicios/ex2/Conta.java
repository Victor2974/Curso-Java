package exercicios.ex2;

public class Conta {
    
    private int numeroConta;
    private String titular;
    private double saldo;


    public Conta(int numeroConta, String titular, double saldo){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Conta(int numeroConta, String titular){
        this.numeroConta = numeroConta;
        this.titular = titular;
    }



    public int getNumero_conta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double x) {
        this.saldo = saldo + x;
    }

    public void saque(double x){
        this.saldo = saldo - x;
    }



    



}
