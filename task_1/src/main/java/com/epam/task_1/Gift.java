package com.epam.task_1;

import java.util.*;

public class Gift {
	
	LinkedList<Sweet> sweets;
	
	Gift(LinkedList<Sweet> sweets) {
		this.sweets=sweets;
	}
	
	public int sumOfWeights() {
		int sum=0;
		for(Sweet sweet:sweets)
		{
			sum+=sweet.weight;
		}
		return sum;
	}
	
	public void sortChocolates(String sortKey) {
		
		if(sortKey.compareTo("name") == 0) {
			Collections.sort(sweets, new SortByName());
		}
		
		else if(sortKey.compareTo("cost") == 0) {
			
			Collections.sort(sweets, new SortByName());
		}
		else {
			Collections.sort(sweets, new SortByWeight());

		}
	}
}
