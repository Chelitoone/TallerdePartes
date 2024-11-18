package Parte;

public class ParteCompuesta extends Repuesto {

    private double precioEnsamble;

    // Constructor para la parte compuesta
    public ParteCompuesta(String nombre, String numero, double precioBase, double precioEnsamble) {
        super(nombre, numero, precioBase);
        this.precioEnsamble = precioEnsamble;
    }

    // Método para obtener el precio con el 11% de incremento sobre el precio base + precio de ensamble
    @Override
    public double obtenerPrecio() {
        double precioCompuesto = precioBase + precioEnsamble; // Precio base + precio de ensamble
        return precioCompuesto * 1.11; // Incremento del 11%
    }

    // Getter y Setter para el precio de ensamble
    public double getPrecioEnsamble() {
        return precioEnsamble;
    }

    public void setPrecioEnsamble(double precioEnsamble) {
        this.precioEnsamble = precioEnsamble;
    }
}
