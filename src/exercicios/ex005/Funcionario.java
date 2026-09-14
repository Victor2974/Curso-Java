package exercicios.ex5;

public class Funcionario{

    private int id;
    private String name;
    private double salario;

    public Funcionario(int id, String name, double salario){
        this.id = id;
        this.name = name;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void aumento(double aumento){
        salario += salario * (aumento/100);
    }


    @Override
    public String toString() {
        
        return id + ", "+ name + ", R$" + salario + "\n";
    }


}
