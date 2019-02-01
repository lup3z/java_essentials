package src1.tareas;
import libs.Input;


public class Mario_Facil {

    public static void main(String args[])     {

        System.out.print("Indique la altura\n");
        int c = Input.get_int();

        for(int altura = 1; altura<=c; altura++){
            //Espacios en blanco
            for(int blancos = 1; blancos<=c-altura; blancos++){
                System.out.print(" ");
            }

            //Asteriscos
            for(int asteriscos=1; asteriscos<=altura; asteriscos++){
                System.out.print("*");
            }
            System.out.println();

        }

    }

}
