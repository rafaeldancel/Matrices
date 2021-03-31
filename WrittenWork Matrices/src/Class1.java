//WRITTEN WORK MATRICES
// Rafael Dancel
import java.util.Scanner;
public class Class1 {
	
	public static int allRow;
	public static int allCol;
	
	public static void checkZero (int zero[][]) {
		boolean zeroBool = true;
		for(int x = 0; x < zero.length; x++) {
			for(int y = 0; y < zero[0].length; y++) {
				if(x == y && zero[x][y] != 0) {
					zeroBool = false;
					
				}
				if(x == y && zero[x][y] != 0) {
					zeroBool = false;
					
				}
			}
		}
		if(zeroBool)
			System.out.println("Given matrix is a ZERO MATRIX.");
		else
			System.out.println("Given matrix is NOT a ZERO MATRIX.");
	}
	
	public static void checkDiagonal (int diagonal[][]) {
		boolean diagonalBool = true;
		for(int x = 0; x < diagonal.length; x++) {
			for(int y = 0; y < diagonal[0].length; y++) {
				if(x == y && diagonal[x][y] < 0) {
					diagonalBool = false;
				}
				if(x != y && diagonal[x][y] < 0) {
					diagonalBool = false;
				}
			}
		}
		if(diagonalBool)
			System.out.println("Given matrix is a DIAGONAL MATRIX.");
		else
			System.out.println("Given matrix is NOT a DIAGONAL MATRIX.");
	} 
	
	public static void checkIdentity (int identity[][]) {
		boolean identityBool = true;    
            for(int i = 0; i < identity.length; i++){    
                for(int j = 0; j < identity[0].length; j++){    
                  if(i == j && identity[i][j] != 1){    
                      identityBool = false;    
                  }    
                  if(i != j && identity[i][j] != 0){    
                      identityBool = true;    
                  }    
                }    
            }    
                
            if(identityBool)    
                System.out.println("Given matrix is an IDENTITY MATRIX");    
            else    
                System.out.println("Given matrix is NOT an IDENTITY MATRIX");    
        }    
	
	public static void checkUpperTriangular (int upperTriangular[][]) {
		boolean upperTriangularBool = true;
		for(int x = 0; x < upperTriangular.length; x++) {
			for(int y = 0; y < upperTriangular[0].length; y++) {
				if(x == y && upperTriangular[x][y] != 0) {
					upperTriangularBool = false;
				}
				if(x != y && upperTriangular[x][y] > 0) {
					upperTriangularBool = false;
				}
			}
		}
		if(upperTriangularBool)
			System.out.println("Given matrix is an UPPER - TRIANGULAR MATRIX.");
		else
			System.out.println("Given matrix is NOT an UPPER - TRIANGULAR MATRIX.");
	} 
	
	public static void checkStrictlyUpperTriangular (int strictlyUpperTriangular[][]) {
		boolean strictlyUpperTriangularBool = true;
		for(int x = 0; x < strictlyUpperTriangular.length; x++) {
			for(int y = 0; y < strictlyUpperTriangular[0].length; y++) {
				if(x == y && strictlyUpperTriangular[x][y] != 0) {
					strictlyUpperTriangularBool = false;
				}
				if(x != y && strictlyUpperTriangular[x][y] != 0) {
					strictlyUpperTriangularBool = false;
				}
			}
		}
		if(strictlyUpperTriangularBool)
			System.out.println("Given matrix is a STRICTLY UPPER - TRIANGULAR MATRIX.");
		else
			System.out.println("Given matrix is a STRICTLY UPPER - TRIANGULAR MATRIX.");
	} 
	
	public static void checkLowerTriangular (int lowerTriangular[][]) {
		boolean lowerTriangularBool = true;
		for(int x = 0; x < lowerTriangular.length; x++) {
			for(int y = 0; y < lowerTriangular[0].length; y++) {
				if(x == y && lowerTriangular[x][y] != 0) {
					lowerTriangularBool = false;
				}
				if(x != y && lowerTriangular[x][y] > 0) {
					lowerTriangularBool = false;
				}
			}
		}
		if(lowerTriangularBool)
			System.out.println("Given matrix is a LOWER - TRIANGULAR MATRIX.");
		else
			System.out.println("Given matrix is NOT a LOWER - TRIANGULAR MATRIX.");
	} 
	
	public static void checkStrictlyLowerTriangular (int strictlyLowerTriangular[][]) {
		boolean strictlyLowerTriangularBool = true;
		for(int x = 0; x < strictlyLowerTriangular.length; x++) {
			for(int y = 0; y < strictlyLowerTriangular[0].length; y++) {
				if(x == y && strictlyLowerTriangular[x][y] != 0) {
					strictlyLowerTriangularBool = false;
				}
				if(x != y && strictlyLowerTriangular[x][y] != 0) {
					strictlyLowerTriangularBool = false;
				}
			}
		}
		if(strictlyLowerTriangularBool)
			System.out.println("Given matrix is a STRICTLY LOWER - TRIANGULAR MATRIX.");
		else
			System.out.println("Given matrix is a STRICTLY LOWER - TRIANGULAR MATRIX.");
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
        System.out.println("------------------------- ");
        System.out.println("Matrix A");
        System.out.println("------------------------- ");
        checkZero(A);
        checkDiagonal(A);
        checkIdentity(A);
        checkUpperTriangular(A);
        checkStrictlyUpperTriangular(A);
        checkLowerTriangular(A);
        checkStrictlyLowerTriangular(A);
        System.out.println("Matrix A is NOT a SPECIAL SQUARE MATRIX.");
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
	       System.out.println("------------------------- ");
	       System.out.println("Matrix B");
	       System.out.println("------------------------- ");
	       checkStrictlyUpperTriangular(B);
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
	            System.out.println("------------------------- ");
		        System.out.println("Matrix C");
		        System.out.println("------------------------- ");
		        checkZero(C);
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
		      System.out.println("------------------------- ");
		        System.out.println("Matrix D");
		        System.out.println("------------------------- ");
		        checkStrictlyLowerTriangular(D);
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
			        System.out.println("------------------------- ");
			        System.out.println("Matrix E");
			        System.out.println("------------------------- ");
			        checkIdentity(E);
			        System.out.println(" ");
		        }
	        	
}
}
