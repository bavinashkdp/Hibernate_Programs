package org.jspiders.javaApp.Arrays;

import java.util.Scanner;

public class InsertElements {

	public static void main(String[] args) 
	{
		Scanner  scanner=new Scanner(System.in);
		System.out.println("enter size????");
		int length=scanner.nextInt();
		int[]arr=new int[length];
		System.out.println("enter "+length+" elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scanner.nextInt();
		}
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]);
			
		}
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println("arr["+i+"]--->"+arr[i]);
		}

	}

}
