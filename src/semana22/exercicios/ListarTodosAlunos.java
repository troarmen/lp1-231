package semana22.exercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ListarTodosAlunos {
    public static void main(String[] args) throws SQLException {
        
        String url = "jdbc:mysql://localhost/jdbcdemo?user=root&password=0000&useSSL=true";
        Connection conn = DriverManager.getConnection(url);

        String sql = "SELECT * FROM alunos";
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(sql);

        while(rs.next()){
            int id = rs.getInt("id");
            String nome = rs.getString("nome");
            String email = rs.getString("email");
            boolean ativo = rs.getBoolean("ativo");

            System.out.println(id);
            System.out.println(nome);
            System.out.println(email);
            System.out.println(ativo);
        }
    }
}
