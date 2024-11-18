import Parte.ParteSimple;
import Parte.ParteCompuesta;
import javax.swing.JOptionPane;
import java.util.ArrayList;  

public class Main {
    public static void main(String[] args) {

        // Lista para almacenar las partes
        ArrayList<String> partesRegistradas = new ArrayList<>();

        
        boolean continuar = true;

        // Bucle para agregar partes
        while (continuar) {
            // Datos de las partes
            String tipoParte = JOptionPane.showInputDialog("Ingrese el tipo de parte (simple o compuesta):");
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la parte:");
            String numero = JOptionPane.showInputDialog("Ingrese el número de la parte:");
            double precioBase = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio base de la parte:"));

            // Variable para almacenar el mensaje final
            String mensajeParte = "";

            // Condición para determinar si es una parte simple o compuesta
            if (tipoParte.equalsIgnoreCase("simple")) {
                // Crear una parte simple
                ParteSimple parte = new ParteSimple(nombre, numero, precioBase);
                double precioFinal = parte.obtenerPrecio();
                mensajeParte = "La parte simple " + nombre + " con número " + numero + " tiene un precio final de: " + precioFinal;
            } else if (tipoParte.equalsIgnoreCase("compuesta")) {
                // Crear una parte compuesta
                double precioEnsamble = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de ensamble:"));
                ParteCompuesta parteCompuesta = new ParteCompuesta(nombre, numero, precioBase, precioEnsamble);
                double precioFinal = parteCompuesta.obtenerPrecio();
                mensajeParte = "La parte compuesta " + nombre + " con número " + numero + " tiene un precio final de: " + precioFinal;
            } else {
                mensajeParte = "Tipo de parte no válido.";
            }

            // Mostrar el precio de la parte
            JOptionPane.showMessageDialog(null, mensajeParte);

            // Agregar la parte a la lista
            partesRegistradas.add(mensajeParte);

            // Preguntar si desea agregar otra parte
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea agregar otra parte?", "Agregar otra parte", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.NO_OPTION) {
                continuar = false;  // Terminar el bucle si la respuesta es NO
            }
        }

        // Mostrar todas las partes registradas
        StringBuilder todasLasPartes = new StringBuilder();
        for (String parte : partesRegistradas) {
            todasLasPartes.append(parte).append("\n");
        }

        // Mostrar el resumen de todas las partes
        JOptionPane.showMessageDialog(null, "Las partes registradas son:\n" + todasLasPartes.toString());
    }
}
