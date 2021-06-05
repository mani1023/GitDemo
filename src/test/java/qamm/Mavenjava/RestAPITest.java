package qamm.Mavenjava;

import org.testng.annotations.Test;

public class RestAPITest {
	
	@Test
	public void postBug()
	{
		System.out.println("Bug in JIRA");
		System.out.println("Bug in JIRA1");
		System.out.println("Bug in JIRA3");
	}

	@Test
	public void jira()
	{
		System.out.println("JIRA board");
		
		System.out.println("JIRA board 1");
		
		System.out.println("JIRA board 2");
	}
	
	@Test
	public void qTest() {
		
		System.out.println("Test Case Repository");
	}
	

	@Test(priority =1)
	public void jenkins() {
		
		System.out.println("Automation Test Case Repository");
	}
}

