/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuestion2;

/**
 *
 * @author oscar
 */
public class Clasificacion {
    
    public static void main(String[] args) {        
        Persona[] personas = leerPersonas();
        mostrarDatos(personas);
    }
    
    public static Persona[] leerPersonas(){
        Persona[] personas = new Persona[50];
        int n, edad;
        char sexo;
        
        for(int i=0;i<50;i++){
            n=(int)Math.floor(Math.random()*2);
            if(n == 1)
                sexo='H';
            else
                sexo='M';
            
            edad = (int)Math.floor(Math.random()*80);
            
            Persona persona = new Persona(sexo,edad);
            personas[i] = persona;
        }
        
        return personas;
    }
    
    public static void mostrarDatos(Persona[] personas){
        int count_mayores = 0, count_menores = 0;
        int count_mayores_masc = 0, count_menores_fem = 0, count_mujeres = 0;
        
        double perc_fem_total = 0.0;
        
        for (int i = 0; i < personas.length; i++) {
            if(personas[i].getEdad() >= 18){
                count_mayores++;
                if(personas[i].getSexo() == 'H'){
                    count_mayores_masc++;
                }
            }else{
                count_menores++;
                if(personas[i].getSexo() == 'M'){
                    count_menores_fem++;
                }
            }
            
            if(personas[i].getSexo() == 'M')
                count_mujeres++;
        }
        
        double perc_mayores_total = (count_mayores*100)/personas.length;
        perc_fem_total = (count_mujeres*100)/personas.length;
        
        System.out.printf("Cantidad de personas mayores de edad: %d\n",count_mayores);
        System.out.printf("Cantidad de personas menores de edad: %d\n",count_menores);
        System.out.printf("Cantidad de personas masculinas mayores de edad: %d\n",count_mayores_masc);
        System.out.printf("Cantidad de personas femeninas menores de edad: %d\n",count_menores_fem);
        System.out.printf("Porcentaje personas mayores respecto del total: %.1f%%\n",perc_mayores_total);
        System.out.printf("Porcentaje personas mujeres respecto del total: %.1f%%\n",perc_fem_total);
        
    }
    
}
