package Parte;


public class Repuesto {
    protected String nombre;
    protected String numero;
    protected double precioBase;

    // Constructor para guardar repuestos
    public Repuesto(String nombre, String numero, double precioBase) {
        this.nombre = nombre;
        this.numero = numero;
        this.precioBase = precioBase;
    }

    public double obtenerPrecio() {
        return precioBase; // Método base, será sobreescrito en las subclases
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
}