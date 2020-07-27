package com.SortingTechniques.Sorting.Selection;

import com.SortingTechniques.Sorting.Sort;

public class SelectionSort implements Sort {

	int a[];
	int count=0;
	public SelectionSort(int[] a) {
		super();
		this.a = a.clone();
		System.out.println("Selection sort is a simple sorting algorithm. This sorting algorithm is an in-place\n\tcomparison-based algorithm in which the list is divided into two parts, the sorted part at\n\tthe left end and the unsorted part at the right end. Initially, the sorted part is empty and\n\tthe unsorted part is the entire list.\n\tThe smallest element is selected from the unsorted array and swapped with the leftmost\n\telement, and that element becomes a part of the sorted array. This process continues\n\tmoving unsorted array boundary by one element to the right.\n\tThis algorithm is not suitable for large data sets as its average and worst case complexities\n\tare of O(n2), where n is the number of items.");
	}
	@Override
	public int[] sort() {
		
		for(int i=0;i<a.length-1;i++)
		{
			int min =i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[min]>a[j])
					min=j;
			}
			if(min!=i)
			{
				swap(min,i);
				count++;
			}
	    }
		System.out.println("Total No of Swaps are : "+count);
		return a;
	}
	public void swap(int i,int j)
	{
		int tem=a[j];
		a[j]=a[i];
		a[i]=tem;
	}

}
