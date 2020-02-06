package com.epam.task_1;

public abstract class Sweet {
	
	protected String name;
	protected int weight, cost;
	
	Sweet(String sweet_name, int sweet_weight, int sweet_cost)
	{
		this.name=sweet_name;
		this.weight=sweet_weight;
		this.cost=sweet_cost;
	}

	abstract String getType();

}
