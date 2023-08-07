package frameworkTraining;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearningDataProvider {
@Test(dataProvider="loginData")
public void loginTest(String rowValue,String colValue)
{
	
System.out.println(rowValue);
System.out.println(colValue);
}
@DataProvider(name="loginData")
public String[][] testData()
{
	String[][] data=new String[2][2];
	data[0][0]="tom";
	data[0][1]="jerry";
	data[1][0]="cat";
	data[1][1]="dog";
	return data;
}


}
