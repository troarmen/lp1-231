package semana22.exercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarAluno {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/jdbcdemo?user=root&password=0000&useSSL=true";
        Connection conn = DriverManager.getConnection(url);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ID do aluno que deseja atualizar: ");
        int id = sc.nextInt();

        sc.nextLine(); // Limpar o buffer do teclado

        System.out.println("Digite o novo nome do aluno: ");
        String novoNome = sc.nextLine();

        System.out.println("Digite o novo email do aluno: ");
        String novoEmail = sc.nextLine();

        System.out.println("Digite o novo status de ativo (true/false): ");
        boolean novoAtivo = sc.nextBoolean();
        
        String sql = "UPDATE alunos SET nome = ?, email = ?, ativo = ? WHERE id = ?";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, novoNome);
        pstm.setString(2, novoEmail);
        pstm.setBoolean(3, novoAtivo);
        pstm.setInt(4, id);
        pstm.executeUpdate();

        pstm.close();
        conn.close();
    }
}
