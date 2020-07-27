package com.SortingTechniques.Sorting.Radix;

import com.SortingTechniques.Sorting.Sort;
import com.SortingTechniques.Sorting.Counting.CountingSort;

public class RadixSort implements Sort {

	int a[];
	
	int out[];
	
	public RadixSort(int[] a) {
		super();
		this.a = a.clone();
		out=new int[a.length];
		System.out.println("Radix sort is an integer sorting algorithm that sorts data with integer keys by grouping the keys by individual digits that share the same significant position and value (place value). Radix sort uses counting sort as a subroutine to sort an array of numbers. \n\tBecause integers can be used to represent strings (by hashing the strings to integers),\n\t radix sort works on data types other than just integers.\n\t Because radix sort is not comparison based, \n\tit is not bounded by Omega(n log n)Ω(nlogn) for running time — in fact,\n\t radix sort can perform in linear time.\n\tRadix sort incorporates the counting sort algorithm so that it can sort larger,\n\t multi-digit numbers without having to potentially decrease the efficiency \n\tby increasing the range of keys the algorithm must sort over (since this might cause a lot of wasted time).\n");
		
	}

	@Override
	public int[] sort() {
	
		
		int n=1;
		int no=getMax();
		while(no/n>0)
		{
			countingSort(n);
			n=n*10;
		}
		
		
		return a;
	}
	public int getMax()
	{
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		return max;
	}
	
	public void countingSort(int n)
	{
		int b[]=new int[10];
		
		for(int i=0;i<a.length;i++)
			b[(a[i]/n)%10]++;
		for(int i=0;i<b.length;i++)
			System.out.print(b[i]+" ");
		System.out.println();
		
		for(int i=1;i<b.length;i++)
			b[i]=b[i]+b[i-1];
		for(int i=0;i<b.length;i++)
			System.out.print(b[i]+" ");
		System.out.println();
		
		for(int i=a.length-1;i>=0;i--)
		{
			out[b[(a[i]/n)%10]-1]=a[i];
	    	b[(a[i]/n)%10]--;
		}
		System.out.print("Output array   ");
		for(int i=0;i<out.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		
		
		for(int i=0;i<a.length;i++)
			a[i]=out[i];
		
		System.out.print("AFter passs   ");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
	
}
