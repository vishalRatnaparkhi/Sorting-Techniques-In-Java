package com.SortingTechniques.Sorting.Bubble;

import com.SortingTechniques.Sorting.Sort;

public class BubbleSort implements Sort {
	int a[];
	int count=0;

	public BubbleSort(int[] a) {
		super();
		this.a = a.clone();
		System.out.println("\tBubble sort is a simple sorting algorithm.\n\t This sorting algorithm is comparison-based algorithm\n\t in which each pair of adjacent elements is compared and the elements are swapped if they are not in order. \n\tThis algorithm is not suitable for large data sets \n\t as its average and worst case complexity are of O(n2) where n is the number of items.");
	}
	public int[] sort()
	{
		boolean swapped;
		for(int i=0;i<a.length;i++)
		{
			swapped=false;
			for(int j=0;j<a.length-i-1;j++) 
			{
				if(a[j]>a[j+1])
				{
					swap(j,j+1);
					swapped=true;
					count++;
				}
				
			}
			
			if(!swapped)
				break;
		}
		System.out.println("Total No of Swaps are : "+count);
		return a;
	}
	public void swap(int i,int j)
	{
		int tem=a[i];
		a[i]=a[j];
		a[j]=tem;
	}

}
