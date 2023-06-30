package project;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class koneksiDatabase {
    private Connection connection;

    public Connection getKoneksi() {

        String jdbcUrl = "jdbc:mysql://localhost:3306/todo_list";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcUrl, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(koneksiDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
//    }
//    private static java.sql.Connection conn;
//    
//    public static java.sql.Connection getKoneksi()
//    {
//        if (conn == null) {
//            try {
//                String url = "jdbc:mysql://localhost:3306/todo_list";
//                String user = "root";
//                String password = "";
//                Class.forName("com.mysql.jdbc.Driver");
//                conn = DriverManager.getConnection(url, user, password);
//                System.out.println("Koneksi Berhasil");
//        } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, e);
//        }
//        } 
//        return conn;
    }
    
}

