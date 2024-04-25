
package com.mycompany.mavenproject1;

import java.util.Scanner;
public class Mavenproject1 {

   public static void main(String[] args){
        char sexo;
        String sector;
        double salud=15000,educacion=12000,
                transporte=18000,total=0;
        
        Scanner lector=new Scanner(System.in);
        
        System.out.println("Ingresa el sexo");
        sexo=lector.next().charAt(0);
        lector.nextLine();
        System.out.println("Ingresa el sector");
        sector=lector.nextLine();
        
        if(sexo=='M'){
            
            if(sector.equals("Educacion")){
                total=educacion*1.2;
            }else if(sector.equals("Salud")){
                total=salud*1.11;
            }else if(sector.equals("Transporte")){
                total=transporte*1.15;
            }else{
                System.out.println("Ingresa bien el "
                        + "sector");
            }
            
            
        }else{
            
            if(sector.equals("Educacion")){
                total=educacion*1.25;
            }else if(sector.equals("Salud")){
                total=salud*1.15;
            }else if(sector.equals("Transporte")){
                total=transporte*1.25;
            }else{
                System.out.println("Ingresa bien el "
                        + "sector");
            }
        }
        
        System.out.println("El sueldo nuevo es "+total);
        System.out.printf("El sueldo nuevo es %f\n",total);
    }
}
