package jUnit_Testing_Package;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddstrings {

	@Test
	public void test() {
		jUnit_Function junit_str = new jUnit_Function();
		String ans = junit_str.Addstrings("capstone", "project");
		assertEquals("capstoneproject", ans);
	}

}
