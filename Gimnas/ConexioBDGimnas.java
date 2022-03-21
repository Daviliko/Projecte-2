import java.sql.Connection;
import java.sql.DriverManager;

public class ConexioBDGimnas{
    
    private static Connection conn;
    private static final String servidor = "jdbc:mysql://localhost:3306/";
    private static final String bbdd = "mamahuevo";
    private static final String user = "root";
    private static final String password = "client";

    public void Conectar(){
        conn = null;
        try{
            Class.forName(servidor);
            conn = DriverManager.getConnection(bbdd, user, password);
            if (conn != null) {
                System.out.println("Connexió establerta");
            }
        }catch (Exception e) {
            System.out.println("Error al conectar-se" + e);
        }
    }

    public Connection getConnection(){
        return conn;
    }

    public void desconectar(){
        conn = null;
        if (conn == null) {
            System.out.println("Connexió acabada");
        }
    }

}