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

            case 2:
                aux += letra[2];
                break;

            case 3:
                aux += letra[3];
                break;
            
            case 4:
                aux += letra[4];
                break;    

            case 5:
                aux += letra[5];
                break;

            case 6:
                aux += letra[6];
                break;

            case 7:
                aux += letra[7];
                break;

            case 8:
                aux += letra[8];
                break;

            case 9:
                aux += letra[9];
                break;

            case 10:
                aux += letra[10];
                break;

            case 11:
                aux += letra[11];
                break;

            case 12:
                aux += letra[12];
                break;

            case 13:
                aux += letra[13];
                break;

            case 14:
                aux += letra[14];
                break;

            case 15:
                aux += letra[15];
                break;

            case 16:
                aux += letra[16];
                break;

            case 17:
                aux += letra[17];
                break;

            case 18:
                aux += letra[18];
                break;

            case 19:
                aux += letra[19];
                break;

            case 20:
                aux += letra[20];
                break;

            case 21:
                aux += letra[21];
                break;

            case 22:
                aux += letra[22];
                break;
        }

        System.out.println("La letra del DNI " + dni + " es " + aux);
    }

}