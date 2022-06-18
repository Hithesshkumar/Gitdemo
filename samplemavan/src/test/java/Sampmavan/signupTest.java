package Sampmavan;

import org.testng.annotations.Test;

public class signupTest {

	@Test(groups= {"smoke"})
	public void loginnamevalid()
	{
		System.out.println("loginnamevalidationTc");
	}
	@Test(groups= {"smoke"})
	public void validatemobliefield()
	{
		System.out.println("mobliefieldvalidationTc");
	}
	@Test(groups = {"Regression"})
	public void validateNegativefield()
	{
		System.out.println("NegativefieldvalidationTc");
	}
	@Test(groups = {"Regression"})
	public void validatepositivefield()
	{
		System.out.println("positivefieldvalidationTc");
	}
	
}
