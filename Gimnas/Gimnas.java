import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Gimnas{
   
    private String nom;
    private String CIF;
    private String telefon;
    

    ArrayList<Client> clients;

    static Scanner teclat = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);
    boolean sortir = false;
    boolean sortir2 = false;
    int opció; //Guardem l'opció de l'usuari
   

    public void gestionarGimnas(){

        do {
            System.out.println("************MENÚ GIMNAS************");
            System.out.println("1. Manteniment Client");
            System.out.println("2. Visualitzar Clients");
            System.out.println("3. Visualitzar Activitats més reservades");
            System.out.println("4.Sortir ");
            System.out.println("\nTria una opcio:" + "\n");

            int opció = teclat.nextInt();
            

            System.out.println("el numero " + opció);

            // el switch si tries una opcio surt del menu

            switch (opció) {
                case 1:
                    do {

                        System.out.println("1. Llistar tots els Clients");
                        System.out.println("2. Alta Client");
                        System.out.println("3. Baixa Client");
                        System.out.println("4. Modificacio Client");
                        System.out.println("s. Sortir");
                        String sa = sc.next();
                        char opcio2 = sa.charAt(0);
                        System.out.println("la opcio: " + opcio2);
                        switch (opcio2) {
                            case '1':
                                llistartotselsclients();

                                break;
                            case '2':
                                AltaClient();

                                break;
                                
                            case '3':
                                BaixaClient();

                                break;
                                
                            case '4':
                                ModificacioClient();

                                break;

    
                            case 's':
                                sortir2 = true;
                                break;

                        }

                    } while (!sortir2);
                    break;

                switch (opció) {
                    case 2:
                        do {
        
                            System.out.println("1. Ordenats per cognom");
                            System.out.println("2. Ordenats per edat del client i visualitzant l’edat");
                            System.out.println("3. Ordenats per més reserves fetes fins el moment actual");
                            System.out.println("s. Sortir");
                            String sa = sc.next();
                            char opcio2 = sa.charAt(0);
                            System.out.println("la opcio: " + opcio2);
                            switch (opcio2) {
                                case '1':
                                    Ordenatscognom();
        
                                    break;
                                case '2':
                                    Ordenatsedat();
        
                                    break;
                                        
                                case '3':
                                    Ordenatsreserves();
        
                                    break;
            
                                case 's':
                                   sortir2 = true;
                                    break;
        
                                }
        
                            } while (!sortir2);
                            break;
                             
                    
                case 4:
                    sortir = true;
                    break;
                default:
                    System.out.println("opcio no valida");
            }

        }while (!sortir);

        
    }
   
    private void Ordenatsreserves() {
    }



    private void Ordenatsedat() {
    }



    private void Ordenatscognom() {
    }



    private void ModificacioClient() {
    }


    private void BaixaClient() {
    }


    private void AltaClient() {
    }


    private void llistartotselsclients() {
    }
}



    