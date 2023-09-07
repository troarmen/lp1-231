package semana22.exercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InserirAluno {
    public static void main(String[] args) throws SQLException {
        //1. Criar a conexão
        String url = "jdbc:mysql://localhost/jdbcdemo?user=root&password=0000&useSSL=true";
        Connection conn = DriverManager.getConnection(url);

        int id = 2;
        String nome = "Tro Armen";
        String email = "tro@email.com";
        boolean ativo = true;

    
        //2. Executar a consulta SQL
        String sql = "INSERT INTO alunos VALUES(?, ?, ?, ?)";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, id);
        pstm.setString(2, nome);
        pstm.setString(3, email);
        pstm.setBoolean(4, ativo);
        pstm.executeUpdate();

        //3. Fechar conexão
        pstm.close();
        conn.close();
    }
    
}
