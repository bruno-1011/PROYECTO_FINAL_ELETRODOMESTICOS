package Electrodomesticos;

public class Lavadora extends Electrodomesticos{
	private String Distribuidor;
	private String velocidad;
	private String numero_serie;
	
	public Lavadora(String marca, String color, String tamaño, String modelo, double precio, double capacidad,
			String distribuidor, String velocidad, String numero_serie) {
		
		super(marca, color, tamaño, modelo, precio, capacidad);
		
		Distribuidor = distribuidor;
		this.velocidad = velocidad;
		this.numero_serie = numero_serie;
	}

	public String getDistribuidor() {
		return Distribuidor;
	}

	public void setDistribuidor(String distribuidor) {
		Distribuidor = distribuidor;
	}

	public String getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(String velocidad) {
		this.velocidad = velocidad;
	}

	public String getNumero_serie() {
		return numero_serie;
	}

	public void setNumero_serie(String numero_serie) {
		this.numero_serie = numero_serie;
	}
	
	

}
