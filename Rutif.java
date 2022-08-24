import java.util.InputMismatchException;
import java.util.Scanner;
public class menu {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir); {

            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Salir");
            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();
                try {
                    switch (opcion) {
                        case 1:
                            System.out.println("has seleccionado la opcion 1");
                            imprimirsuma(suma());
                            break;
                        case 2:
                            System.out.println("Has seleccionado la opcion 2");
                            break;
                        case 3:
                            System.out.println("Has seleccionado la opcion 3");
                            break;
                        case 4:
                            salir = true;
                            break;
                        case 5:
                            salir=true;
                            break;
                        default:
                            System.out.println("Solo números entre 1 y 4");
                    }

                }
                catch (InputMismatchException e) {
                System.out.println("Error al ingresar el numero");
                sn.next();
            }
        }
    }





    public static int suma(){
        int suma=7;
        return suma;
    }
    public static int multiplicacion(){
        int multiplicacion=5;
        return multiplicacion;
    }
    public static int division(){
        int division=10;
        return division;
    }
    public static void imprimirsuma(int suma){
        System.out.println(suma());
    }

}
