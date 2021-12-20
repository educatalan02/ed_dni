package ed_dni;

public class DNI {

    public static void main(String[] args) {

        if (args.length==0){
            System.out.println("ERROR: Debes pasar el numero del DNI como argumento");
        } else{
            System.out.println(mostrarLetraDNI());
            System.out.println(crearCadenaDNI());
        }

       
        
    }

}