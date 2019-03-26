/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author AndreaOrjuela
 */
public class Venta {
    
   public List <Usuario> lisUsuario = new ArrayList<>();

    Scanner entrada = new Scanner(System.in);

    public List<Aviones> listAviones = new ArrayList<>();
    
    

    public void datosAviones() {

        Aviones avVipGen = new AvionVipGeneral(0, 1);
        Aviones avGen = new AvionGeneral(0, 2);
        Aviones avVip = new AvionVip(0, 3);

        /**
         * Sillas avion Vip General.
         */
        Sillas sVipGen1 = new Sillas("General", 1, 1, 20, 1); //A 1
        Sillas sVipGen2 = new Sillas("General", 2, 1, 20, 1);
        Sillas sVipGen3 = new Sillas("General", 3, 1, 20, 1);
        Sillas sVipGen4 = new Sillas("Vip", 1, 2, 30, 0);
        Sillas sVipGen5 = new Sillas("Vip", 2, 2, 30, 0);
        Sillas sVipGen6 = new Sillas("Vip", 3, 2, 30, 0);
        
        ((AvionVipGeneral) avVipGen).getListSillas().add(sVipGen1);
        ((AvionVipGeneral) avVipGen).getListSillas().add(sVipGen2);
        ((AvionVipGeneral) avVipGen).getListSillas().add(sVipGen3);
        ((AvionVipGeneral) avVipGen).getListSillas().add(sVipGen4);
        ((AvionVipGeneral) avVipGen).getListSillas().add(sVipGen5);
        ((AvionVipGeneral) avVipGen).getListSillas().add(sVipGen6);

        /**
         * Sillas avion general.
         */
                                  //Tipo, fila, columna
        Sillas sGen1 = new Sillas("General", 1, 1, 20, 0);
        Sillas sGen2 = new Sillas("General", 2, 1, 20, 0);
        Sillas sGen3 = new Sillas("General", 1, 2, 20, 0);
        Sillas sGen4 = new Sillas("General", 2, 2, 20, 0);
        
        ((AvionGeneral) avGen).getListSillas().add(sGen1);
        ((AvionGeneral) avGen).getListSillas().add(sGen2);
        ((AvionGeneral) avGen).getListSillas().add(sGen3);
        ((AvionGeneral) avGen).getListSillas().add(sGen4);
        
        /**
         * Sillas avion Vip.
         */
 
        Sillas sVip1 = new Sillas("Vip", 1, 1, 40, 1);
        Sillas sVip2 = new Sillas("Vip", 2, 1, 40, 1);
        Sillas sVip3 = new Sillas("Vip", 1, 2, 40, 0);
        Sillas sVip4 = new Sillas("Vip", 2, 2, 40, 0);
        
        ((AvionVip) avVip).getListSillas().add(sVip1);
        ((AvionVip) avVip).getListSillas().add(sVip2);
        ((AvionVip) avVip).getListSillas().add(sVip3);
        ((AvionVip) avVip).getListSillas().add(sVip4);
         
        listAviones.add(avVipGen);
        listAviones.add(avGen);
        listAviones.add(avVip);

    }

    public void verEstadoAvion() {

        datosAviones();
        for (Aviones listAvp : listAviones) {

            if (listAvp instanceof AvionVipGeneral) {
                System.out.println("Avion VIP GENERAL");
                AvionVipGeneral avVyG = (AvionVipGeneral) listAvp;
                if (avVyG.getEstadoVipGen() == 0) {
                    System.out.printf("Estado: En tierra \n");
                } else {
                    System.out.printf("Estado: Despegado \n");
                }

            } else if (listAvp instanceof AvionGeneral) {
                System.out.println("Avion GENERAL");
                AvionGeneral avVyG = (AvionGeneral) listAvp;
                if (avVyG.getEstadoGen() == 0) {
                    System.out.printf("Estado: En tierra \n");
                } else {
                    System.out.printf("Estado: Despegado \n");
                }

            } else if (listAvp instanceof AvionVip) {
                System.out.println("Avion VIP ");
                AvionVip avVip = (AvionVip) listAvp;
                if (avVip.getEstadoVip() == 0) {
                    System.out.printf("Estado: En tierra \n");
                } else {
                    System.out.printf("Estado: Despegado \n");
                }
            }
        }
        /*
             if (((AvionVipGeneral) listAvp).getEstadoVipGen() == 0) {
                        int estadoS =((AvionVipGeneral) listAvp).getEstadoVipGen();
                        System.out.printf("Estado: %s \n" , estadoS);
                    }*/
    }
    

    public void avionGen() {

        datosAviones();

        for (Aviones listAvp : listAviones) {

            if (listAvp instanceof AvionGeneral) {
                //AvionVipGeneral avp = (AvionVipGeneral) listAvp;
                //int est = ((AvionVipGeneral) listAvp).getEstadoVipGen();
                //System.out.println("lis sillas" + ((AvionVipGeneral) listAvp).getListSillas());
                //System.out.println("estado est" + ((AvionVipGeneral) listAvp).getListSillas());

                for (int i = 0; i < ((AvionGeneral) listAvp).listSillas.size(); i++) {

                    if (((AvionGeneral) listAvp).listSillas.get(i).getEstado() <= 1) {

                        String tipoS = ((AvionGeneral) listAvp).listSillas.get(i).getTipoSilla();
                        int filaS = ((AvionGeneral) listAvp).listSillas.get(i).getFila();
                        int comlumnaS = ((AvionGeneral) listAvp).listSillas.get(i).getColumna();
                        int valorS = ((AvionGeneral) listAvp).listSillas.get(i).getValor();
                        int estadoS = ((AvionGeneral) listAvp).listSillas.get(i).getEstado();

                        System.out.printf("Tipo: %s ,  Fila: %d ,  Columna: %d , Valor: %d", tipoS, filaS, comlumnaS, valorS);
                        System.out.printf("Estado %d" , estadoS);
                        System.out.println("\n");

                    }
                }
            }
        }
    }

    
    public void avionVip() {

        datosAviones();

        listAviones.stream().filter((listAvp) -> (listAvp instanceof AvionVip)).forEachOrdered((listAvp) -> {
            //AvionVipGeneral avp = (AvionVipGeneral) listAvp;
            //int est = ((AvionVipGeneral) listAvp).getEstadoVipGen();
            //System.out.println("lis sillas" + ((AvionVipGeneral) listAvp).getListSillas());
            //System.out.println("estado est" + ((AvionVipGeneral) listAvp).getListSillas());
            
            for (int i = 0; i < ((AvionVip) listAvp).listSillas.size(); i++) {
                
                if (((AvionVip) listAvp).listSillas.get(i).getEstado() < 1) {
                    
                    String tipoS = ((AvionVip) listAvp).listSillas.get(i).getTipoSilla();
                    int filaS = ((AvionVip) listAvp).listSillas.get(i).getFila();
                    int comlumnaS = ((AvionVip) listAvp).listSillas.get(i).getColumna();
                    int valorS = ((AvionVip) listAvp).listSillas.get(i).getValor();
                    int estadoS = ((AvionVip) listAvp).listSillas.get(i).getEstado();
                    
                    System.out.printf("Tipo: %s ,  Fila: %d ,  Columna: %d , Valor: %d", tipoS, filaS, comlumnaS, valorS);
                    System.out.printf("Estado %d" , estadoS);
                    System.out.println("\n");
                       
                }
            }
        });
    }

    //Usuario us = new Usuario(1, nombreUsu, fechaNacimiento);
    public void pedirDatos() {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int identificacion = 0;
        String nombreUsu = null;
        Date fechaNac = null;
        System.out.println("---- DATOS ----");
        
        try {
            System.out.println("Identificación: ");
            identificacion = Integer.parseInt(br.readLine());
            System.out.print("Nombre: ");
            nombreUsu = br.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Venta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Introduzca la fecha con formato 07/07/1996");

        String fecha = entrada.nextLine();
        SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        String date = fecha;
        try {
            fechaNac = df.parse(date);
            //System.out.println("Fecha "+fechaNac);
        } catch (Exception e) {
            System.out.println("Formato invalido");
        }

        Usuario usu = new Usuario(identificacion, nombreUsu, fechaNac);
        lisUsuario.add(usu);
      
    }

    public void obtenerDatosUsuario() {

        for (Usuario usua : lisUsuario) {
            
        System.out.println("---- DATOS ----");
        System.out.println("Identificacion " + usua.getIdentUsu());
        System.out.println("Nombre: " + usua.getNombreUsu());
        System.out.println("Fecha de nacimiento" + usua.getFechaNacimiento());
        
        }        
    }
    
    public void asignarSillas(int avion) {
        
        int fila;
        int columna;
        
        System.out.println("Fila ");
        fila = entrada.nextInt();
        System.out.println("Columna ");
        columna = entrada.nextInt();
        
        //AvionVipGeneral avp = (AvionVipGeneral)listAviones.get(avion);
        
            for (Aviones listAvp : listAviones) {
                for (int i = 0; i < ((AvionVipGeneral) listAvp).listSillas.size(); i++) {
                    
                    if (((AvionVipGeneral) listAvp).listSillas.get(i).getFila()== fila && ((AvionVipGeneral) listAvp).listSillas.get(i).getColumna() == columna) {
                        
                        
                }
            }
        }
    }
    
    public void disponibilidadAvionVipGen() {

        datosAviones();

        for (Aviones listAvp : listAviones) {

            if (listAvp instanceof AvionVipGeneral) {

                for (int i = 0; i < ((AvionVipGeneral) listAvp).listSillas.size(); i++) {

                    if (((AvionVipGeneral) listAvp).listSillas.get(i).getEstado() <= 0) {
                        
                        String tipoS = ((AvionVipGeneral) listAvp).listSillas.get(i).getTipoSilla();
                        int filaS = ((AvionVipGeneral) listAvp).listSillas.get(i).getFila();
                        int comlumnaS = ((AvionVipGeneral) listAvp).listSillas.get(i).getColumna();
                        int valorS = ((AvionVipGeneral) listAvp).listSillas.get(i).getValor();
                        int estadoS = ((AvionVipGeneral) listAvp).listSillas.get(i).getEstado();
                        System.out.println("---- SILLAS DISPONIBLES VIP-GENERAL ----");
                        System.out.printf("Tipo: %s ,  Fila: %d ,  Columna: %d , Valor: %d", tipoS, filaS, comlumnaS, valorS);
                        System.out.println("\n");
                    }
                }
                
                ((AvionVipGeneral) listAvp).getListSillas().clear();
            }
        }
    }
    
    public void disponibilidadAvionGen() {

        datosAviones();

        for (Aviones listAvp : listAviones) {

            if (listAvp instanceof AvionGeneral) {
                //AvionVipGeneral avp = (AvionVipGeneral) listAvp;
                //int est = ((AvionVipGeneral) listAvp).getEstadoVipGen();
                //System.out.println("lis sillas" + ((AvionVipGeneral) listAvp).getListSillas());
                //System.out.println("estado est" + ((AvionVipGeneral) listAvp).getListSillas());

                for (int i = 0; i < ((AvionGeneral) listAvp).listSillas.size(); i++) {

                    if (((AvionGeneral) listAvp).listSillas.get(i).getEstado() <= 0) {

                        String tipoS = ((AvionGeneral) listAvp).listSillas.get(i).getTipoSilla();
                        int filaS = ((AvionGeneral) listAvp).listSillas.get(i).getFila();
                        int comlumnaS = ((AvionGeneral) listAvp).listSillas.get(i).getColumna();
                        int valorS = ((AvionGeneral) listAvp).listSillas.get(i).getValor();
                        int estadoS = ((AvionGeneral) listAvp).listSillas.get(i).getEstado();
                        System.out.println("---- SILLAS DISPONIBLES GENERAL ----");
                        System.out.printf("Tipo: %s ,  Fila: %d ,  Columna: %d , Valor: %d", tipoS, filaS, comlumnaS, valorS);
                        System.out.println("\n");

                    }
                }
                ((AvionGeneral) listAvp).getListSillas().clear();
            }
        }
    }

    public void disponibilidadAvionVip() {

        datosAviones();

        for (Aviones listAvp : listAviones) {
            
            if (listAvp instanceof AvionVip) {
                
                for (int i = 0; i < ((AvionVip) listAvp).listSillas.size(); i++) {

                    if (((AvionVip) listAvp).listSillas.get(i).getEstado() <= 0) {

                        String tipoS = ((AvionVip) listAvp).listSillas.get(i).getTipoSilla();
                        int filaS = ((AvionVip) listAvp).listSillas.get(i).getFila();
                        int comlumnaS = ((AvionVip) listAvp).listSillas.get(i).getColumna();
                        int valorS = ((AvionVip) listAvp).listSillas.get(i).getValor();
                        int estadoS = ((AvionVip) listAvp).listSillas.get(i).getEstado();
                        System.out.println("---- SILLAS DISPONIBLES GENERAL ----");
                        System.out.printf("Tipo: %s ,  Fila: %d ,  Columna: %d , Valor: %d", tipoS, filaS, comlumnaS, valorS);
                        System.out.println("\n");
                                                
                    }
                }
                ((AvionVip) listAvp).getListSillas().clear();
            }
            
        }
        
    }
    
    
    
    //
}


/*public void obtenerFecha (){
    
    System.out.println("Introduzca la fecha con formato dd/mm/yyyy");
 
        String fecha = entrada.nextLine();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaNac = null;
        String date = fecha;
        try{
            fechaNac = df.parse(date);
            System.out.println("Fecha "+fechaNac);
        } catch (Exception e){ System.out.println("Formato invalido");}
 
    }*/
