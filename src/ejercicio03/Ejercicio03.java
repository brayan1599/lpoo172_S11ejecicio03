/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =new  Scanner(System.in);
        int positivos=0;
        int negativos=0;
        int contador=0;
        double total=0;
        //mostrar mensaje
        System.out.println("INGRESE VARIOS NUMEROS (CERO PARA TERMINAR");
        int numero=input.nextInt();
        if(numero==0){
            System.out.println("No se ingreso ningun nmero");
            System.exit(1);
        }
        while (numero!=0){
            System.out.println("NO ES CERO!");
            if(numero>0){
                positivos++;      
        }
            else{
                negativos++;
            }
            contador++;
            total +=numero;
            numero=input.nextInt(); 
            
        }
        double promedio=total/contador;
        System.out.println("positivos:" + positivos);
        System.out.println("negativos:" + negativos);
        System.out.println("cantidad:" + total);
        System.out.println("promedio:" + promedio);
        
        
        
        
    }
    
}
