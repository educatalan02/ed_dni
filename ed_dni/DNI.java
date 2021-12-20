package ed_dni;

public class DNI {

    public static void main(String[] args) {

        // System.out.println(crearCadenaDNI(18461590));
    }

    public static String crearCadenaDNI(int n) {
        String dni = Integer.toString(n);

        return String.format("%8s", dni).replace(" ", "0") + mostrarLetraDNI(n));
    }

}