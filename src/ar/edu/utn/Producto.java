package ar.edu.utn;

public abstract class Producto {
	private String nombre;
	private double precio;
    private int cantidad;
    private boolean copiaDigital;

    public Producto(double precio, int cantidad, String nombre, boolean copiaDitital) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.copiaDigital = copiaDitital;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public boolean isCopiaDigital() {
		return copiaDigital;
	}

	public void setCopiaDigital(boolean copiaDigital) {
		this.copiaDigital = copiaDigital;
	}

	public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public String getNombre() {
  		return nombre;
  	}

  	public void setNombre(String nombre) {
  		this.nombre = nombre;
  	}

    public abstract double calcularPrecioDeVenta(); // Método abstracto
    
    @Override
    public String toString() {
        return "Producto [precio=" + precio + ", cantidad=" + cantidad + "]";
    }
}