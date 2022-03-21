public class CompteBancari{
    private String compte_bancari;

    public CompteBancari(){

    }

    public CompteBancari(String compte_bancari){       
    }

    public String getCompteBancari() {
        return compte_bancari;
    }

    public boolean setReserva(String compte_bancari) {
        if (validarCompteBancari (compte_bancari)){
            this.compte_bancari= compte_bancari;
            return true;
        }else {
            return false;
        }  
    }
    private boolean validarCompteBancari(String compte_bancari2) {
        return false;
    } 
}