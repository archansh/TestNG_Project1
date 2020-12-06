package GitHub;

import org.testng.annotations.Test;

public class Exception_Time_Out_test {
	
 /*@Test
    public void infinite_loop_test(){
 		int i=1;
		while(i==1)
		System.out.println("I LOVE YOU");
	}*/
	@Test(timeOut = 2000)
	public void infinite_loop_test(){
	 	int i=1;
	 	while(i==1)
		System.out.println("I LOVE YOU");
	}

}
