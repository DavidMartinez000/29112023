import java.sql.*;
public class conector {
    public static void main(String[] args) {
        System.out.println("Conectando ao banco de dados...");
        conectar();
    }
    public static Connection conectar() {
        String host = "127.0.0.1";
        String mysqlUser = "root";
        String mysqlPass = "senac@02"; // pode colocar vazio (sem senha)
        String url = "jdbc:mysql://127.0.0.1/test?user=root&password=senac@02";
        // String url = "jdbc:mysql://%host/test?user=%mysqlUser&password=%mysqlPass".format(host, mysqlUser, mysqlPass);
        String status = "Nada aconteceu";
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url);
            status = "Connection opened";
        } catch (SQLException e) {
            status = "Erro SQLException: " + e;
        } catch (ClassNotFoundException e) {
            status = "Erro ClassNotFoundException: " + e;
        } catch (Exception e) {
            status = "Erro Exception: " + e;
        }
        System.out.println(status);
        return conn;
    }
}