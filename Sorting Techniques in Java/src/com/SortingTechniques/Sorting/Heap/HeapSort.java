package com.SortingTechniques.Sorting.Heap;

import com.SortingTechniques.Sorting.Sort;

public class HeapSort implements Sort {

	int a[];
	int count=0;
	
	public HeapSort(int[] a) 
	{
		super();
		this.a = a.clone();
		System.out.println("\tHeap sort is a comparison based sorting technique based on Binary Heap data structure. \n\tIt is similar to selection sort where we first find the maximum element and place the maximum element at the end.\n\t We repeat the same process for remaining element\n\tHeap Sort Algorithm for sorting in increasing order:\n\t1. Build a max heap from the input data.\n\t2. At this point, the largest item is stored at the root of the heap. \n\tReplace it with the last item of the heap followed by reducing the size of heap by 1. \n\tFinally, heapify the root of tree.\n\t3. Repeat above steps while size of heap is greater than 1.");
	}

	@Override
	public int[] sort() 
	{
		int n=a.length-1;
		while(n>=0)
			maxHeap(a,n--);
		System.out.println("Total swaps are "+count);
		return a;
	}
	
	public int[] maxHeap(int a[],int n) 
	{
		int cur,prev;
		 
		for(int i=n;i>=0;i--)
		{
			cur=i;
			prev=(cur-1)/2;
			while(prev>=0 && cur!=prev)
			{
				if(a[prev]<a[cur])
					swap(prev,cur);
			
				cur=prev;
				prev=(prev-1)/2;
			}
				
		}
		swap(0,n);
		
		return a;
	}
	
	
	
	public void swap(int i,int j)
	{
		count++;
		int tem=a[i];
		a[i]=a[j];
		a[j]=tem;
	}

}
