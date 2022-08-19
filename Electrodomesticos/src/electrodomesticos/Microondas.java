package Electrodomesticos;

public class Microondas  extends Electrodomesticos{

	private String botones;
	private String dimension_externa;
	private double potencia;
	
	public Microondas(String marca, String color, String tamaño, String modelo, double precio, double capacidad,
			String botones, String dimension_externa, double potencia) {
		super(marca, color, tamaño, modelo, precio, capacidad);
		this.botones = botones;
		this.dimension_externa = dimension_externa;
		this.potencia = potencia;
	}
	public String getBotones() {
		return botones;
	}

	public void setBotones(String botones) {
		this.botones = botones;
	}

	public String getDimension_externa() {
		return dimension_externa;
	}

	public void setDimension_externa(String dimension_externa) {
		this.dimension_externa = dimension_externa;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	 public void mostrarDatos () {
		 System.out.println("\n MICROONDA:"+ "\n MARCA: "+ getMarca()+"\n COLOR:"+getColor()+"\n TAMAÑO: "+getTamaño()+
		 "\n MODELO:" +getModelo()+"\n PRECIO: $ "+getPrecio()+"\n CAPACIDAD:  "+ getCapacidad()+"litros"+"\n BOTONES:"+botones+"\n DIMENSIONES: "+dimension_externa+"\n POTENCIA: "+potencia+"wats");
	 }
	
	
	
	
}
