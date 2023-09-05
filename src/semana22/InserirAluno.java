package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InserirAluno {
    public static void main(String[] args) throws SQLException {
        //1. Criar a conexão
        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
        Connection conn = DriverManager.getConnection(url);

        int id = 1;
        String nome = "Maria da Silva";
        String email = "maria@email.com";
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
