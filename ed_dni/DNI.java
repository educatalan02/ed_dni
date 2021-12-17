package ed_dni;

public class DNI {

    final char[] letra = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
            'H', 'L', 'C', 'K', 'E' };

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("ERROR: Debes pasar el numero de dni como argumento.");
        } else {
            String argDNI = args.toString().trim();

        }

    }

}