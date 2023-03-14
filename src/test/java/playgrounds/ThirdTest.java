package playgrounds;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ThirdTest {

    @BeforeMethod
    public void beforeMethod(){ System.out.println("$$ BEFORE METHOD THIRD TEST 3 $$"); }

    @BeforeMethod
    public void beforeMethod2(){ System.out.println("$$ BEFORE METHOD 2 THIRD TEST 3 $$"); }

    @Test(groups = {"playground1"})
    public void testMethod1() {
        System.out.println("$$ THIRD TEST METHOD 1 $$");
    }

    @Test(priority = -1)
    public void testMethod2() {
        System.out.println("$$ THIRD TEST METHOD 2 $$");
    }

    @AfterMethod
    public void afterMethod(){ System.out.println("$$ AFTER METHOD THIRD TEST 3 $$"); }

    @AfterMethod
    public void afterMethod2(){ System.out.println("$$ AFTER METHOD 2 THIRD TEST 3 $$"); }
}
