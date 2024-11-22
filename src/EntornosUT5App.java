public class EntornosUT5App {
        public static void main(String[] args) {
            EntornosUT5 Persona1 = new EntornosUT5("Elisabeth", "76668762X");
            EntornosUT5 Persona2 = new EntornosUT5("Mario", "45666782Q");

            Persona1.IngresarDinero(3000);
            Persona2.IngresarDinero(1500);

            Persona1.MostrarInformación();
            Persona2.MostrarInformación();

            Persona1.SacarDinero(2000);
            Persona2.SacarDinero(3000);
        }

    }

