package GitHub;

import org.testng.annotations.Test;

public class Dependency_over_method {

	@Test()
    public void test1() {
    	System.out.println("Test1");
    	int i=1/0;
    	System.out.println(i);
    }
    
    @Test(dependsOnMethods = "test1")
    public void test2() {
    	System.out.println("Test2");
    }
    
    @Test(dependsOnMethods = "test1")
    	public void test3() {
       	System.out.println("Test3");
    }

    
    /*
       @Test(priority = 2)
    public void test1() {
    	System.out.println("Test1");
    	int i=1/0;
    	System.out.println(i);
    }
    
    @Test(priority = 1,dependsOnMethods = "test1")
    public void test2() {
    	System.out.println("Test2");
    }
    
    @Test(priority = 3,dependsOnMethods = "test1")
    	public void test3() {
       	System.out.println("Test3");
    }
     */
}
