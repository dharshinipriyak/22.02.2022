package com.arrayExample;

public class arraytype3 {

	public static void main(String[] args) 
	{
		//multidimensional array in single line
		
		int matrix[][]= {{66,21},{72,24}};
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.print("\n\n");
		}
		

	}

}
