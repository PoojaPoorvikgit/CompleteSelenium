package testngpractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest {
	@Test
public void demo() {
	System.out.println("hi");
}
	@Test //Test method or test annotated method---->Test class
	//Without main method with @Test annotation we can execute the tc.
public void demo1() {
	Reporter.log("Hello");//Instead of syso we use Reporter.log
	//It will print in console only
}
	@Test
public void demo2() {
	Reporter.log("Hello",true);//It will print in console as well as test-output
}
	@Test
public void demo3() {
	Reporter.log("Hello",false);//It will print in console only
}
}
