package Parte;

public class ParteSimple extends Repuesto {

    // Constructor para la parte simple
    public ParteSimple(String nombre, String numero, double precioBase) {
        super(nombre, numero, precioBase);
    }

    // Sobreescribimos el método obtenerPrecio para calcular el precio con el 8% adicional
    @Override
    public double obtenerPrecio() {
        return precioBase * 1.08; // Precio base + 8%
    }
}