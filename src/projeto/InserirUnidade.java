package projeto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InserirUnidade {
    public static void main(String[] args) throws SQLException{
        String url = "jdbc:mysql://localhost/lojadecarros?user=root&password=0000&useSSL=true";
        Connection conn = DriverManager.getConnection(url);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ID: ");
        int id = sc.nextInt();

        System.out.println("Digite o ID da direção: ");
        int idDirecao = sc.nextInt();

        System.out.println("Digite o ID da cor: ");
        int idCor = sc.nextInt();

        System.out.println("Digite o ID da versão: ");
        int idVersao = sc.nextInt();

        System.out.println("Digite o ano ");
        int ano = sc.nextInt();

        sc.nextLine();

        System.out.println("Digite a placa: ");
        String placa = sc.nextLine();

        System.out.println("Digite a quilometragem: ");
        int km = sc.nextInt();

        System.out.println("Digite o valor unitário: ");
        int valorUnitario = sc.nextInt();

        System.out.println("Digite a disponibilidade: ");
        boolean disponobilidade = sc.nextBoolean();

        String sql = "INSERT INTO unidade VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, id);
        pstm.setInt(2, idDirecao);
        pstm.setInt(3, idCor);
        pstm.setInt(4, idVersao);
        pstm.setInt(5, ano);
        pstm.setString(6, placa);
        pstm.setInt(7, km);
        pstm.setInt(8, valorUnitario);
        pstm.setBoolean(9, disponobilidade);

        pstm.close();
        conn.close();
    }
}
