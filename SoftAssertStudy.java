package JavaStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy {

	SoftAssert soft=new SoftAssert();
	@Test
	public void assertsfotstudy()
	{
		String name = "ajayrokade";
		String name1 = "ajay";
		soft.assertEquals(name, name1,"name is matching");
		Reporter.log("name is not  matching ",true);
		soft.assertNotNull(name,"name is null");
		Reporter.log("name is not null",true);
		
		
		
	}
}