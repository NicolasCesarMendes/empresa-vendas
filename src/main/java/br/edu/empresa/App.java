package br.edu.empresa;

import java.sql.Connection;
import java.sql.SQLException;

import br.edu.empresa.config.Conexao;

public class App {

    public static void main(String[] args) {
        try (Connection c = Conexao.conectar()) { //try-why-resources
            System.out.println("Conectado ao banco: " + c.getCatalog());
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
