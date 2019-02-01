package src1.tareas;

import libs.Input;


public class Botellas_Agua {

    public static void main(String args[])     {

        System.out.print("Cuantos minutos estuvo?\n");
        float c = Input.get_float();
        float resultado = c*12;
        System.out.print("Usted gasto "+resultado+" botellas");
        }
    }


