package entities;

public class ImportProduct extends Product {
	
	private Double customsFee;

	public ImportProduct() {
	}

	public ImportProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	@Override
	public String priceTag() {
		return name +" - Price: $" +  price +"(Customs fee: $" +  customsFee + ") Total price: " + totalPrice();
	}
	
	public Double totalPrice() {
		return price + customsFee;
	}
}
