
package Ejercicios;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        int numero=0,par=0,multiplo3=0,divisor=0,contador=1,primo=0,contador2=1;
        
        while(contador2<=20){
            
            System.out.print("Ingrese un Numero: ");
            numero=lea.nextInt();
            
            while(contador<=numero){
                if(contador%numero==0){
                    divisor+=1;
                    contador+=1;
                }
                else{
                    contador+=1;
                }
                
                if(divisor==2){
                    primo+=1;
                    
                }
            }
            
            if(numero%2==0){
                par+=1;
                
            }
            if(numero%3==0){
               multiplo3+=1; 
            
            }
                contador2+=1;
            
            }
            System.out.print("Numeros pares: " + par +"\n");
            System.out.println("Multiplos de 3: " + multiplo3+ "\n");
            System.out.println("Numeros Primos: " + primo + "\n");
    }
    
}
