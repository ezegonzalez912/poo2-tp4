package supermecado;

public class Producto {
	
	private String nombre;
	private Double precio;
	private Boolean esPrecioCuidado;
	
	public void Producto(String nombre, Double precio, Boolean esPrecioCuidado) {
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = esPrecioCuidado;
	}
	
}
