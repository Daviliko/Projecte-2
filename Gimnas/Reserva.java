public class Reserva{
    private String reserva;

    public Reserva(){

    }

    public Reserva(String reserva){       
    }

    public String getreserva() {
        return reserva;
    }

    public boolean setReserva(String reserva) {
        if (validarReserva (reserva)){
            this.reserva= reserva;
            return true;
        }else {
            return false;
        }  
    }
    private boolean validarReserva(String reserva2) {
        return false;
    } 
}