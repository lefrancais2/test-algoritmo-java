/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuestion1;

import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class Numeros {
    
    public static void main(String[] args) {
        
        int numero = leerNumero();
        int par_impar=0;
        
        
        if(numero % 2 == 0){
            System.out.println("El numero es par");
            par_impar=0;
        }else{
            System.out.println("El numero es impar");
            par_impar=1;
        }
        
        for(int i=numero;i>=par_impar;i-=2){
            if(i > 1)
                System.out.printf("%d, ",i);
            else
                System.out.printf("%d",i);
        }
        System.out.println("");
    }
    
    public static int leerNumero(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = scanner.nextInt();
        return numero;
    }
}
