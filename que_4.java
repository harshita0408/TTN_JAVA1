package Java3;
import java.util.*;
public class que_4 {

	public que_4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Create a two dimensional array of integers and display:

			sum of all elements of each column
			sum of all elements of each row*/
		Scanner scn = new Scanner(System.in);
		System.out.println("enter no of rows of 1st array");
		int n = scn.nextInt();
		System.out.println("enter no of column of 1st array");
		int m= scn.nextInt();
		int [][] a = new int[n][m];
		System.out.println("Enter 1st array elements");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
			a[i][j]=scn.nextInt();
		}
			
		}
		
		for(int i=0;i<n;i++) 
		{
		int ans_row=0;
		for(int j=0;j<m;j++) 
		{
		  ans_row= ans_row +a[i][j];
		}
		System.out.println("sum of "+ (i+1)+ " row is:"+ ans_row);
		}
		//sum of element of all columns
		for(int i=0;i<m;i++) {
			int ans_col=0;
			for(int j=0;j<n;j++) {
			    ans_col= ans_col+a[j][i];
				
			}
			System.out.println("sum of"+(i+1)+ " column is" + ans_col);
		}
		
	}

}
