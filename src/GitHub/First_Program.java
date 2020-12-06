package GitHub;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class First_Program {
	WebDriver driver;
	@BeforeTest
    public void setup() {
        System.out.println("I am in before test");
    }
  @BeforeClass
    public void launch_URL(){
        System.out.println("I am in before class");
    }
	  @Test(priority=1)
	    public void test4(){
	        System.out.println("I am in test 4");
	    }
	  @Test(priority=2)
	    public void test3(){
	        System.out.println("I am in test 3");
	    }
	  @Test(priority=3)
	    public void test2(){
	        System.out.println("I am in test 2");
	    }
	  @Test(priority=4)
	    public void test1(){
		  
	        System.out.println("I am in test 1");
	    }
	  @BeforeMethod
	    public void abc(){
	        System.out.println("I am in before method");
	    }
	  @AfterMethod
	    public void xyz(){
	        System.out.println("I am in after method");
	    }


	  @AfterClass
	    public void z_logout(){
	        System.out.println("I am in after class");

	    }
	  @AfterTest
	    public void close_URL(){
	       System.out.println("I am after test");
	    }
}
