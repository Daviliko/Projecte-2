public class CorreuElectronic{
    private String correu;

    public CorreuElectronic(){

    }

    public CorreuElectronic(String correu){       
    }

    public String getCorreu() {
        return correu;
    }

    public boolean setCorreu(String correu) {
        if (validarCorreu (correu)){
            this.correu = correu;
            return true;
        }else {
            return false;
        }  
    }
    private boolean validarCorreu(String correu2) {
        return false;
    }
    
}