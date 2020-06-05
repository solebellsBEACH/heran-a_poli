package entities;

import java.util.Date;

public class usedProduct extends Product {
	
	Date dateFabrication;
	
	usedProduct(){
		
	}

	public usedProduct(String name, Double price, Date dateFabrication) {
		super(name, price);
		this.dateFabrication = dateFabrication;
	}

	public Date getDateFabrication() {
		return dateFabrication;
	}

	public void setDateFabrication(Date dateFabrication) {
		this.dateFabrication = dateFabrication;
	}
  
	
}
