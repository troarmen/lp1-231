package semana22.exercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeletarAluno {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/jdbcdemo?user=root&password=0000&useSSL=true";
        Connection conn = DriverManager.getConnection(url);

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o ID do aluno que deseja excluir: ");
        int id = sc.nextInt();

        String sql = "DELETE FROM alunos WHERE id = ?";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, id);
        pstm.executeUpdate();

        pstm.close();
        conn.close();
    }
}