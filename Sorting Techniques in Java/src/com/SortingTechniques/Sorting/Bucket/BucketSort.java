package com.SortingTechniques.Sorting.Bucket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.SortingTechniques.Sorting.Sort;

public class BucketSort implements Sort {

	int a[];
	List<List<Integer>> buckets; 
	
	public BucketSort(int[] a) {
		super();
		this.a = a.clone();
		buckets=new ArrayList<>(10);
		System.out.println("Bucket sorting, sometimes known as bin sorting, is a specific sorting algorithm.\n\t The sort works by distributing the elements we want to sort into several individually sorted buckets.\n\t By doing this, we can reduce the number of comparisons between the elements and help cut the sorting time.\n\tLet's take a quick look at the steps required to perform a bucket sort:\n\n\t1. Set up an array of our initially empty buckets\n\t2. Distribute our elements into their appropriate buckets\n\t3. Sort each bucket\n\t4. Concatenate the sorted buckets together to recreate the full list\n\t\tWorst Case Scenario\n\t\tIn our worst-case scenario, we'd find all of our elements in the same bucket and in reverse order.\n\t\t When this case occurs, we're reducing our bucket sort to a simple sort \n\t\tin which every element is compared to every other element,\n\t\t yielding a time complexity of O(n²).\n\t\tAverage Case Scenario\n\t\tIn our average case, we find that the elements are relatively evenly distributed among our input buckets.\n\t\t Since each of our steps requires just one iteration through our input buckets,\n\t\t we find that our bucket sort completes in O(n) time.\n\t\t");
		
		
	}

	@Override
	public int[] sort() {
		
		for(int i = 0; i < 10; i++) {
		    buckets.add(new ArrayList<>());
		}
	
		for(int i=0;i<a.length;i++)
		{
			buckets.get(digits(a[i])).add(a[i]);
			System.out.println(" "+buckets.get(digits(a[i])));
			
		}
		
		for(int i=0;i<a.length;i++)
		{
			
			Collections.sort(buckets.get(digits(a[i])));
			
		}
		int k=0;
		for(int i=0;i<buckets.size();i++)
		{
			for(int j=0;j<buckets.get(i).size();j++)
			{
				a[k++]=buckets.get(i).get(j);
			}
		}
		
		return a;
	}
	
	
	public int digits(int no)
	{
		int count=0;
		while(no>0)
		{
			count++;
			no/=10;
		}
		
		return count;
	}

}
