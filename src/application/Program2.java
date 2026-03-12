package application;

import java.util.Scanner;

import entites.Product;


public class Program2 {
	public static void main(String[]args) {
		
		Scanner sc = new  Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data:");
		
		System.out.println("name:");
		product.name = sc.nextLine();
		
		System.out.println("price: ");
		product.price = sc.nextDouble();
		
		System.out.println("Quantity in Stock: ");
		product.quantity = sc.nextInt();
		
		
		System.out.println(product.toString()); // way to call the toString method

		// System.out.println(product); // second way to call the toString method
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);

		

		sc.close();
	}
}

