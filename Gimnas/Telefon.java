public class Telefon{
    private String telefon;

    public Telefon(){

    }

    public Telefon(String correu){       
    }

    public String getTelefon() {
        return telefon;
    }

    public boolean setTelefon(String telefon) {
        if (validarTelefon (telefon)){
            this.telefon= telefon;
            return true;
        }else {
            return false;
        }  
    }
    private boolean validarTelefon(String telefon) {
        if (telefon.length()!=9){
            System.out.println("El telefon ha de tenir 9 dígits");
            return false;
        }else{
            for (int i=0; i<telefon.length(); i++){
                if(! (telefon.charAt(i)>='0' && telefon.charAt(i)>='9')){
                    System.out.println("Tots els dígits han de ser númerics");
                    return false;
                }
            }
        }
        return false;
    } 
}