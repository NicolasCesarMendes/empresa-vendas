package br.edu.empresa.model;

public class Gerente extends Funcionario {

    private double bonificacao;

    public Gerente(String nome, String cpf, double bonificacao) {
        super(nome, cpf);
        this.bonificacao = bonificacao;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double b) {
        this.bonificacao = b;
    }

    @Override
    public String getTipo() {
        return "GERENTE";
    }

    @Override
    public double calcularSalario() {
        return 6 * SALARIO_MINIMO + bonificacao;
    }
}
