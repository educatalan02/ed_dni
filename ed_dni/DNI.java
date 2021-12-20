package ed_dni;

public class DNI {

    public static void main(String[] args) {

<<<<<<< HEAD
        // System.out.println(crearCadenaDNI(18461590));
    }

    public static String crearCadenaDNI(int n) {
        

        return String.format("%8s", Integer.toString(n)).replace(" ", "0") + mostrarLetraDNI(n));
=======
       
    }
    public static char mostrarLetraDNI(int n){
        char letra[] ={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        return letra[n%23];
>>>>>>> jordi
    }

}