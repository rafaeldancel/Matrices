
public class Class2 {
	
	public static int allRow;
	public static int allCol;
	
	public static boolean identityBa (int matrix[][])
	{
		boolean identity = true;
		for(int i = 0; i < matrix.length; i++)
	    {    
            for(int j = 0; j < matrix[0].length; j++)
            {    
              if(i == j && matrix[i][j] != 1)
              {    
            	  //System.out.println("Matrix is NOT an IDENTITY matrix");
                  return false;  
              }    
              if(i != j && matrix[i][j] != 0 )
              {    
            	 // System.out.println("Matrix is NOT an IDENTITY matrix");
                  return false;
              }

            }    
	    }
		if (identity)
        {
      	 // System.out.println("Matrix is an IDENTITY matrix");
        }
		return true;
	}
	
	public static boolean zeroBa(int matrix[][])
	{
		boolean zero = true;
	    for (int k = 0; k < matrix.length; k++)
	    {
	    	for (int l = 0; l < matrix[0].length; l++)
	    	{
	    		if(k==l && matrix[k][l] != 0)
	    		{
	    			//System.out.println("Matrix is NOT A ZERO MATRIX");
	    			return false;
	    		}
	    		if(k!=l && matrix[k][l] !=0)
	    		{
	    			//System.out.println("Matrix is NOT A ZERO MATRIX");
	    			return false;
	    		}
	    	}
	    }
	    if (zero)
    	{
    		//System.out.println("Matrix is a ZERO matrix");
    	}
	    return true;
		
	}
	
	public static boolean diagonalBa(int matrix[][])
	{
		boolean diagonal = true;
	    for(int m = 0; m < matrix.length; m++)
	    {    
            for(int n = 0; n < matrix[0].length; n++)
            {    
            	if(m == n && matrix[m][n] < 0)
                {    
            		//System.out.println("Matrix is NOT a DIAGONAL matrix");
	    			return false;  
                }    
                if(m != n && matrix[m][n] > 0)
                {    
                	//System.out.println("Matrix is NOT a DIAGONAL matrix");
	    			return false;  
                }
              }    
	    }
	    if (diagonal)
        {
        	//System.out.println("Matrix is DIAGONAL");
        }
	    return true;
		
	}
	
	public static boolean upperTriangularBa (int matrix[][])
	{
		boolean upperTriangular = true;
		for (int i = 1; i < matrix.length; i++)
		{
			for(int j = 0; j<matrix[0].length; j++)
			{
				if (i > j &&matrix[i][j] != 0)
				{
					//System.out.println("matrix is NOT AN UPPER TRIANGULAR");
					return false;
				}
				if (i < j && matrix[i][j] > 0)
				{
					//System.out.println("matrix is NOT AN UPPER TRIANGULAR");
					return false;
				}	
			}
		}
		if(upperTriangular)
		{
			//System.out.println("matrix is AN UPPER TRIANGULAR");
		}
		return true;
	}
	
	public static boolean strictlyUpperTriangularBa (int matrix[][])
	{
		boolean strictlyUpperTriangular = true;
		for (int i = 1; i < matrix.length; i++)
		{
			for(int j = 0; j<matrix[0].length; j++)
			{
				if (i==j && matrix[i][j] != 0)
				{
					//System.out.println("matrix is NOT A STRICTLY UPPER TRIANGULAR MATRIX");
					return false;
				}
				
				if (i > j && matrix[i][j] != 0)
				{
					//System.out.println("matrix is NOT A STRICTLY UPPER TRIANGULAR MATRIX");
					return false;
				}	
			}
		}
		if(strictlyUpperTriangular)
		{
			//System.out.println("matrix is A STRICTLY UPPER TRIANGULAR");
		}
		return true;
	}
	
	public static boolean lowerTriangularBa (int matrix[][] )
	{
		boolean lowerTriangular = true;
		for (int i = 1; i < matrix.length; i++)
		{
			for(int j = 0; j<matrix[0].length; j++)
			{
				if (i < j &&matrix[i][j] != 0)
				{
					//System.out.println("matrix is NOT A LOWER TRIANGULAR MATRIX");
					return false;
				}
				if (i > j && matrix[i][j] < 0)
				{
					//System.out.println("matrix is NOT A LOWER TRIANGULAR MATRIX");
					return false;
				}
									
			}
		}
		if(lowerTriangular)
		{
			//System.out.println("matrix is A LOWER TRIANGULAR MATRIX");
		}
		return true;
	}
	
	public static boolean strictlyLowerTriangularBa(int matrix[][] )
	{
		boolean strictlyLowerTriangular = true;
		for (int i = 1; i < matrix.length; i++)
		{
			for(int j = 0; j<matrix[0].length; j++)
			{
				if (i==j && matrix[i][j] != 0)
				{
					//System.out.println("matrix is NOT A STRICTLY UPPER TRIANGULAR MATRIX");
					return false;
				}
				
				if (i < j && matrix[i][j] != 0)
				{
					//System.out.println("matrix is NOT A STRICTLY UPPER TRIANGULAR MATRIX");
					return false;
				}
									
			}
		}
		if(strictlyLowerTriangular)
		{
			//System.out.println("matrix is A STRICTLY LOWER TRIANGULAR MATRIX");
		}
		return true;
	}
	
	public static void display (int x[][] )
	{
		for (int i = 0; i < x.length; i++)
		{
			for(int j = 0; j < x[0].length; j++)
			{
				System.out.print(x[i][j] + " ");
			}
			System.out.println();
		}
		System.out.print("=+=+=+=+=+=+=+=+=+=+= <==");
	}
	
	public static void checker (int y [][])
	{
		if(identityBa(y) == true)
		{
			System.out.println("This is an identity matrix");
			System.out.println();
		}
		else if (zeroBa(y) == true)
		{
			System.out.println("Matrix is a ZERO Matrix");
			System.out.println();
		}
		else if (diagonalBa(y) == true)
		{
			System.out.println("Matrix is a DIAGONAL matrix");
			System.out.println();
		}
		else if (upperTriangularBa(y) == true)
		{
			System.out.println("Matrix is an UPPER TRIANGULAR matrix");
			System.out.println();
		}
		else if(strictlyUpperTriangularBa(y) == true)
		{
			System.out.println("Matrix is a STRICTLY UPPER TRIANGULAR matrix");
			System.out.println();
		}
		else if (lowerTriangularBa(y) == true)
		{
			System.out.println("Matrix is a LOWER TRIANGULAR matrix");
			System.out.println();
		}
		else if(strictlyLowerTriangularBa(y) == true)
		{
			System.out.println("Matrix is a STRICTLY LOWER TRIANGULAR matrix");
			System.out.println();
		}
		else 
		{
			System.out.println("Square Matrix");
		}
	}

	public static void main(String[] args) {
		int [][] A = { 
				{0, 3, 6, 7},
				{0, 0, 5, -1},
				{3, 8, 0, 9},
				{4, -2, 0, 0}
		}; // Non - Special Matrix
		
		int [][] B = {
				{0, 6, 6, -2},
				{0, 0, 7, 9},
				{0, 0, 0, 7},
				{0, 0, 0, 0}
		}; // Strictly Upper - Triangular Matrix
		
		int [][] C = {
				{0, 0, 0},
				{0, 0, 0},
				{0, 0, 0}
		}; // Zero Matrix
		
		int [][] D = {
				{0, 0, 0},
				{1, 0, 0},
				{0, -8, 0}
		}; // Strictly Lower - Triangular Matrix
		
		int [][] E = {
				{1, 0,},
				{0, 1}
		}; // Identity Matrix
		
		// Matrix A
		allRow = A.length;
        allCol = A[0].length;
        for (int rA = 0; rA <= allRow -1; rA++) {
            for (int cA = 0; cA <= allCol - 1; cA++) {
                System.out.print(A[rA][cA] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Matrix A");
	       System.out.println(" ");
	       
		// Matrix B
		 allRow = B.length;
	     allCol = B[0].length;
	       for (int rB = 0; rB <= allRow -1; rB++) {
	            for (int cB = 0; cB <= allCol - 1; cB++) {
	                System.out.print(B[rB][cB] + " ");
	            }
	            System.out.println(" ");
	        }
	       System.out.println("Matrix B");
	       System.out.println(" ");
	       
	     // Matrix C 
	      allRow = C.length;
	      allCol = C[0].length;
	      boolean matrixZero = true;
	        for (int rC = 0; rC <= allRow -1; rC++) {
	            for (int cC = 0; cC <= allCol - 1; cC++) {
	                System.out.print(C[rC][cC] + " ");
	                System.out.println(" ");
		        }
		        System.out.println("Matrix D");
		        System.out.println(" ");
		        
	                
	      // Matrix D
	        allRow = D.length;
		    allCol = D[0].length;
		      for (int rD = 0; rD <= allRow -1; rD++) {
		          for (int cD = 0; cD <= allCol - 1; cD++) {
		              System.out.print(D[rD][cD] + " ");
		            }
		            System.out.println(" ");
		        }
		        System.out.println("Matrix D");
		        System.out.println(" ");
		        
		   // Matrix E
		        allRow = E.length;
			    allCol = E[0].length;
			      for (int rE = 0; rE <= allRow -1; rE++) {
			          for (int cE = 0; cE <= allCol - 1; cE++) {
			              System.out.print(E[rE][cE] + " ");
			            }
			            System.out.println(" ");
			        }
			        System.out.println("Matrix E");
			        System.out.println(" ");
		        
	}


	}

}
