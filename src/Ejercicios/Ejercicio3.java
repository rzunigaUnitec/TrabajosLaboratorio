
package Ejercicios;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner lea =new Scanner(System.in);
        
        int numero=0;
        
        do{
            int factorial,resultado=1;
            System.out.print("Ingrese un Numero: ");
            factorial=lea.nextInt();
            numero=factorial;
            
            while(factorial>=1){
                resultado*=factorial;
                factorial-=1;
                                
            }
            if(numero>0){
                System.out.println("El Factorial del numero es: "+ resultado);
            }
            
        }while(numero>0);
        }
    }

