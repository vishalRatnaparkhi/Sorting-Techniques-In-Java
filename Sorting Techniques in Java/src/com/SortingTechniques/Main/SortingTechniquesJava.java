package com.SortingTechniques.Main;

import java.util.*;

import com.SortingTechniques.Sorting.Sort;
import com.SortingTechniques.Sorting.Bubble.BubbleSort;
import com.SortingTechniques.Sorting.Bucket.BucketSort;
import com.SortingTechniques.Sorting.Counting.CountingSort;
import com.SortingTechniques.Sorting.Heap.HeapSort;
import com.SortingTechniques.Sorting.Insertion.InsertionSort;
import com.SortingTechniques.Sorting.Merge.MergeSort;
import com.SortingTechniques.Sorting.Quick.QuickSort;
import com.SortingTechniques.Sorting.Radix.RadixSort;
import com.SortingTechniques.Sorting.Selection.SelectionSort;
import com.SortingTechniques.Sorting.Shell.ShellSort;

public class SortingTechniquesJava {

	public static void main(String[] args) {
		int ch;
		
		Scanner sc= new Scanner( System.in);
		System.out.println("Sorting Algorithms");
		System.out.print("Enter Array Size : ");
		int no=sc.nextInt();
		int arr[]= new int[no];
	
		System.out.println("Enter "+no+" elements :");
		for(int i=0;i<no;i++)
			arr[i]=sc.nextInt();
		
		do {
		System.out.println("\n\n\t1. Bubble Sort\n\t2. Insertion Sort \n"
				+ "\t3. Selection Sort\n\t4. Merge Sort \n\t5. Shell Sort \n\t6. Quick Sort \n"
				+ "\t7. HeapSort \n\t8. Counting Sort \n\t9. Radix Sort \n\t10. Bucket Sort");
		System.out.println("Enter Your Choice : ");
		ch= sc.nextInt();
		Sort sort;
		
		switch(ch)
		{
		case 1: sort= new BubbleSort(arr);
				System.out.println("Array Sorted By Bubble Sort :");
				display(sort.sort());
				break;
			
		case 2: sort= new InsertionSort(arr);
			    System.out.println("Array Sorted By Insertion Sort :");
			    display(sort.sort());
				break;
		case 3: sort= new SelectionSort(arr);
				System.out.println("Array Sorted By Selection Sort :");
				display(sort.sort());
				break;
			
		case 4: sort= new MergeSort(arr);
				System.out.println("Array Sorted By Merge Sort :");
				display(sort.sort());
				break;
			
		case 5: sort= new ShellSort(arr);
				System.out.println("Array Sorted By Shell Sort :");
				display(sort.sort());
				break;
		case 6: sort= new QuickSort(arr);
				System.out.println("Array Sorted By Quick Sort :");
				display(sort.sort());
				break;
		case 7: sort= new HeapSort(arr);
				System.out.println("Array Sorted By Heap Sort :");
				display(sort.sort());
				break;
		case 8: sort= new CountingSort(arr);
				System.out.println("Array Sorted By Counting Sort :");
				display(sort.sort());
				break;
		case 9: sort= new RadixSort(arr);
				System.out.println("Array Sorted By Radix Sort :");
				display(sort.sort());
				break;
		case 10:sort= new BucketSort(arr);
				System.out.println("Array Sorted By Bucket Sort :");
				display(sort.sort());
				break;
				
			
			
		}
		}while(ch<11);
		
	
	}
	public static void display(int a[])
	{
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
		System.out.println();
	}
	
}
