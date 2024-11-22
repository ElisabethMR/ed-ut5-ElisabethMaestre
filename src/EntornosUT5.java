
    public class EntornosUT5 {
        private String nombre;
        private String DNI;
        private double saldo;

        public EntornosUT5(String nombre, String DNI) {
            this.nombre = nombre;
            this.DNI = DNI;
            this.saldo = 0;
        }
        public void IngresarDinero(double MasDinero) {
            if (MasDinero < 0) {
                System.out.println("No se puede ingresar una cantidad negativa.");
                return;
            }
            saldo += MasDinero;
        }
        public boolean SacarDinero(double MenosDinero){
            if(MenosDinero > saldo){
                System.out.println("La operación no es válida");
                return false;
            }
            else {
                saldo = saldo - MenosDinero;
                System.out.println("La operación es válida");
                return true;
            }
        }
        public void MostrarInformación(){
            System.out.println("Nombre del titular: " + nombre+ "\n"+ "DNI: " + DNI + "\n" + "Saldo: "+ saldo+ "\n");
        }

    }


