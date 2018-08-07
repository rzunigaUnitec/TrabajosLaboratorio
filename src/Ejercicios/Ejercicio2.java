
package Ejercicios;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        String NombreEmpleado;
        double salario=0.00;
        double impuesto=0.00;
        
        System.out.print("Ingrese Nombre De Empleado: ");
        NombreEmpleado=lea.next();
        System.out.print("Ingrese Salario: ");
        salario=lea.nextDouble();
        
        if((salario>=(0.01)/12)&& (salario<(152557.15)/12)){
            
            impuesto=(salario*0);
        }
        if((salario>=(152557.16)/12) && (salario<(232622.61)/12)){
            
            impuesto=(salario*0.15)/12;            
        }
        if((salario>=(232622.62)/12) && (salario<(540982.82)/12)){
            
            impuesto=(salario*0.20)/12;         
                    
        }else if(salario>=(540982.83)/12){
            
            impuesto=(salario*0.25)/12;
        }    
         System.out.println("Salario Mensual: " + salario);
         System.out.println("Impuesto ISR: " + impuesto);
         System.out.println("Salario Neto: " + (salario - impuesto));
         
         
        }
        
               
    }

