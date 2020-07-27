package com.SortingTechniques.Sorting.Counting;



import com.SortingTechniques.Sorting.Sort;

public class CountingSort implements Sort {

	int a[];
	int b[];
	
	public CountingSort(int[] a) {
		super();
		this.a = a.clone();
		b=new int[a.length+1];
		System.out.println("\tCounting sort is a stable sorting technique,\n\t which is used to sort objects according to the keys that are small numbers. \n\tIt counts the number of keys whose key values are same.\n\t This sorting technique is effective when the difference between different keys are not so big,\n\t otherwise, it can increase the space complexity.\n\tThe complexity of counting Sort Technique\n\tTime Complexity: O(n+r)\n\tSpace Complexity: O(n+r)\n\t");
	}

	public void display(int a[],int n)
	{
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
	@Override
	public int[] sort() {
		// TODO Auto-generated method stub
		int max=getMax();
		
		int arr[]=new int[max+1];
		for(int i=0;i<a.length;i++)
		{
			arr[a[i]]++;
			
		}
		//display(arr,arr.length);
		for(int i=1;i<arr.length;i++)
		{
			arr[i]=arr[i]+arr[i-1];
		}
		//display(arr,arr.length);
		
		for(int i=0;i<a.length;i++)
		{
			b[arr[a[i]]]=a[i];
			arr[a[i]]--;
		}
		//display(b,b.length);
		
		for(int i=0;i<a.length;i++)
			a[i]=b[i+1];
		return a ;
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

}
