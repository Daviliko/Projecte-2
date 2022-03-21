public class Dni {
    
    
    private String dni;
    private int numero;
    private char lletra;

    public boolean validarDni(String dni){

        if (dni.length() != 9) return false;

        return true;

    }

    
    public String getDni() {
        return dni;
    }

    public void setDni() {
        this.dni = dni;
    }


    public void setDni(String dni2) {
    }
        

class ValidadorDNI{

	private String dni;

		public ValidadorDNI(String dni) {
			this.dni = dni;
		}

	
	    public boolean validar() {

		
		String lletraMajuscula = ""; 
			
		
		if(dni.length() != 9 || Character.isLetter(this.dni.charAt(8)) == false ) {
			return false;
		}

		
		
		lletraMajuscula = (this.dni.substring(8)).toUpperCase();

		
		if(soloNumeros() == true && lletraDNI().equals(lletraMajuscula)) {
			return true;
		}
		else {
			return false;
		}
	}

		private boolean soloNumeros() {

			int i, j = 0;
			String numero = ""; 
			String miDNI = ""; 
			String[] unoNueve = {"0","1","2","3","4","5","6","7","8","9"};

			for(i = 0; i < this.dni.length() - 1; i++) {
				numero = this.dni.substring(i, i+1);

				for(j = 0; j < unoNueve.length; j++) {
					if(numero.equals(unoNueve[j])) {
						miDNI += unoNueve[j];
					}
				}
			}

			if(miDNI.length() != 8) {
				return false;
			}
			else {
				return true;
			}
		}

		private String lletraDNI() {
		
		int miDNI = Integer.parseInt(this.dni.substring(0,8));
		int resto = 0;
		String miLetra = "";
		String[] asignacionLetra = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

		resto = miDNI % 23;

		miLetra = asignacionLetra[resto];

		return miLetra;
	    }
    }
}
