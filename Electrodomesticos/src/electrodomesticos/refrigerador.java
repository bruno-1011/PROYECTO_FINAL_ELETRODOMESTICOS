package Electrodomesticos;

public class refrigerador extends Electrodomesticos {
	
	private int Puertas;
	
	public refrigerador(String marca, String color, String tamaño, String modelo, double precio, double capacidad,int Puertas) {
		super(marca, color, tamaño, modelo, precio, capacidad);
		// TODO Auto-generated constructor stub

		this.Puertas = Puertas;
	}


	public int getPuertas() {
		return Puertas;
	}


	public void setPuertas(int puertas) {
		this.Puertas = puertas;
	}


	public void mostrarDatos () {
		 System.out.println("\n REFRIGERADOR:"+ "\n MARCA: "+ getMarca()+"\n COLOR:"+getColor()+"\n TAMAÑO: "+getTamaño()+
		 "\n MODELO:" +getModelo()+"\n PRECIO: $ "+getPrecio()+"\n CAPACIDAD:  "+ getCapacidad()+"\n PUERTAS:"+Puertas);
	 }
	

}
