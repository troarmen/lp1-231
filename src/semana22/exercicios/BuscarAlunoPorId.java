package semana22.exercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BuscarAlunoPorId {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/jdbcdemo?user=root&password=0000&useSSL=true";
        Connection conn = DriverManager.getConnection(url);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o id para buscar o aluno: ");
        int id = sc.nextInt();
        
        String sql = "SELECT * FROM alunos WHERE id = ?";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, id);
        ResultSet rs = pstm.executeQuery();

        while (rs.next()) {
            int alunoId = rs.getInt("id");
            String nome = rs.getString("nome");
            String email = rs.getString("email");
            boolean ativo = rs.getBoolean("ativo");

            System.out.println("ID: " + alunoId);
            System.out.println("Nome: " + nome);
            System.out.println("Email: " + email);
            System.out.println("Ativo: " + ativo);
        }

        // Feche os recursos
        rs.close();
        pstm.close();
        conn.close();
    }
}
