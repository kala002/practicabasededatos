package punto1.model;

import punto1.util.categoria;
import punto1.util.origenFabricacion;

public class Producto {
 private int codigo;
 private String descripcion;
 private double precioUnitario;
 private origenFabricacion origenfabricacion;
 private categoria categori;
 
 public Producto() {
	// TODO Auto-generated constructor stub
}
 public Producto(int codigo,String descripcion,double precioUnitario,origenFabricacion origenfabricacion,categoria category) {
	 this.codigo=codigo;
	 this.descripcion=descripcion;
	 this.precioUnitario=precioUnitario;
	 this.origenfabricacion=origenfabricacion;
	 this.categori=category;
}
public int getCodigo() {
	return codigo;
}
public String getDescripcion() {
	return descripcion;
}
public double getPrecioUnitario() {
	return precioUnitario;
}
public origenFabricacion getOrigenfabricacion() {
	return origenfabricacion;
}
public categoria getCategori() {
	return categori;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
public void setPrecioUnitario(double precioUnitario) {
	this.precioUnitario = precioUnitario;
}
public void setOrigenfabricacion(origenFabricacion origenfabricacion) {
	this.origenfabricacion = origenfabricacion;
}
public void setCategori(categoria categori) {
	this.categori = categori;
}
// solo me falto lo de abajo xd
 @Override
 public String toString(){
	 return "producto[codigo="+codigo+", descripcion="+descripcion+", precio por unidad"+precioUnitario
			 +", oriden de fabricacion="+origenfabricacion+", categoria="+categori+"]";
 }
}