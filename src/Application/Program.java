package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		
		System.out.println("Quantos produtos sao ?");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {; 
			System.out.println("Digite o produto " + " : ");
			System.out.println("Este produto é Importado (i), Comum (c) ou Usado (u)");
			char ch = sc.next().charAt(0);
			System.out.println("Nome do produto: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Digite o preço: ");
			double price = sc.nextDouble();
			
			if (ch == 'i') {
				System.out.println("Digite a taxa da alfandega:");
				double customsFree = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFree));
				
				
			}
			else if (ch == 'c') {
				list.add(new Product(name, price));
				
			}
			
			else {
				System.out.println("Digite a data de fabricação: ");
				Date date = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, date));
				
			}
		}
		
		System.out.println();
		System.out.println("Table: ");
		for (Product prod : list) {
			System.out.println(prod.priceTag());
			
		}
		
		
		
		
		
		
		sc.close();
	}

}
