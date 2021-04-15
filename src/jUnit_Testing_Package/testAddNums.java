package jUnit_Testing_Package;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNums {

	@Test
	public void test() {
		jUnit_Function junit = new jUnit_Function();
		int ans = junit.AddNums(100, 300);
		assertEquals (400, ans);
	}

}
