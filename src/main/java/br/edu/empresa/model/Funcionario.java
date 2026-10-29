package br.edu.empresa.model;

public abstract class Funcionario {
// Referência didática, sem vínculo com o valor legal vigente.

    protected static final double SALARIO_MINIMO = 1600.00;
    private int id;
    private String nome;
    private String cpf;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public abstract String getTipo();

    public abstract double calcularSalario();
}
