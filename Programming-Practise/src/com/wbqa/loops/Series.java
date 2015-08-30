package com.wbqa.loops;

public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ln = 6; // Number of lines
		for (int i = 1, k = 1; i <= ln; i++, k += 2)
		{
			for (int s = ln - i; s < ln - 1; s++)
				System.out.print(" "); // Spaces
			for (int j = ln * 2 - 1; j >= k; j--) 
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
