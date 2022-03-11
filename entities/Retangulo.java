package entities;

public class Retangulo {

	public double width;
	public double height;
	public double perimetro;
	public double cateto1;
	public double cateto2;
	public double diagonal;
	
	public double areaDoRetangulo() {
		return width * height;
		
	}
	
	public double perimetroDoRetangulo() {
	 return perimetro = (width*2) + (height *2);
		
	}
	
	public double hipotenusaDoRetangulo() {
		diagonal = (width*width) + (height*height);
		return Math.sqrt(diagonal);
	}
	
}
