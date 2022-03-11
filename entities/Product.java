package entities;

public class Product {
	//nao esquecer de declarar se a variavel é public ou private
	//iniciar as var c letras minusculas nos atributos e metodos
	
	public String name;
	public double price;
	public int quantity;
	
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	//void pq nao vou retornar nada e sim apenas acrescentar valor
	//this tem a funcao de autoreferencia, pra deixar claro q quero adicionar valor ao atributo quantity e nao acessar o paramentro da funcao, utilizo o this pra deixar claro q estou falando do atributo
	public void addProducts(int quantity) {
		this.quantity += quantity;
		//esse comando vai somar esse quantity que veio como argumento com o meu atributo quantity da minha classe
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
		
	}
	
	//quando eu pedir pra ler meu product o toString vai formatar a forma como as informações vao ser mostradas atraves do acesso ao product
	public String toString() {
		
		return name
		+ ", $ "
		+ String.format("%.2f", price)
		+ ", "
		+ quantity
		+ "units, Total:  $ "
		+ totalValueInStock();
	}
}
