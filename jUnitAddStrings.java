package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class jUnitAddStrings {

	@Test
	public void test() {
		
		jUnitFunction juintStr = new jUnitFunction();
		String result = juintStr.addStrings("hel", "lo");
		
		assertEquals ("hello",result);
		
	}

}