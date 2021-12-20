package ed_dni;

public class DNI {

    public static void main(String[] args) {

        // System.out.println(crearCadenaDNI(18461590));
    }

    public static String crearCadenaDNI(int n) {
        

        return String.format("%8s", Integer.toString(n)).replace(" ", "0") + mostrarLetraDNI(n));
    }

}