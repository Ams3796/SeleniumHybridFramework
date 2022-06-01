package com.Web;

public class Array {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int l=a.length;
		
		for(int i=0;i<=l-1;i++)
		{
			for(int j=0;j<=l-1;j++)
			{
				a[i]=a[i+1];
			}
		}

	}

}
