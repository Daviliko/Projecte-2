import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

public class Client{
    
    private Dni dni;
    private String nom;
    private String cognom;
    private String telefon;
    private String correu;
    private LocalDate data_naix;
    private String sexe;
    private String usuari;
    private String contrasenya;
    private boolean comunicacio_com;
    private String compte_bancari;
    private String condicio;
    

    public void consultarClient() throws SQLException{

        Scanner teclat = new Scanner(System.in);

        System.out.println("****CONSULTA DNI****");
        System.out.println("Introdueix el DNI del client que vols consultari: ");

        
        String dni = teclat.next();

        Client cli = consultarClientBD(dni);

        if (cli != null){
            System.out.println(cli);
        }else{
            System.out.println("No s'ha trobat el client");
        }
    }

    public Client consultarClientBD(String dni) throws SQLException{

        ConexioBD conGimnas = new ConexioBD();

        Connection con = conGimnas.conexio();
        
        String consulta = "SELECT + FROM clients WHERE dni = ?";

        PreparedStatement sentencia =  con.prepareStatement(consulta);

        sentencia.setString(1, dni);

        ResultSet rs = sentencia.executeQuery();

        if (rs.next()){
            //this.dni = rs.getdni ("dni");            
            this.nom = rs.getString ("nom");
            this.cognom = rs.getString ("cognom");
            this.telefon = rs.getString ("telefon");
            this.correu = rs.getString ("coreu");
            this.data_naix = rs.getDate ("data_naix").toLocalDate();
            this.sexe = rs.getString ("sexe");
            this.usuari = rs.getString ("usuari");
            this.contrasenya = rs.getString ("contrasenya");
            this.comunicacio_com = rs.getBoolean("comunicacio_com");
            this.compte_bancari = rs.getString ("compte_bancari");
            this.condicio = rs.getString ("condicio");

            return this;

         }
        return null;
    }

    public void altaClient(){
        
        Scanner teclat = new Scanner(System.in);

       /* 
        Dni dniObj = new Dni();
        boolean dniCorrecto = false;
        String dni;

        do{

        System.out.println("Introdueix el dni del client que vols donar d'alta:");
        dni = teclat.next();
       
        } while(!dniObj.validarDni(dni));

        this.dni.setDni(dni);
        */
        String dni;
        Dni dniObj = new Dni();

        do{
            System.out.println("Introdueix el dni del client que vols donar d'alta");
            dni = teclat.next();
        }while (!dniObj.validarDni(dni));

        dniObj.setDni(dni);

        
    }

    
    public Dni getDni() {
        return dni;
    }

    public void setDni(Dni dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getCorreu() {
        return correu;
    }

    public void setCorreu(String correu) {
        this.correu = correu;
    }

    public LocalDate getData_naix() {
        return data_naix;
    }

    public void setData_naix(LocalDate data_naix) {
        this.data_naix = data_naix;
    }

    public String getUsuari() {
        return usuari;
    }

    public void setUsuari(String usuari) {
        this.usuari = usuari;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public boolean getComunicacio_com() {
        return comunicacio_com;
    }

    public void setComunicacio_com(boolean comunicacio_com) {
        this.comunicacio_com = comunicacio_com;
    }

    public String getCompte_bancari() {
        return compte_bancari;
    }

    public void setCompte_bancari(String compte_bancari) {
        this.compte_bancari = compte_bancari;
    }

    public String getCondicio() {
        return condicio;
    }

    public void setCondicio(String condicio) {
        this.condicio = condicio;
    }

    public static <ConnexioBD> ConnexioBD getCon() {
        return getCon();
    }

    public static <ConnexioBD> void setCon(ConnexioBD con) {
        return;
    } 
}


