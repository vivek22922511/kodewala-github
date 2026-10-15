package com.kodewala.collection.fw.compare1;


import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


class Product implements Comparable<Product>
{
	int productId;
	String productName;
	public Product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}
	@Override
	public int compareTo(Product p) {
	
		int result=Integer.compare(this.productId, p.productId);
		return result;
	}
	
	
}


public class Driver{
	
	public static void main(String args[]) {
		 Product p1=new Product(1001,"iPhone");
		 Product p2=new Product(100,"Oppo");
		 Product p3=new Product(1200,"Realme");
		 Product p4=new Product(99,"Samsung");
		 Product p5=new Product(1030,"Nokia");
		 
		 ArrayList<Product>products=new ArrayList<Product>();
		 
		 products.add(p1);
		 products.add(p2);
		 products.add(p3);
		 products.add(p4);
		 products.add(p5);
		 
		 Collections.sort(products);
		 
		 for(int i=0;i<products.size();i++)
		 {
			 Product p=products.get(i);
			 System.out.println(p.productId +" , "+p.productName);
		 }
		 
	}
	
}

