package pac;

import org.testng.annotations.Test;

public class CreateContact {
	@Test
	public void test()
	{
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser");
		System.out.println(URL);
		System.out.println(BROWSER);
	}

}
