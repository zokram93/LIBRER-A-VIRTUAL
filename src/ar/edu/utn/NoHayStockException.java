package ar.edu.utn;

public class NoHayStockException extends Exception {
    public NoHayStockException(String mensaje) {
        super(mensaje);
    }
}
