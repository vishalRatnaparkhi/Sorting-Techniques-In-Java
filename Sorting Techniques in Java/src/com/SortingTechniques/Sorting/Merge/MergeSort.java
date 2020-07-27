package com.SortingTechniques.Sorting.Merge;

import com.SortingTechniques.Sorting.Sort;

public class MergeSort implements Sort {

	int a[];
	int b[];
	public MergeSort(int[] a) {
		super();
		this.a = a.clone();
		System.out.println("Merge sort is a sorting technique based on divide and conquer technique. With worst-case\n\ttime complexity being O(n log n), it is one of the most respected algorithms.\n\tMerge sort first divides the array into equal halves and then combines them in a sorted \n\tmanner");
		 b=new int [a.length];
	}
	@Override
	public int[] sort() {
		
		mergeSort(0,a.length-1);
		return a;
	}
	
	public void  mergeSort(int left , int right) 
	{
		if(left>=right)
			return;
		int mid=(left+right)/2;
		mergeSort(left,mid);
		mergeSort(mid+1,right);
		merge(left,mid,right);
		
	}
	public void merge(int leftStart,int leftEnd,int rightEnd)
	{
		int index=leftStart;
		int left=leftStart;
		int right=leftEnd+1;
		while(left<=leftEnd && right<=rightEnd)
		{
			if(a[left]<=a[right])
				b[index++]=a[left++];
			else
				b[index++]=a[right++];
		}
		
		while(left<=leftEnd)
			b[index++]=a[left++];
		
		while(right<=rightEnd)
			b[index++]=a[right++];
		for(int i=leftStart;i<=rightEnd;i++)
		{
			a[i]=b[i];
		}
		
	}

}
