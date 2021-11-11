package src.main.java;

import org.junit.Test;

import junit.framework.Assert;

public class Main {

	
	@Test
	public void mainTest(){
		Response response = RestAssured.get("http://rest-api.upskills.in/doc/admin/");
		int code = response.getStatusCode();
		System.out.println("Status code" + code);
		Assert.assertEquals(code, 200);
		
	}
}
