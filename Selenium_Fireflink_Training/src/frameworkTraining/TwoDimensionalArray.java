package frameworkTraining;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		
	{
		
			Object[][]objarr=new Object[4][1];
			objarr[0][0]="1";
			objarr[1][0]="2";
			objarr[2][0]="3";
			objarr[3][0]="4";
	        
	        for(int i=0;i<=objarr.length;i++)
	        
	        	for(int j=0;j<=objarr.length;j++)
	        	{
	        		System.out.println(objarr[i][j]);
	        	}
	}
	
	}
	
}