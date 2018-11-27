package org.jspiders.javaApp.Arrays;

import java.util.Scanner;

public class ReverseElements {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter size????");
		int length=scanner.nextInt();
		int[]arr=new  int[length];
		System.out.println("enter "+length+" elements????");
		for (int i = 0; i < arr.length; i++)
		{
		arr[i]=scanner.nextInt();	
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("before reverse");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("arr["+i+"]---->"+arr[i]);
		}
		
		//reverse technique
		for(int i=0;i<arr.length/2;i++)
		{
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		System.out.println("after reverse");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("arr["+i+"]---->"+arr[i]);
		}

	}

}
