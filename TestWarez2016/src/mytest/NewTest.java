package mytest;

import org.testng.annotations.Test;

import fp.forevo.manager.MasterScript;
import modules.CommonControls;
import modules.FirstWindow;
import modules.MyWindow;

import org.testng.annotations.BeforeClass;
import org.sikuli.script.FindFailed;
import org.testng.annotations.AfterClass;

public class NewTest {
  @Test
  public void f() throws FindFailed {
	  
	  FirstWindow fw = new FirstWindow();
  }
  @BeforeClass
  public void beforeClass() {
	  controls = new CommonControls();
  }

  @AfterClass
  public void afterClass() {
  }
  
  private CommonControls controls;
}
