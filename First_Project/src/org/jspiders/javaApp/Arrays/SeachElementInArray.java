package org.jspiders.javaApp.Arrays;

public class SeachElementInArray {

	public static void main(String[] args) 
	{
		int[]arr={10,30,20,40,80,70};
		int ele=80;
		int index=seach(arr, ele);
		if(index<0|index>arr.length)
		{
			
			System.out.println("indalid index");
		}
		else
		{
			for (int i = 0; i < arr.length; i++) {
				System.out.println("arr["+i+"]--->"+arr[i]);
			}
			System.out.println(ele+" is placed in the position "+index);
		}
	}
	static int seach(int[]arr,int ele)
	{
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i]==ele)
			{
				return i;
			}
		}
		
		
		return -1;
	}

}
