package Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class TestaConexao {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            System.out.println("Conexão Aberta!");
        } catch (Exception ex) {
            // handle the error
        }
    }
}
