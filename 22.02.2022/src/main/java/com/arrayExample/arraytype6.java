package com.arrayExample;

public class arraytype6 {

	public static void main(String[] args)
	{
		// multidimensional array in multiple lines
		int matrix[][]=new int[3][2];//array object creation
		
		matrix[0][0]= 1;
		matrix[0][1]= 0;
		
		matrix[1][0]= 0;
		matrix[1][1]= 1;
		
		matrix[1][0]= 0;
		matrix[1][1]= 0;

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.print("\n\n\n");
		}
		
		
	}

}
