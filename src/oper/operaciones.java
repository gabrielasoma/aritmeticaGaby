
package oper;

import java.util.Scanner;


public class operaciones {
       static Scanner ent = new Scanner(System.in);
              
    public static void suma(){
        int numero1;
        int numero2;
        int total;
        
        System.out.println("Introduce un numero: ");
        numero1 = ent.nextInt();
        
        System.out.println("Introduce otro numero");
        numero2 = ent.nextInt();
        
        total = numero1 +numero2;
        System.out.println("La suma es: "+ total);
    }
    
    
     public static void resta(){
        int numero1;
        int numero2;
        int total;
        
        System.out.println("Introduce un numero: ");
        numero1 = ent.nextInt();
        
        System.out.println("Introduce otro numero");
        numero2 = ent.nextInt();
        
        total = numero1 - numero2;
        System.out.println("La resta es: "+ total);
    }
    
      public static void multiplicacion(){
        int numero1;
        int numero2;
        int total;
        
        System.out.println("Introduce un numero: ");
        numero1 = ent.nextInt();
        
        System.out.println("Introduce otro numero");
        numero2 = ent.nextInt();
        
        total = numero1 * numero2;
        System.out.println("La multiplicacion es: "+ total);
    }
      
        public static void division(){
        int numero1;
        int numero2;
        int total;
        
        System.out.println("Introduce un numero: ");
        numero1 = ent.nextInt();
        
        System.out.println("Introduce otro numero");
        numero2 = ent.nextInt();
        
        total = numero1 / numero2;
        System.out.println("La division es: "+ total);
        
        }  
    }
    

