/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajaticketbanco;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author Wiston Jose Rivas Quintero
 * @author Cristian Thomas Rojas Arce
 */
public class Main {
    public static void main(String[] args) {
        int ticketNumber = 1;
        Random random = new Random();

        // Types of clients with their priority letters
        String[] clientTypes = {
            "Adulto mayor",                   // A
            "Mujer embarazada o niño en brazos", // B
            "Persona con discapacidad",           // C
            "Más de un asunto en el banco",       // D
            "Atención en plataforma",             // E
            "Mujer",                               // F
            "Hombre"                               // G
        };
         char[] priorityLetters = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};

        List<String> generatedTickets = new ArrayList<>();

        // Ticket generation loop
        while (true) {
            int option = JOptionPane.showConfirmDialog(null, "¿Desea sacar un número?", "Sistema de Tickets Banco", JOptionPane.YES_NO_OPTION);
            if (option != JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Gracias por usar el sistema de tickets.");
                break;
            }
        }
    }
}