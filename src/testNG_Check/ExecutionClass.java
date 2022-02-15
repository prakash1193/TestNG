package testNG_Check;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExecutionClass {

	@BeforeClass
	public void beforeClass() 
	{
		System.out.println("before class");
		System.out.println("before class");
	}
	@BeforeMethod 
	public void beforeMethod() 
	{
		System.out.println("before method");
	}
	
	@Test
	public void test1() 
	{
		System.out.println("test");
	}
}
