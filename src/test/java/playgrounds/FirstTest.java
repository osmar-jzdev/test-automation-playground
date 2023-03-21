package playgrounds;

import org.testng.annotations.*;

public class FirstTest {

    @BeforeSuite
    public void beforeSuite(){ System.out.println("$$ BEFORE SUITE FIRST TEST 1 $$\n"); }

    @BeforeClass
    public void beforeClass() { System.out.println("$$ BEFORE CLASS FIRST TEST 1 $$"); }


    @BeforeMethod
    public void beforeMethod(){ System.out.println("$$ BEFORE METHOD FIRST TEST 1 $$"); }

    @BeforeGroups("playground1")
    public void beforeGroups() { System.out.println("$$ BEFORE GROUPS FIRST TEST 1 $$"); }


    @Test(priority = 2, groups = {"playground1"})
    public void testMethod1() { System.out.println("$$ FIRST TEST METHOD 1 $$"); }

    @Test(priority = -1)
    public void testMethod2() { System.out.println("$$ FIRST TEST METHOD 2 $$"); }

    @Test(priority = 1)
    public void testMethod3() { System.out.println("$$ FIRST TEST METHOD 3 $$"); }


    @AfterSuite
    public void afterSuite(){
        System.out.println("\n$$ AFTER SUITE FIRST TEST 1 $$");
    }

    @AfterClass
    public void afterClass() { System.out.println("$$ AFTER CLASS FIRST TEST 1 $$"); }

    @AfterTest
    public void afterTest(){ System.out.println("$$ AFTER TEST FIRST TEST 1 $$\n--\t\t--\n"); }

    @AfterMethod
    public void afterMethod(){ System.out.println("$$ AFTER METHOD FIRST TEST 1 $$"); }

    @AfterGroups("playground1")
    public void afterGroups() { System.out.println("$$ AFTER GROUPS FIRST TEST 1 $$"); }

    @BeforeTest
    public void beforeTest(){ System.out.println("$$ BEFORE TEST FIRST TEST 1 $$"); }
}