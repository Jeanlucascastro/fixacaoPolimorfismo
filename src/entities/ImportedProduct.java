package entities;

public class ImportedProduct extends Product {

	private Double customsFree;
	
	public ImportedProduct() {
		
	}
	
	public ImportedProduct(String name, Double price, Double customsFree) {
		super(name, price);
		this.customsFree = customsFree;
	}

	public Double getCustomsFree() {
		return customsFree;
	}

	public void setCustomsFree(Double customsFree) {
		this.customsFree = customsFree;
	} 
	
	public Double totalPrice () {
		return getPrice() + customsFree;
	}
	
	public String PriceTag() {
		return getName() + String.format("%.2f", totalPrice()) + "(Customs free :) " + String.format("%.2f", customsFree) + ")";
	}
	
	
}