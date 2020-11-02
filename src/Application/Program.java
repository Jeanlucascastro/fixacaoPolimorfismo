package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List<Product> list = new ArrayList();
		
		System.out.println("Quantos produtos sao ?");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {; 
			System.out.println("Digite o produto " + " : ");
			System.out.println("Este produto é Importado (i), Comum (c) ou Usado (u)");
			char ch = sc.next().charAt(0);
			System.out.println("Nome do produto: ");
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			
			if (ch == 'i') {
				System.out.println("Digite a taxa da alfandega:");
				double customsFree = sc.nextDouble();
				
				
			}
			if (ch == 'c') {
				list.add(new Product(name, price));
				
			}
			
			if (ch == 'u') {
				
			}
		}
		
		
		
		
		
		sc.close();
	}

}
