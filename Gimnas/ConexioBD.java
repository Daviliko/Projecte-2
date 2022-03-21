import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexioBD {
    
    private static Connection conexioBD = null;

    public Connection conexio(){

        String servidor = "jdbc:mysql://localhost:3306/";
        String bbdd = "mamahuevo";
        String user = "root";
        String password = "client";
        
            try {
            conexioBD = DriverManager.getConnection(servidor + bbdd, user, password); 

                if(conexioBD !=null){
                System.out.println("Connexió establerta");
                }

            }catch (SQLException e) {
                System.out.println("Hi ha hagut un error al connectar-se a la base de dades");
             } 
    
            getConnection();{
                
             }
            return null;
    }

    private void getConnection() {
    }
}
