package com.epam.task_1;

import java.util.Comparator;

public class SortByWeight implements Comparator<Sweet> {

	public int compare(Sweet s1, Sweet s2) {

		return s1.weight-s2.weight;
	}
}