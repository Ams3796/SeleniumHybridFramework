package com.appium;

import java.util.Arrays;

public class Newprogram {

	public static void main(String[] args) {
		int[] a = {2,5,2,9,5,1,6,8,5,3,0,4};
		int len=a.length;
		for(int i=0;i<len-1;i++)
		{
			for(int j=0;j<len-1;j++)
			{
				if(a[j]>a[j+1])
				{   int temp = a[j];
					a[j]=a[j+1];
					a[j+1]= temp;
				}
			}
			
		}
		System.out.print(Arrays.toString(a));
		

	}

}
