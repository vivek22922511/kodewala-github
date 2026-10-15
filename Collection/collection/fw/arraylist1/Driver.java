package com.kodewala.collection.fw.arraylist1;
import java.util.ArrayList;

public class Driver {

//	public static void main(String[] args) {
//	
//		 CityService cityService=new CityService();
//		 
//		ArrayList<String>cities= cityService.getCityNames();
//		
//		
//		for(String city:cities)
//		{
//			if(city.startsWith("D"))
//			{
//				System.out.println(city);
//			}
//		}
//
//	}
	
	
	public static void main(String args[]) {
		
		CityService cityservice=new CityService();
		ArrayList<String>cities=cityservice.getCityNames();
		
		for(String city:cities)
		{
			if(city.startsWith("h")) {
				System.out.println(city);
			}
		}
		
	}
	
}
	
