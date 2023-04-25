package ar.edu.utn;

public class ItemCarrito {
    private Producto producto;
    private int cantidad;

    public ItemCarrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public boolean siHayStock() {
    	if(this.cantidad<=producto.getCantidad()) {
    		return true;
    	}else
    		return false;
    }
    public double getPrecioTotal() {
    	double precioUnitario = producto.getPrecio();
        double precioTotal = 0;
		if(siHayStock()) {
        if (producto instanceof Libro) {
        precioUnitario = (((Libro) producto).calcularPrecioDeVenta());
        } else if (producto instanceof Revista) {
        	precioUnitario = (((Revista) producto).calcularPrecioDeVenta()); 
        }
        precioTotal = precioUnitario * cantidad;
        return precioTotal;
    	}else
    		return precioTotal;
    }
    public void mostrarItem() {
        try {
            if (cantidad > producto.getCantidad()) {
                throw new NoHayStockException("No hay suficiente stock para agregar este producto al carrito");
            }
            System.out.println("Producto: " + producto.getNombre() +" - Cantidad: " +this.cantidad + "\nSubtotal: $" + getPrecioTotal());
        } catch (NoHayStockException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "ItemCarrito [producto=" + producto + ", cantidad=" + cantidad + "]";
    }
}

