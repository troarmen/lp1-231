package projeto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ListarUnidadesPorAno {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/jdbcdemo?user=root&password=0000&useSSL=true";
        Connection conn = DriverManager.getConnection(url);

        int ano = 2020; //ano de exemplo

        String sql = "SELECT * FROM unidade WHERE ano = ?";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, ano);
        ResultSet rs = pstm.executeQuery(sql);

        while(rs.next()){
            int id = rs.getInt("id");
            int idDirecao = rs.getInt("id_direcao");
            int idCor = rs.getInt("id_cor");
            int idVersao = rs.getInt("id_versao");
            int novoAno = rs.getInt("ano");
            int placa = rs.getInt("placa");
            int km = rs.getInt("km");
            int valorUnitario = rs.getInt("valor_unitario");
            boolean disponibilidade = rs.getBoolean("disponibilidade");
        }
    }
}
