package ed_dni;

public class DNI {

    public static void main(String[] args) {

        // System.out.println(crearCadenaDNI(18461590));

        if (args.length == 0) {
            System.out.println("ERROR: Debes pasar el numero del DNI como argumento");
        } else {
            System.out.println("La letra del DNI " + args[0] + " es " + mostrarLetraDNI(Integer.parseInt(args[0])));
            System.out.println("El DNI completo es " + crearCadenaDNI(Integer.parseInt(args[0])));
        }
    }

    public static String crearCadenaDNI(int n) {

        String dni = String.format("%8s", Integer.toString(n)).replace(" ", "0");

        return dni + mostrarLetraDNI(n);

    }

}