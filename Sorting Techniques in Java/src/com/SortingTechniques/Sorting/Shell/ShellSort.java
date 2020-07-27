package com.SortingTechniques.Sorting.Shell;

import com.SortingTechniques.Sorting.Sort;

public class ShellSort implements Sort {

	int a[];
	
	public ShellSort(int[] a) {
		super();
		this.a = a.clone();
		System.out.println("Shell sort is a highly efficient sorting algorithm and is based on insertion sort algorithm.\n\tThis algorithm avoids large shifts as in case of insertion sort, if the smaller value is to the\n\tfar right and has to be moved to the far left.\n\tThis algorithm uses insertion sort on a widely spread elements, first to sort them and then\n\tsorts the less widely spaced elements. This spacing is termed as interval. This interval is\n\tcalculated based on Knuth's formula as −\n\th = h * 3 + 1\n\twhere −\n\t h is interval with initial value 1\n\tThis algorithm is quite efficient for medium-sized data sets as its average and worst case\n\tcomplexity are of O(n), where n is the number of items.");

	}

	@Override
	public int[] sort()
	{
		int interval=1;int inner;
		int value;
		while(interval<=a.length/3)
			interval=interval*3+1;
		
		
		while(interval>0)
		{
			
			for(int outer=interval;outer<a.length;outer++)
			{
				value=a[outer];
				inner=outer;
				while(inner>interval-1 && a[inner-interval]>value)
				{
					a[inner]=a[inner-interval];
					inner=inner-interval;
				}
				a[inner]=value;
			}
			interval=(interval-1)/3;
		}
		
		
		
		return a;
	}

	
}
