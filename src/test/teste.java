
package test;

import java.util.Scanner;
import oper.operaciones;


public class teste {

    private static Object ent;
   
    public static void main(String[] args) {              
        System.out.println("Aritmetica\n");      
        menu();      
    }
        
       public static void menu() {
        Scanner ent = new Scanner(System.in);
        int opcion = -1;
        while (opcion != 0) {
            System.out.println("MENÚ\n");
            System.out.println("\t1-. Suma");
            System.out.println("\t2-. Resta");
            System.out.println("\t3-. Multiplicar");
            System.out.println("\t4-. Dividir");
            System.out.println("\t0-. Salir\n");
            
            opcion=ent.nextInt();//importante
            switch (opcion) {
                case 1:
                    operaciones.suma();
                    break;

                case 2:
                    operaciones.resta();
                    break;
                case 3:
                     operaciones.multiplicacion();
                    break;

                case 4:
                    operaciones.division();
                    break;
               
                case 0:
                    break;

                default:
                    System.out.println("\nIntroduzca un número entre 0 y 4");
                    break;
            }
            System.out.println("");
        }
    }
    }
    

