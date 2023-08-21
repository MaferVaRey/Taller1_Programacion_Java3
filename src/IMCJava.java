import java.util.Scanner;
public class IMCJava {

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su peso (en kilogramos): ");
        double peso = sc.nextDouble();
        System.out.println("Ingrese su altura (en metros): ");
        double altura = sc.nextDouble();
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();

        double IMC = peso/(Math.pow(altura, 2));

        System.out.println("Altura ingresada: "+ altura);
        System.out.println("Peso ingresado: "+ peso);
        System.out.println("Edad ingresada: "+ edad);
        System.out.println("Índice de masa corporal calculado: "+ IMC);

        if (edad<45){
            if (IMC<22.0){
                System.out.println("Su condición de riesgo es baja");
            }
            else if (IMC>=22.0){
                System.out.println("Su condición de riesgo es media");
            }
        }
        else{
            if (IMC<22.0){
                System.out.println("Su condición de riesgo es media");
            }
            else if (IMC>=22.0){
                System.out.println("Su condición de riesgo es alta");
            }
        }
    }
}
