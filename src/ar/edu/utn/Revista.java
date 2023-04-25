package ar.edu.utn;

import java.time.LocalDate;

public class Revista extends Producto {
    private LocalDate fechaPublicacion;
    private String editor;
    private String codigo;

    public Revista(String nombre, LocalDate fechaPublicacion, String editor, String codigo, double precio,
            int cantidad, boolean esdigital) {
        super(precio, cantidad, nombre, esdigital);
        this.fechaPublicacion = fechaPublicacion;
        this.editor = editor;
        this.codigo = codigo;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
	public double calcularPrecioDeVenta() {
	    double precioCompra = super.getPrecio();
	    double precioVenta = 0;

	    if (!super.isCopiaDigital()) {
	        precioVenta = precioCompra * 1.22; 
	    } else {
	        precioVenta = precioCompra * 1.12; 
	    }

	    return precioVenta;
	}

    @Override
    public String toString() {
        return "Revista [nombre=" + super.getNombre() + ", fechaPublicacion=" + fechaPublicacion + ", editor=" + editor
                + ", codigo=" + codigo + ", precio=" + getPrecio() + ", cantidad=" + getCantidad() + "]";
    }
}
