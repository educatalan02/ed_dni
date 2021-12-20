package ed_dni;

public class DNI {

    public static void main(String[] args) {

    }

    public static char mostrarLetraDNI(int n) {
        char letra[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
                'L', 'C', 'K', 'E' };
        return letra[n % 23];
    }

}