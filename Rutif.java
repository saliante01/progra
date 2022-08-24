import java.util.Scanner;

public class Rutif {

    public static void main(String[] args){
        System.out.print("El número verificador es: "+ multiplicarsumar());
    }

    public static int digitarRut(){
        int rut;
        Scanner leer= new Scanner(System.in);
        System.out.print("Ingrese el Rut(sin puntos ni dígito verificador)");
        return rut=leer.nextInt();
    }

    public static int invertir(){
        int rut= digitarRut();
        int cifra, inverso = 0;
        while(rut!=0){
            cifra = rut%10;
            inverso = (inverso * 10) + cifra;
            rut/=10;
        }
        return inverso;
    }

    public static int multiplicarsumar(){
        int d=Integer.toString(invertir()).length();
        int a=invertir();
        int suma = 0;
        int contador=2;

        for(int i=0; i<d;i++){
            String num = String.valueOf(Integer.toString(a).charAt(i));
            if(contador<=7){
                suma=suma+(Integer.parseInt(num)*contador);
                contador=contador+1;
            }if(contador==8){
                suma=suma+(Integer.parseInt(num)*2);

                contador=contador+1;
            }if(contador==9){
                suma=suma+(Integer.parseInt(num)*3);
                contador=contador+1;
            }
        }
        return suma;

    }

    public static int division(){
        int division=multiplicarsumar();
        return division/11;
    }


    public static int cortardecimales(){
        int multiplicar=division();
        return multiplicar*11;
    }

    public static int valorAbsoluto(){
        int a=multiplicarsumar();
        int b=cortardecimales();
        int resta=a-b;

        if(resta<0){
            return resta*(-1);
        }else{
            return resta;
        }
    }

    public static int digitoVerificador(){
        int digito=11-valorAbsoluto();
        int k=100;
        int cero=0;
        if(digito==10){
            return (k);
        }if(digito==11){
            return cero;
        }else{
            return digito;
        }
    }
    while (choice != 0) {
    while(true) {
        try
        {
            BufferedReader menuInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.println();
            System.out.println("Please choose between the following options:'");
            System.out.println(" (1) Make new animal");
            System.out.println(" (2) Feed Animals");
            System.out.println(" (3) Count animals");
            System.out.println(" (0) Quit");
            System.out.print("Enter your choice: ");;
            choice = Integer.parseInt(menuInput.readLine());
        } catch (NumberFormatException ex) {
            System.err.println("Not a valid number");
        } catch (IOException e) {
            System.out.println("Failed to get input");
        }
    }
    // first choice option:
    if (choice == 1) {
        //actions
    }
    // second choice option:
    if (choice == 2) {
        //actions
    }
    if (choice==3){
        //actions
    }
}

