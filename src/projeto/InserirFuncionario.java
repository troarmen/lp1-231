package projeto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InserirFuncionario{
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/lojadecarros?user=root&password=0000&useSSL=true";
        Connection conn = DriverManager.getConnection(url);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ID do funcionário que deseja inserir: ");
        int id = sc.nextInt();

        System.out.println("Digite o ID do cargo: ");
        int idCargo = sc.nextInt();

        sc.nextLine();

        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o email: ");
        String email = sc.nextLine();

        System.out.println("Digite o contato: ");
        String contato = sc.nextLine();

        System.out.println("Digite o CPF: ");
        String cpf = sc.nextLine();

        System.out.println("Digite a data de nascimento(aaaa-mm-dd): ");
        String dataNascimento = sc.nextLine();

        System.out.println("Digite o endereço: ");
        String endereco = sc.nextLine();

        System.out.println("Digite o complemento: ");
        String complemento = sc.nextLine();

        System.out.println("Digite o salário fixo: ");
        double salarioFixo = sc.nextDouble();

        System.out.println("Digite a comissão(porcentagem): ");
        int comissao = sc.nextInt();

        String sql = "INSERT INTO funcionario VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, id);
        pstm.setInt(2, idCargo);
        pstm.setString(3, nome);
        pstm.setString(4, email);
        pstm.setString(5, contato);
        pstm.setString(6, cpf);
        pstm.setString(7, dataNascimento);
        pstm.setString(8, endereco);
        pstm.setString(9, complemento);
        pstm.setDouble(10, salarioFixo);
        pstm.setInt(11, comissao);
        pstm.executeUpdate();

        pstm.close();
        conn.close();

        
    }
}
