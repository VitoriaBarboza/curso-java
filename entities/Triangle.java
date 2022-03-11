//pacote da classe
package entities;

//nome da classe
public class Triangle {
	// atributos da classe
	public double a;
	public double b;
	public double c;
	
	
	
	//public: indica que o atributo ou metodo pode ser usado em outros arquivos
	//double: tipo de dado que o metodo retorna(se o metodo nao retorna nada, usa-se a palavra "void"
	//area: nome do metodo
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * ( p - a) *  (p - b) * (p - c));//corpo do metodo
		
	}
}
//como e um calculo de area vai retornar um valor double  