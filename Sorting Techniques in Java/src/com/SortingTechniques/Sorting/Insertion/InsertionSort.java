package com.SortingTechniques.Sorting.Insertion;

import com.SortingTechniques.Sorting.Sort;

public class InsertionSort implements Sort {

	int a[];
	int count=0;
	
	public InsertionSort(int[] a) {
		super();
		this.a = a.clone();
		System.out.println("\tThis is an in-place comparison-based sorting algorithm.\n\t Here, a sub-list is maintained which is always sorted.\n\t For example, the lower part of an array is maintained to be sorted.\n\t An element which is to be 'insert'ed in this sorted sub-list,\n\t has to find its appropriate place and then it has to be inserted there.\n\t Hence the name, insertion sort.\n\t The array is searched sequentially and unsorted items are moved \n\tand inserted into the sorted sub-list (in the same array).\n\t This algorithm is not suitable for large data sets as its\n\taverage and worst case complexity are of O(n2),\n\t where n is the number of items");
	}

	@Override
	public int[] sort() {
		int i,value,j;
		for( i=1;i<a.length;i++)
		{
			value=a[i];
			j=i;
			while(j>0 && value<a[j-1])
			{
				a[j]=a[j-1];
				j--;
			}
			if(j!=i)
			{
				a[j]=value;
				count++;
			}
		}
		System.out.println("Total No of Swaps are : "+count);
		
		return a;
	}

}
