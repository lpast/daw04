/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
                         
import java.util.Scanner;

public class daw04 {

    public static void main(String[] args) {
        
        System.out.println("Introduzca un numero porel teclado por favor");
        
        Scanner entrada=new Scanner(System.in);
        
        int numero=entrada.nextInt();
        
        if(numero%2==0){
            
            System.out.println(" El numero  queha introducido es el :" + numero + " y si es divisible entre 2.");
        }
        else{
             
             System.out.println(" El numero " + numero + " no es divisible entre 2.");        
        }   
    }
}
