/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuestion3;

import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class Salario {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horasTrabajadas = leerHorasTrabajadas(scanner);
        double tarifa = leerTarifa(scanner);
        
        double salario = calculoSalario(horasTrabajadas,tarifa);
        
        System.out.printf("El salario obtenido es: %.2f\n",salario);
    }
    
    public static int leerHorasTrabajadas(Scanner scanner){
        System.out.println("Ingresa el numero de horas trabajadas: ");
        int horas = scanner.nextInt();
        return horas;
    }
    
    public static double leerTarifa(Scanner scanner){
        System.out.println("Ingresa la tarifa: ");
        double tarifa = scanner.nextDouble();
        return tarifa;
    }
    
    private static double calculoSalario(int horas,double tarifa){
        double tar;
        if(horas <= 40){
            return horas * tarifa;
        }else{
            tar = tarifa + tarifa*0.5;
            return 40*tarifa + (horas-40)*tar;
        }
    }
}
