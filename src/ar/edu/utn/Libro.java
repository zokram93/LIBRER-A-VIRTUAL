package ar.edu.utn;

import java.time.LocalDate;

public class Libro extends Producto {
    private String autor;
    private LocalDate fechaPublicacion;
    private String editorial;
    private String codigo;

    public Libro(String titulo, String autor, LocalDate fechaPublicacion, String editorial, String codigo,
            double precio, int cantidad, boolean esdigital) {
        super(precio, cantidad, titulo, esdigital);
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.editorial = editorial;
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    @Override
    public String toString() {
        return "Libro [titulo=" + super.getNombre() + ", autor=" + autor + ", fechaPublicacion=" + fechaPublicacion
                + ", editorial=" + editorial + ", codigo=" + codigo + ", precio=" + getPrecio() + ", cantidad="
                + getCantidad() + "]";
    }

	@Override
	public double calcularPrecioDeVenta() {
	    double precioCompra = super.getPrecio();
	    double precioVenta = 0;

	    if (!super.isCopiaDigital()) {
	        precioVenta = precioCompra * 1.18; 
	    } else {
	        precioVenta = precioCompra * 1.08; 
	    }

	    return precioVenta;
	}

}
