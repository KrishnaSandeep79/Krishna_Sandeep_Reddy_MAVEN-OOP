package com.epam.task_1;

import java.util.LinkedList;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	LinkedList  <Sweet> sweets = new LinkedList<Sweet>();
        Scanner scan = new Scanner(System.in);
        int low_limit, high_limit;
        
        sweets.add(new Sweet("candy1",50,20) {
			@Override
			String getType() {
				
				return "candy";
			}
		});
        
        sweets.add(new Sweet("chocolate1",80,100) {
			@Override
			String getType() {
				
				return "chocolate";
			}
		});
        
        sweets.add(new Sweet("candy2",90,60) {
			@Override
			String getType() {
				return "candy";
			}
		});
        
        sweets.add(new Sweet("chocolate2",45,40) {
			@Override
			String getType() {
				return "chocolate";
			}
		});
        
        sweets.add(new Sweet("candy3",100,90) {
			@Override
			String getType() {
				return "candy";
			}
		});
        
        sweets.add(new Sweet("chocolate3",100,150) {
			@Override
			String getType() {
				return "chocolate";
			}
		});
        
        Gift new_year = new Gift(sweets);
        
        int sw = new_year.sumOfWeights();
        
        System.out.println("Total Weight: " + sw);
        
        new_year.sortChocolates("weight");
        
        for(Sweet s: new_year.sweets) {
        	
        	if(s.getType().equals("chocolate")) 
        		System.out.println(s.name);
        }
        
 
        
        System.out.println("Enter lower and higher limit for cost of candies: ");
        
        low_limit=scan.nextInt();
        high_limit=scan.nextInt();
        
        for(Sweet s: new_year.sweets) {
        	
        	if(s.getType().equals("candy") && s.cost>low_limit && s.cost<high_limit) 
        		System.out.println(s.name);
        }
        
    }
   
}