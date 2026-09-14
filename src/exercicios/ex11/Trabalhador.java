package exercicios.ex11;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Trabalhador {

    //ATRIBUTOS
    private String nome;
    private Senioridade status;
    private double baseSalarial;

    // ASSOCIACOES
    private Departamento departamento;
    private List<ContratoHora> contratos = new ArrayList<>();


    //CONSTRUTORES
    public Trabalhador() {
    }

    public Trabalhador(String nome, Senioridade status, double baseSalarial, Departamento departamento) {
        this.nome = nome;
        this.status = status;
        this.baseSalarial = baseSalarial;
        this.departamento = departamento;
    }


    //GET E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Senioridade getStatus() {
        return status;
    }

    public void setStatus(Senioridade status) {
        this.status = status;
    }

    public double getBaseSalarial() {
        return baseSalarial;
    }

    public void setBaseSalarial(double baseSalarial) {
        this.baseSalarial = baseSalarial;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public List<ContratoHora> getContratos() {
        return contratos;
    }



    //METODOS
    public void addContrato(ContratoHora contratoHora){
        contratos.add(contratoHora);
    }

    public void removeContrato(ContratoHora contratoHora){
        contratos.remove(contratoHora);
    }

    public double income(int ano,int mes){
        double sum = baseSalarial;
        for(ContratoHora c : contratos){

            int c_ano = c.getData().getYear();
            int c_mes = c.getData().getMonthValue();
            if(c_ano == ano && c_mes == mes){
                sum += c.valorTotal();
            }
        }return sum;
    }


}