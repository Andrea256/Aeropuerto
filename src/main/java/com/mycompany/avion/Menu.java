/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avion;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author AndreaOrjuela
 */

public class Menu {
    
    List<Aviones> listAvi = new ArrayList<>();
    
    Venta vent = new Venta();
    Scanner entrada = new Scanner(System.in);
    boolean salir = false;
    int opcion;
    
    public void MenuCompra() {

        while (!salir) {

            System.out.println("---- AEROPUERTO ----");
            System.out.println("Elija una opción");
            System.out.println("1. Ver estado de los aviones ");
            System.out.println("2. Ver sillas");
            System.out.println("3. Comprar tiquetes");
            System.out.println("4. Salir");
            System.out.println("6. Mostrar aviones");

            try {

                System.out.println("Escribe la opcion");
                 opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        vent.disponibilidadAvionGen();
                        break;
                    case 2:
                        ;
                        break;
                    case 3:
                        comprarTiquetes();
                        break;
                    case 4:
                        salir = true;
                        break;
                    case 6:
                        
                       
                        break;
                    default:
                        System.out.println("Opcion no existente");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                entrada.next();
            }
        }
    }


        
    private void mostrarAviones() {

        System.out.println("---- MOSTRAR AVIONES ---");
        System.out.println("4.Comprar Tiquetes");
        System.out.println("5.Regresar");
        try {
            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("---- AVION VIP GENERAL ---");
                    
                    mostrarAviones();
                    break;
                case 2:
                    System.out.println("---- AVION GENERAL ---");
                    
                    mostrarAviones();
                    break;
                case 3:
                    System.out.println("---- AVION VIP ---");
                    
                    mostrarAviones();
                    break;
                case 4:
                    comprarTiquetes();
                    break;
                case 5:
                    MenuCompra();
                    break;
                default:
                    System.out.println("Opcion no exitente");
            }
        } catch (InputMismatchException e) {
            System.out.println("Debes insertar un número");
            entrada.next();
        }

    }

    private void comprarTiquetes() {

        //vent.pedirDatos();
        vent.asignarSillas(opcion);
        System.out.println("----COMPRAR TIQUETES ----");
        System.out.println("1. Avion Vip - General ");
        System.out.println("2. Avion General");
        System.out.println("3. Avion Vip ");
        System.out.println("5. Regresar ");

        try {
            opcion = entrada.nextInt();
            switch (opcion) {

                case 1:
                    System.out.println("--- VIP GENERAL ---");
                    vent.pedirDatos();
                    vent.disponibilidadAvionVipGen();
                    break;
                case 2:
                    System.out.println("--- VIP ---");
                    //vent.obtenerDatosUsuario();
                    break;
                case 3:
                    System.out.println("--- GENERAL ---");

                    break;
                case 4:
                    mostrarAviones();
                    break;
                case 5:
                    MenuCompra();
                    break;
                default:
                    System.out.println("Opcion no existente");
                    comprarTiquetes();
            }
        } catch (InputMismatchException e) {

            System.out.println("Debes insertar un número");
            entrada.next();
            comprarTiquetes();
        }

    }
    
    public char[][] escogerLugar(char mat[][]) {
        Scanner entrada = new Scanner(System.in);
        char matriz[][] = mat;
        do {
            
            int fila;
            System.out.println("Selecciona la fila: ");
            fila = entrada.nextInt();
            int columna;
            System.out.println("Selecciona la columna: ");
            columna = entrada.nextInt();

            if (matriz[fila - 1][columna - 1] == 'x') {
                System.out.println(" Este lugar esta ocupado ");
            } else {

                System.out.printf("Fila: %d, Columna %d", fila, columna);
                matriz[fila - 1][columna - 1] = 'x';
                break;
            }

        } while (1 == 1);
        return matriz;
    }
    
    public char[][] crear(int size){
        char matriz[][]=new char[size][size];
        for(int i=0;i<size;i++)
            for(int j=0;j<size;j++)
                matriz[i][j]='v';
        return matriz;
    }
    
    public void display(char mat[][]){
        String cad="";
        for(int i=0;i<mat.length;i++){
            for(int j=0; j<mat[i].length; j++){
                cad+=mat[i][j]+" ";
            }
            cad+="\n";
        }
    }
    
}
    
