package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conecta {

    public static Connection getConexion() {
        Connection con = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost;database=BASE_ANIMEFLV";
            String usr = "sa";
            String psw = "alumno";
            con = DriverManager.getConnection(url, usr, psw);
            System.out.println("Conexion Exitosa.!!");
        } catch (ClassNotFoundException ex) {
            System.out.println("No hay Driver!!");
        } catch (SQLException ex) {
            System.out.println("Error con la BD");
        }
        return con;
    }

}
