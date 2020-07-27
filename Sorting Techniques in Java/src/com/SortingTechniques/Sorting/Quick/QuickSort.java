package com.SortingTechniques.Sorting.Quick;

import com.SortingTechniques.Sorting.Sort;

public class QuickSort implements Sort {

	int a[];
	
	public QuickSort(int[] a) {
		super();
		this.a = a.clone();
		System.out.println("Quick sort is a highly efficient sorting algorithm and is based on partitioning of array of\n\tdata into smaller arrays. A large array is partitioned into two arrays one of which holds\n\tvalues smaller than the specified value, say pivot, based on which the partition is made\n\tand another array holds values greater than the pivot value.\n\tQuick sort partitions an array and then calls itself recursively twice to sort the two resulting\n\tsubarrays. This algorithm is quite efficient for large-sized data sets as its average and\n\tworst case complexity are of O(nlogn), where n is the number of items.");
	}

	@Override
	public int[] sort() {
		// TODO Auto-generated method stub
		quickSort(0,a.length-1);
		
		return a;
	}

	public void quickSort(int left,int right)
	{
		if(right-left<=0)
			return;
		else 
		{
			int pivot=a[right];
			int partitions=partition(left,right,pivot);
			quickSort(left,partitions-1);
			quickSort(partitions+1,right);
		}
		
	}
	
	public int partition(int left,int right,int pivot)
	{
		//System.out.println("Left "+left+" right "+right+" pivot "+pivot);
		int low=left-1;
		int high=right;
		
		while(true)
		{
			while(a[++low]<pivot) ;
			while(high>0 && a[--high]>pivot) ;
			//System.out.println("need to swap low= "+a[low]+" high "+a[high]);
			//System.out.println("low "+low+" high "+high);
			if(low>=high)
			{	
				 break;
			}
			else 
			{
				swap(low,high);
				System.out.println("Items are Swapped "+a[low]+" "+a[high]);
				
			}
				
		}
		System.out.println("Pivots are Swapped "+a[low]+" "+a[high]);
		swap(low,right);
		return low;
	}
	
	public void swap(int i,int j)
	{
		int tem=a[i];
		a[i]=a[j];
		a[j]=tem;
	}
	
}
