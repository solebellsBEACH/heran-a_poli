package entities;

public class Imported_Product extends Product {
	
	Double coustomsFee;
	
	Imported_Product(){
		
	}

	public Imported_Product(String name, Double price, Double coustomsFee) {
		super(name, price);
		this.coustomsFee = coustomsFee;
	}

	public Double getCoustomsFee() {
		return coustomsFee;
	}

	public void setCoustomsFee(Double coustomsFee) {
		this.coustomsFee = coustomsFee;
	}
	
	public double totalPrice(Double price, Double coustomsFee) {
		
		double totalPrice= price * coustomsFee;
		
		return totalPrice;
	}
	
	@Override
	public String priceTag(Double totalPrice){
		String stringPrice= totalPrice.toString();
		
		return stringPrice;
	}
}
