public class Activitat{
    private String activitat;

    public Activitat(){

    }

    public Activitat(String activitat){       
    }

    public String getActivitat() {
        return activitat;
    }

    public boolean setActivitat(String activitat) {
        if (validarActivitat (activitat)){
            this.activitat= activitat;
            return true;
        }else {
            return false;
        }  
    }
    private boolean validarActivitat(String activitat2) {
        return false;
    } 
}