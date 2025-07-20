/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajaticketbanco;

/**
 *@author Wiston Rivas
 * @author  Cristian Rojas
 */
public class Caja2 {
    private int cantidadAtendidos = 0;
    private int tiempoTotal = 0; // Total time in minutes
}
// Attends each ticket by simulating random time
    public void atenderTickets(List<String> tickets) {
        System.out.println("Iniciando atención en Caja 2...");
        Random random = new Random();
