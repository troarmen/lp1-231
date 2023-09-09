package projeto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InserirCliente {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/lojadecarros?user=root&password=0000&useSSL=true";
        Connection conn = DriverManager.getConnection(url);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ID do funcionário que deseja inserir: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o e-mail: ");
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

        String sql = "INSERT INTO cliente VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, id);
        pstm.setString(2, nome);
        pstm.setString(3, email);
        pstm.setString(4, contato);
        pstm.setString(5, cpf);
        pstm.setString(6, dataNascimento);
        pstm.setString(7, endereco);
        pstm.setString(8, complemento);
        pstm.executeUpdate();

        pstm.close();
        conn.close();



    }
}
