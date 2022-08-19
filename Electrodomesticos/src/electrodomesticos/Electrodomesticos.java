package Electrodomesticos;

 public class Electrodomesticos {
	 
 private String Marca;
 private String color;
 private String Tamaño;
 private String Modelo;
 private double precio;
 private double capacidad;
 
 public Electrodomesticos(String marca, String color, String tamaño, String modelo, double precio, double capacidad) {
	super();
	Marca = marca;
	this.color = color;
	Tamaño = tamaño;
	Modelo = modelo;
	this.precio = precio;
	this.capacidad = capacidad;
}
public String getMarca() {
	return Marca;
}
public void setMarca(String marca) {
	Marca = marca;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getTamaño() {
	return Tamaño;
}
public void setTamaño(String tamaño) {
	Tamaño = tamaño;
}
public String getModelo() {
	return Modelo;
}
public void setModelo(String modelo) {
	Modelo = modelo;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
public double getCapacidad() {
	return capacidad;
}
public void setCapacidad(double capacidad) {
	this.capacidad = capacidad;
}

 

}
	