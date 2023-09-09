package projeto;

import java.sql.Timestamp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ListarFuncionarioPorSalario {
    public static void main(String[] args) throws SQLException{
		String url = "jdbc:mysql://localhost/lojadecarros?user=root&password=0000&useSSL=true";
		Connection conn = DriverManager.getConnection(url);

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o salário pelo qual desejas buscar: ");
		double salario = sc.nextDouble();

		String sql = "SELECT * FROM funcionario WHERE salario_fixo = ?";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setDouble(1, salario);
        ResultSet rs = pstm.executeQuery();

        while(rs.next()){
            int id = rs.getInt("id");
            int idCargo = rs.getInt("id_cargo");
            String nome = rs.getString("nome");
            String email = rs.getString("email");
            String contato = rs.getString("contato");
            String cpf = rs.getString("cpf");
            Timestamp dataNascimento = rs.getTimestamp("data_nascimento");
            String endereco =  rs.getString("endereco");
            String complemento = rs.getString("complemento");
            double salarioFixo = rs.getDouble("salario_fixo");
            int comissao = rs.getInt("comissao");
            
            System.out.println(id);
            System.out.println(idCargo);
            System.out.println(nome);
            System.out.println(email);
            System.out.println(contato);
            System.out.println(cpf);
            System.out.println(dataNascimento);
            System.out.println(endereco);
            System.out.println(complemento);
            System.out.println(salarioFixo);
            System.out.println(comissao);
        }
    }
}
