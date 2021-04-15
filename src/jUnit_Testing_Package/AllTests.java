package jUnit_Testing_Package;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ testAddNums.class, testAddstrings.class })
public class AllTests {

}
