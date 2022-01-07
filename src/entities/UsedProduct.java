package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	
	private Date manufactureDate;
	SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
	
	

	public UsedProduct() {
		
		
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	@Override
	public String priceTag() {
		return name +" - Price: $" +  price +"(Manufacture Date: " + sdf1.format(manufactureDate) + ")";
		
	}
	

}
