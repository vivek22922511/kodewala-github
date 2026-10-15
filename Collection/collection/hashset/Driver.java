package com.kodewala.collection.hashset;
import java.util.HashSet;
public class Driver {

	public static void main(String[]args) {
		
		HashSet<String>hashset=new HashSet<String>();
		hashset.add("Asr");
		hashset.add("Bsr");
		hashset.add("Csr");
		hashset.add("Dsr");
		hashset.add("Esr");
		hashset.add("Fsr");
		
		System.out.println(hashset);
		
		System.out.println("Asr".hashCode());
		
		//Calculate the hash code for the element
		
		int hash="Esr".hashCode();
		int spreadHash=hash^(hash>>>16);
		int bucket=spreadHash &(16-1);
		System.out.println("bucket is " +bucket);
		
		
		
	}
}
