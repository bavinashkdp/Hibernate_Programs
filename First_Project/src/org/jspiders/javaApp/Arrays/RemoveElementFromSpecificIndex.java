package org.jspiders.javaApp.Arrays;

import java.util.Scanner;

public class RemoveElementFromSpecificIndex 
{

	public static void main(String[] args) 
	{
		int[]arr={10,20,30,40,50};
		int index=3;
		remove(arr, index);
	}
	public static void remove(int[]arr,int index)
	{
		if(index<0|index>arr.length)
		{
			System.out.println("invalid index");
		}
		else{
		System.out.println("before deletring element");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("lenght="+arr.length);
		int []arr2=new int[arr.length-1];
		for(int i=0;i<index;i++)
		{
			arr2[i]=arr[i];
		}
		for (int i = index; i < arr.length; i++)
		{
		arr2[i-1]=arr[i];	
		}
		System.out.println("after deletring element");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
		System.out.println("lenght="+arr2.length);
		}
		
	}

}
