package org.jspiders.javaApp.Arrays;

import java.util.Scanner;

public class InsertElementForASpecificPosition {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter size of an array");
		int length=scanner.nextInt();
		int[]arr=new int[length];
		System.out.println("enter "+length+" elements");
		for (int i = 0; i < arr.length; i++) 
		{
		arr[i]=scanner.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"]---->"+arr[i]);
		}
		System.out.println("int[]arr length="+arr.length);
		
		System.out.println("enter index position");
		int index=scanner.nextInt();
		System.out.println("enter replace element");
		int ele=scanner.nextInt();
		int[]arr2=insert(arr, index, ele);
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2["+i+"]---->"+arr2[i]);
		}
		scanner.close();
	}
	public static int[] insert(int[]arr,int index,int ele)
	{
		if(index>arr.length|index<0)
		{
			System.out.println("invalid option");
			return arr;
		}
		else
		{
			int[]arr2=new int[arr.length+1];
			for(int i=0;i<index;i++)
			{
				arr2[i]=arr[i];
			}
			arr2[index]=ele;
			for(int i=index;i<arr.length;i++)
			{
				arr2[i+1]=arr[i];
			}
			System.out.println("int[]arr2 length="+arr2.length);
			return arr2;
		}
	}
}
