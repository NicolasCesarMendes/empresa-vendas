package br.edu.empresa.model;

public class Consultor extends Funcionario {

    private double valorHora;
    private int horasTrabalhadas;

    public Consultor(String nome, String cpf, double valorHora, int horasTrabalhadas) {
        super(nome, cpf);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double v) {
        this.valorHora = v;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int h) {
        this.horasTrabalhadas = h;
    }

    @Override
    public String getTipo() {
        return "CONSULTOR";
    }

    @Override
    public double calcularSalario() {
        return valorHora * horasTrabalhadas;
    }
}
