/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajaticketbanco;
import java.util.List;
import java.util.Random;
/**
 *
 * @author qadri
 */

//Caja 1 atiende a todos los clientes excepto los que requieren atención en plataforma.
public class Caja1 {
    private int cantidadAtendidos = 0;
    private int tiempoTotal = 0; // Total time in minutes

    // Attends each ticket by simulating random time
    public void atenderTickets(List<String> tickets) {
        System.out.println("Iniciando atención en Caja 1...");
        Random random = new Random();

        for (String ticket : tickets) {
            char letter = ticket.charAt(0);
            String number = ticket.substring(1);

            System.out.println("Caja 1 atiende ticket número " + number + " con letra " + letter);

            int minutos = 1 + random.nextInt(5);  // Random minutes between 1 and 5
            System.out.println("Tiempo estimado de atención: " + minutos + " minutos");

            cantidadAtendidos++;
            tiempoTotal += minutos;
        }
        System.out.println("Atención finalizada en Caja 1.");
   System.out.println("Atención finalizada en Caja 1.");
    }

    public int getCantidadAtendidos() {
        return cantidadAtendidos;
    }

    public int getTiempoTotal() {
        return tiempoTotal;
    }
}