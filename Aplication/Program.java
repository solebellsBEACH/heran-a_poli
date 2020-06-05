package Aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Imported_Product;
import entities.Product;
import entities.usedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yy");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		List<Product> list = new ArrayList<>();
		
		for(int i = 0; i<n; i++) {
			System.out.println("Product #" + (i+1) + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			sc.nextLine();
			String m = sc.nextLine();
			
			if(m == "c") {
				System.out.print("Name: ");
				String name= sc.nextLine();
				System.out.print("Price: ");
				double price= sc.nextDouble();
				
				list.add(new Product(name, price));
								
			}
			else if(m == "u") {
				System.out.print("Name: ");
				String name= sc.nextLine();
				System.out.print("Price: ");
				double price= sc.nextDouble();
				System.out.print("Date Fabrication: ");
				Date dateFabrication= sdf1.parse(sc.next());
				
				list.add(new usedProduct(name, price, dateFabrication));
					
			}
			else  {
				System.out.print("Name: ");
				String name= sc.nextLine();
				System.out.print("Price: ");
				double price= sc.nextDouble();
				System.out.print("Coustums Fee: ");
				double coustomsFee= sc.nextDouble();
				
				list.add(new Imported_Product(name, price, coustomsFee));
			}
			System.out.println("PRICE TAGS:");
			
			for(int j=0; j<n; j++) {
				
				if(list.get(j).getClass() == usedProduct.class) {
					System.out.println(list.get(j).getName() + "(used) $ " + list.get(j).getPrice() + 
							"(Manufacture date:" + list.get(j)+ ")");
				}
				else if(vect[j].getClass() == Imported_Product.class) {
					System.out.println(vect[j].getName() + " $ " + vect[j].getPrice() + 
							"(Customs fee: $" + vect[j] + ")");
				}
			}
		}
	}

}
