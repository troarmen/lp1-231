package projeto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.PreparedStatement;

public class ListarVendasPorDia {
    public static void main(String[] args) throws SQLException{
        String url = "jdbc:mysql://localhost/jdbcdemo?user=root&password=0000&useSSL=true";
        Connection conn = DriverManager.getConnection(url);

        Timestamp diaHorario = Timestamp.valueOf("2023-09-08 12:00:00");

        String sql = "SELECT * FROM venda WHERE diaHorario = ?";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setTimestamp(1, diaHorario);
        ResultSet rs = pstm.executeQuery(sql);

        while(rs.next()){
            int id = rs.getInt("id");
            int idUnidade = rs.getInt("id_unidade");
            int idFuncionario = rs.getInt("id_funcionario");
            int idCliente = rs.getInt("id_cliente");
            int idFormaDePagamento = rs.getInt("id_forma_pagamento");
            Timestamp data = rs.getTimestamp("dia_horario");
            double desconto = rs.getDouble("desconto");
            int parcelas = rs.getInt("parcelas");
            double juros = rs.getDouble("juros");
            
            System.out.println(id);
            System.out.println(idUnidade);
            System.out.println(idFuncionario);
            System.out.println(idCliente);
            System.out.println(idFormaDePagamento);
            System.out.println(data);
            System.out.println(desconto);
            System.out.println(parcelas);
            System.out.println(juros);
        }
    }
}
