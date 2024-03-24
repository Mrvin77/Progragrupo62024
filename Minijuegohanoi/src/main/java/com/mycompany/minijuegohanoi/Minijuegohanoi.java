/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.minijuegohanoi;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Minijuegohanoi {

    public static void main(String[] args)
    {
    
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el número de discos: ");
        int n = sc.nextInt();
        
        torreDeHanoi(n, 'A', 'C', 'B');
        
        sc.close();
    }

    public static void torreDeHanoi(int n, char origen, char destino, char auxiliar) {
        if (n == 0) {
            return;
        }
        
        imprimirTorres(n, 'A', 'B', 'C');
        
        System.out.print("\nIngrese la torre de origen (A, B, C): ");
        Scanner sc = new Scanner(System.in);
        char torreOrigen = sc.next().charAt(0);
        
        System.out.print("Ingrese la torre de destino (A, B, C): ");
        char torreDestino = sc.next().charAt(0);
        
        if (validarMovimiento(n, torreOrigen, torreDestino, origen, auxiliar, destino)) {
            torreDeHanoi(n - 1, origen, auxiliar, destino);
            System.out.println("Mover disco " + n + " de " + torreOrigen + " a " + torreDestino);
            torreDeHanoi(n - 1, auxiliar, destino, origen);
        } else {
            System.out.println("Movimiento no válido. Intente nuevamente.");
            torreDeHanoi(n, origen, destino, auxiliar);
        }
        
        sc.close();
    }
    
    public static boolean validarMovimiento(int n, char torreOrigen, char torreDestino, char origen, char auxiliar, char destino) {
        if ((torreOrigen == 'A' && torreDestino == 'B' && origen == 'A' && auxiliar == 'B') ||
            (torreOrigen == 'A' && torreDestino == 'C' && origen == 'A' && destino == 'C') ||
            (torreOrigen == 'B' && torreDestino == 'C' && auxiliar == 'B' && destino == 'C') ||
            (torreOrigen == 'B' && torreDestino == 'A' && auxiliar == 'B' && origen == 'A') ||
            (torreOrigen == 'C' && torreDestino == 'A' && destino == 'C' && origen == 'A') ||
            (torreOrigen == 'C' && torreDestino == 'B' && destino == 'C' && auxiliar == 'B')) {
            return true;
        }
        return false;
    }
    
    public static void imprimirTorres(int n, char origen, char auxiliar, char destino) {
        char[][] torres = new char[n][3];
        
        for (int i = 0; i < n; i++) {
            torres[i][0] = ' ';
            torres[i][1] = ' ';
            torres[i][2] = ' ';
        }
        
        for (int i = 0; i < n; i++) {
            torres[i][0] = '|';
        }
        
        for (int i = n - 1; i >= 0; i--) {
            torres[i][0] = '|';
            for (int j = 0; j < 3; j++) {
                System.out.print(torres[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("A B C");
    }
}
    
