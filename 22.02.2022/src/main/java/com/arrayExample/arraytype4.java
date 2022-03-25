package com.arrayExample;

public class arraytype4 {

	public static void main(String[] args) {
		// multidimensional array in multiple line
		int matrix[][]=new int[3][3];
		
		matrix[0][0]=1;
		matrix[0][1]=0;
		matrix[0][2]=0;
		
		matrix[1][0]=0;
		matrix[1][1]=1;
		matrix[1][2]=0;
		
		matrix[1][0]=0;
		matrix[1][1]=0;
		matrix[1][2]=1;
	
		for(int i=0; i<matrix.length; i++)
		{
			for(int j=0; j<matrix.length; j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.print("\n\n\n");
		}

	}

}
