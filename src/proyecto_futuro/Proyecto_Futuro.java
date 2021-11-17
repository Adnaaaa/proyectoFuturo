
package proyecto_futuro;

import java.util.Scanner;


public class Proyecto_Futuro {

   
    public static void main(String[] args) {
       String nombre;
       String modulos;
       String horas;
       
       
       Scanner sc= new Scanner (System.in);
       System.out.println("Introduce tu nombre");
       nombre=sc.nextLine();
       System.out.println("Introduce numero de modulos en los que te has matriculado");
       modulos =sc.nextLine();
       System.out.println("Introduce numero de horas de estudio semanal");
       horas=sc.nextLine();
      
       
       System.out.println(""+Proyecto_Futuro.veredictor(modulos, horas));
   }
    public static String veredictor (String valor1, String valor2){
        if (valor1.equals(valor2)) {
 return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
         }
 
        if (Integer.valueOf(valor1) > Integer.valueOf(valor2)){
        return "Poco tiempo de estudio. Debes dedicar más tiempo.";
                }
            return "Ideal. Trabajas los contenidos en casa.";
     
        
   
      

 

       
   }}
  
   
    

