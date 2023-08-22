package entities;

public class Produto {
	private Integer idProduto;
	private String nameProduto;
	private Double price;
	private Integer quantity;
	
	public Produto() {}

	public Produto(Integer idProduto, String nameProduto, Double price, Integer quantity) {
		this.idProduto = idProduto;
		this.nameProduto = nameProduto;
		this.price = price;
		this.quantity = quantity;
	}

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public String getNameProduto() {
		return nameProduto;
	}

	public void setNameProduto(String nameProduto) {
		this.nameProduto = nameProduto;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	//Métodos: 
	
	public Double totalValue() {
		return  price * quantity;
	}
	
	public String toString() {
		return "ID: "+idProduto+", Name Product: "+nameProduto+", Quantity: "+quantity+", price total: "+String.format("%.3f", totalValue());
	}
	
}
