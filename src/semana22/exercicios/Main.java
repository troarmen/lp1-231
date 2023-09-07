package semana22.exercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import  java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {
        //Criar conexão
        String url = "jdbc:mysql://localhost:3306/jdbcdemo?user=root&password=0000&useSSL=true";
        Connection conn = DriverManager.getConnection(url);

        //Consulta SQL
        String sql = "CREATE TABLE alunos(id INT PRIMARY KEY, nome TEXT, email TEXT, ativo BOOL);";
        Statement stm = conn.createStatement();
        stm.execute(sql);

        //Fechar conexão
        stm.close();
        conn.close();

    }
    
}
