package ed_dni;

public class DNI {

    final static char[] letra = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
            'V',
            'H', 'L', 'C', 'K', 'E' };

    public static void main(String[] args) {

        mostrarLetraDNI("18461590");
        /*
         * if (args.length == 0) {
         * System.out.println("ERROR: Debes pasar el numero de dni como argumento.");
         * } else {
         * String argDNI = args.toString().trim();
         * 
         * mostrarLetraDNI(argDNI);
         * 
         * }
         */

    }

    public static void mostrarLetraDNI(String dni) {

        char letter = (char) (Integer.parseInt(dni) % 23);

        String aux = "";

        switch (letter) {
            case 0:
                aux += letra[0];
                break;
            case 1:
                aux += letra[1];
                break;
        }

        System.out.println("La letra del DNI " + dni + " es " + aux);
    }

}