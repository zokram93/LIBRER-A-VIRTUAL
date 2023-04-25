package ar.edu.utn;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		//GENERO PRODUCTOS
		LocalDate fecha = LocalDate.of(1997, 06, 26);
		Libro nuevoLibro =  new Libro ("Harry Potter Y La Piedra Filosofal","J.K. Rowling",fecha,"Bloomsbury","9780590353427",5000.0,14, false);
		LocalDate fecha3 = LocalDate.of(1997, 06, 26);
		Libro nuevoLibro2 =  new Libro ("Juego de tronos (Canción de hielo y fuego 1","George R.R. Martin",fecha3,"Bloomsbury","9780590353427",7500.0,15, true);
		LocalDate fecha1 = LocalDate.of(2022, 12, 4);
		Revista nuevaRevista = new Revista("CARAS",fecha1,"asd","0032-6233",650.0,25, false);
		LocalDate fecha4 = LocalDate.of(2023, 03, 13);
		Revista nuevaRevista1 = new Revista("PRONTO",fecha4,"Fernando Cerolini","0032-6233",500.0,13, true);
		
		//CREO EL CARRITO DE COMPRAS
		CarritoCompra c = new CarritoCompra();
		
		//GENERAR ITEMS
		ItemCarrito i1 = new ItemCarrito(nuevoLibro, 5);
		ItemCarrito i2 = new ItemCarrito(nuevaRevista, 25);
		ItemCarrito i3 = new ItemCarrito(nuevoLibro2, 2);
		ItemCarrito i4 = new ItemCarrito(nuevaRevista1, 1);
		
		//AGREGO ITEMS AL CARRITO
		c.agregarItem(i1);
		c.agregarItem(i2);
		c.agregarItem(i3);
		c.agregarItem(i4);
		
		//MUESTRO LOS PRODUCTOS ASOCIADOS AL CARRITO
		c.mostrarCarrito();
		
		//ELIMINAR ITEM DE CARRITO
		c.quitarItem(i3);
		
		//MUESTRO LOS PRODUCTOS ASOCIADOS AL CARRITO
		c.mostrarCarrito();
	
		
	}

}
