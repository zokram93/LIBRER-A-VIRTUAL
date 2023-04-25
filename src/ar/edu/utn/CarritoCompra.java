package ar.edu.utn;

import java.util.ArrayList;

class CarritoCompra {
	
	private ArrayList<ItemCarrito>items;

	public CarritoCompra() {
		this.items = new ArrayList<ItemCarrito>();
	}

	public void agregarItem(ItemCarrito ic) {
		this.items.add(ic);
	}

	public void quitarItem(ItemCarrito ic) {
		this.items.remove(ic);
	}

	
	public void mostrarCarrito() {
		if(items.isEmpty())
			System.out.println("No hay productos en el carrito");
		else {
			for(ItemCarrito i: items) {
				i.mostrarItem();
				System.out.println("---------------------------------");
			}
			System.out.println("Precio Total $" + calcularPreciototalDelCarrito());
		}
	}

	private double calcularPreciototalDelCarrito() {
		double preciototal = 0 ;
		for(ItemCarrito i: items) {
		preciototal += i.getPrecioTotal();
		}
		return preciototal;
	}
}