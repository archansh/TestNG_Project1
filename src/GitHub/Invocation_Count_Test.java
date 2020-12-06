package GitHub;

import org.testng.annotations.Test;

/*invoke(execute) the test case many times,
By invoke keyword we dont need to write same test many times.
Like,In this program we execute sum 10 times.we dont need write 10 times.*/

public class Invocation_Count_Test {

	@Test(invocationCount = 10)
    public void sum() {
		int a=10;
		int b=25;
		int c=a+b;
    	System.out.println("Test Sum:");
    	System.out.println("sum of "+a+" and " +b +" is=="+c);
    }
}
