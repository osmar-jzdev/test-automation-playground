package playgrounds;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondTest {

    @BeforeTest
    public void beforeTest(){ System.out.println("$$ BEFORE TEST SECOND TEST 2 $$"); }


    @Test(groups = {"playground1"})
    public void testMethod1() { System.out.println("$$ SECOND TEST METHOD 1 $$"); }

    @Test(priority = 1)
    public void testMethod2() { System.out.println("$$ SECOND TEST METHOD 2 $$"); }

    @Test(priority = 2)
    public void testMethod3() { System.out.println("$$ SECOND TEST METHOD 3 $$"); }


    @AfterTest
    public void afterTest(){ System.out.println("$$ AFTER TEST SECOND TEST 2 $$\n--\t\t--\n"); }

}
