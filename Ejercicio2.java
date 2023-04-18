/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author disenoydesarrollo
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // definicion de objetos y variables
        Scanner objread=new Scanner(System.in);
        String nom,sx,nom_menor="",nom_mayor="";
        float prom_edad,acum_edad=0,por_mant,cont_men_edad=0;
        int est_civil,carrera,ed,men_edad=200,may_edad=0,con_prog=0,cont_mant=0,
        con_muj_dis=0;
        //leer dato centinela
        System.out.print("Digite el nombre de la persona ");
        nom=objread.next();
        //ejecutar el ciclo un numero desconocido de veces
        while (!nom.equals("***")){
            System.out.print("Digite la edad");
            ed=objread.nextInt();
            System.out.print("Digite sexo");
            sx=objread.next();
            System.out.println("Digite estado civil 1. soltero 2. casado "
            + "3. union libre 4. viudo ");
            est_civil=objread.nextInt();
            System.out.print("Digite la carrera 1. sistemas 2. programacion "
            + "3. mantenimiento 4. diseño");
            carrera=objread.nextInt();
            //operacion dependiendo de la carrera
             switch (carrera){
                case 1:if (sx.equals("Femenino") && ed < men_edad){
                    men_edad=ed;
                    nom_menor=nom;    
                }else{
                    if (sx.equals("Masculino") && ed > may_edad){
                        may_edad=ed;
                        nom_mayor=nom;
                       
                    }
                }
                    break;
                case 2:if (est_civil == 2){
                    acum_edad+=ed;
                    con_prog++;
                }
                    break;
                case 3: cont_mant++;
                       if (ed < 18)
                           cont_men_edad++;
                    break;
                case 4: if (sx.equals("femenino") && ed >= 18)
                           con_muj_dis++;
                    break;
            }//fin del selector multiple
           System.out.print("Digite el nombre de la persona ");
           nom=objread.next();
        }//fin mientras
        //hallar el porcentaje de menores de edad en mantenimiento
        if (cont_mant == 0 )
            por_mant=0;
        por_mant=cont_men_edad/cont_mant * 100;
        //hallar el promedio de edad de los programadores
        if (con_prog == 0)
            prom_edad=0;
        else 
            prom_edad=acum_edad/con_prog;
        //imprimir resultados
        System.out.println("La mujer mas joven de sistemas es " + nom_menor);
        System.out.println("El hombre mas viejo de sistemas es " + nom_mayor);
        System.out.println("El promedio de edad de los programadores es " + prom_edad);
        System.out.println("El porcentaje de los menores de edad en mantenimiento es " + por_mant);
        System.out.println("La cantidad de mujeres en diseño es " + con_muj_dis);
       
    }  
}
