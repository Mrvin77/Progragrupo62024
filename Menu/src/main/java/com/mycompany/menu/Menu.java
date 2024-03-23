/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.menu;


public class Menu {

    public static void main(String[] args) {
    
    Scanner scanner=new Scanner(System.in);
    
    // menu principal al iniciar el programa
    System.out.println("....Bienvenidos al proyecto 1 de programacion....  "); 
        System.out.println("Menu principal");
        System.out.println(" 1 - Fase 1  (Objetos y curcibidad). "); 
        System.out.println(" 2 - Fase 2.   ");   
        System.out.println(" 3 - Fase 3.   ");   
        System.out.println(" 4 - Fase 4.   ");   
        System.out.println(" 5 - Salir.   ");  
        
        System.out.println("Por favor digite una opcion");
        int Opcion = scanner.nextInt();
        // pasos para dar click y que muestre la opccion
        switch (Opcion) {
            case 1:
                Fase 1();
                break;      
              case 2:
            Fase 2 ();
            break ;
            
              case 3 :
            Fase 3 ();
            break ;
              case 4 :
            Fase 4 ();
            break ;
            
              case 5 :
            Fase 5 ();
            break ;     
    }
}
    static void Fase 1 () {
            System.out.println(" hola esta es la fase 1 debes lñlenar los datos");
    }
}
