package com.kodewala.collection.hashset;

import java.util.HashSet;
public class Driver1 {
	public static void main(String[]args) {
		HashSet<String>product=new HashSet<String>();
		product.add("iPhone");
		product.add("Samsung");
		product.add("Nokia");
		product.add("Redme");
		product.add("Realme");
		
		System.out.println(product);   
		int hash="iPhone".hashCode();
		int spreadHash= hash^(hash>>>16);
		int bucketNumber=spreadHash & 15;
		
		System.out.println("Bucket number is .."+bucketNumber);
		
	}

}
