/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papelerias;

import java.util.Scanner;

/**
 *
 * @author formacion15
 */
public class Main {

    public static void main(String[] args) {
        int opcion;
        Scanner s = new Scanner(System.in);
        Libreta libreta = new Libreta();
        Boligrafo boligrafo = new Boligrafo();
        Agenda agenda = new Agenda();
        do {

            System.out.println("Elige una opción: ");
            System.out.println("\t1.Comprar libretas");
            System.out.println("\t2.Comprar bolígrafos");
            System.out.println("\t3.Comprar agendas");
            System.out.println("\t0.Salir");
            System.out.print("Opción elegida:");
            opcion = Integer.parseInt(s.nextLine());
            switch (opcion) {
                case 1:
                    try {
                        System.out.println("¿Cuántas libretas quieres comprar?");
                        System.out.println("Stock:" + libreta.stock);
                        int unidadesVendidas = Integer.parseInt(s.nextLine());
                        if (libreta.hayStock(unidadesVendidas) == true) {
                            libreta.vender(unidadesVendidas);
                        } else {
                            System.out.println("No hay stock");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Debes introducir un número");
                    }

                    break;
                case 2:

                    try {
                        System.out.println("¿Cuántos bolígrafos quieres comprar?");
                        System.out.println("Stock: " + boligrafo.stock);
                        int boligrafosVendidos = Integer.parseInt(s.nextLine());
                        if (boligrafo.hayStock(boligrafosVendidos) == true) {
                            boligrafo.vender(boligrafosVendidos);
                        } else {
                            System.out.println("No hay stock");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Debes introducir un número");
                    }

                    break;

                case 3:
                    try {
                        System.out.println("¿Cuántas agendas quieres comprar?");
                        System.out.println("Stock: " + agenda.stock);
                        int agendasVendidas = Integer.parseInt(s.nextLine());
                        if (agenda.hayStock(agendasVendidas) == true) {
                            agenda.vender(agendasVendidas);
                        } else {
                            System.out.println("No hay stock");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Debes introducir un número");
                    }

                    break;
                case 0:
                    break;
            }
        } while (opcion != 0);
    }

}
