package br.edu.empresa.model;

public class Vendedor extends Funcionario {

    private double comissao;
    private int numeroVendas;

    public Vendedor(String nome, String cpf, double comissao, int numeroVendas) {
        super(nome, cpf);
        this.comissao = comissao;
        this.numeroVendas = numeroVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public int getNumeroVendas() {
        return numeroVendas;
    }

    public void setNumeroVendas(int numeroVendas) {
        this.numeroVendas = numeroVendas;
    }

    @Override
    public String getTipo() {
        return "VENDEDOR";
    }

    @Override
    public double calcularSalario() {
        return SALARIO_MINIMO + comissao * numeroVendas;
    }
}
