package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------------------------------");
		System.out.println("Quantos Produtos deseja adquirir: ");
		System.out.println("----------------------------------");
		int n = sc.nextInt();
		
		
		List<Produto> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			System.out.println("-------------------");
			System.out.println("Product #"+(i+1)+":");
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			
			while(hasID(list, id)) {
				System.out.println("--------------------------------------------------");
				System.out.println("ID já selecionado anteriormente,tente novamente:  ");
				System.out.println("--------------------------------------------------");
				id = sc.nextInt();
			}
			
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Price: ");
			Double price = sc.nextDouble();
			System.out.println("Quantity the product: ");
			Integer quantity = sc.nextInt();
			
			Produto prod = new Produto(id,name,price,quantity);
			list.add(prod);
		}
			System.out.println("------------------------------");
			System.out.println("Lista de Produtos Escolhidos: ");
			System.out.println("------------------------------");
			
			for(Produto prod : list) {
				System.out.println(prod);
			}

	}
		public static boolean hasID(List<Produto> list, int id) {
			Produto emp = list.stream().filter(x -> x.getIdProduto() == id).findFirst().orElse(null);
			return emp != null;
		}
}
