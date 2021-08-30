import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class NewTestNG {
  @Test
  public void f() {
	  System.out.println("test1");
  }
  @BeforeMethod
  public void beforeTest() {
	  System.out.println("Before test1");
  }

  @AfterMethod
  public void afterTest() {
	  System.out.println("After test1");
  }

}
