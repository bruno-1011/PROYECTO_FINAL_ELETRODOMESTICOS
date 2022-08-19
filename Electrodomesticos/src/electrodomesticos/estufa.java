package Electrodomesticos;

public class estufa extends Electrodomesticos{

	private double Descuento;
	private String Parrilla;
	private String Gabinete;
	public estufa(String marca, String color, String tamaño, String modelo, double precio, double capacidad,
			double descuento, String parrilla, String gabinete) {
		
		super(marca, color, tamaño, modelo, precio, capacidad);
		
		this.Descuento=descuento;
		this.Parrilla = parrilla;
		this.Gabinete = gabinete;
	}
	
	public void mostrarDatos() {
	
	System.out.println("\n DATOS DE LA ESTUFA: "+ "\n MARCA:"+ getMarca()+"\n COLOR:"+getColor()+"\n TAMAÑO: "+getTamaño()+ "\n MODELO:" +getModelo()+"\n PRECIO:"+getPrecio()+"\n CAPACIDAD:"+ 
	getCapacidad()+"\n Descuento:"+Descuento+"%" +"\n PARRILLA:"+Parrilla+"\n GABINETES:"+Gabinete);
}
}