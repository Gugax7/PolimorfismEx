package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportProduct;
import entities.Product;
import entities.UsedProduct;

public class Main {
	
	public static void main(String[]args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat date1 = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products:");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data: ");
			System.out.print("Common, used or imported? (c/u/i):");
			char cui = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if(cui == 'u') {
				System.out.print("Manufacture date: ");
				Date manufactureDate = date1.parse(sc.next());
				Product product1 = new UsedProduct(name, price, manufactureDate);
				list.add(product1);
			}
			if(cui == 'i') {
				System.out.print("Customs fee: $");
				Double customsFee = sc.nextDouble();
				Product product1 = new ImportProduct(name, price, customsFee);
				list.add(product1);
			}
			else {
				Product product1 = new Product(name, price);
				list.add(product1);
			}
				
		}
		for(Product x: list) {
			System.out.println(x.priceTag());
		}
		
	}

}
