package general;

import java.io.File;

import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;

import autoitx4java.AutoItX;
import com.jacob.com.LibraryLoader;

public class Kalkulator {
	public Kalkulator() {
		File file 	= new File("C:\\Program Files\\ForProgress\\ForEVO\\drivers", "jacob-1.18-M2-x64.dll");
		System.setProperty(LibraryLoader.JACOB_DLL_PATH, file.getAbsolutePath());
		
		x 			= new AutoItX();
		
		psiBtn3		= new Pattern("res\\btn3.png");
		psiBtnEq	= new Pattern("res\\btnEq.png");
		psiBtnAdd	= new Pattern("res\\btnAdd.png");
		psiMainForm	= new Pattern("res\\allbtn.png");
		
		screen		= new Screen();
	}
	
	public void withSykuli() throws FindFailed {
		App app = App.open("calc.exe");
		//app.focus();
		screen.wait(psiMainForm);
		
		screen.find(psiBtn3).click();
		screen.find(psiBtnAdd).click();
		screen.find(psiBtn3).click();
		screen.find(psiBtnEq).click();
		app.close();
	}
	public void onlyAutoIt() throws InterruptedException {	
		x.run("calc.exe");
		x.winActivate("Kalkulator");
		x.winWaitActive("Kalkulator");
		//Enter 3
		x.controlClick("Kalkulator", "", "133") ;
		Thread.sleep(1000);
		//Enter +
		x.controlClick("Kalkulator", "", "93") ;
		Thread.sleep(1000);
		//Enter 3
		x.controlClick("Kalkulator", "", "133") ;
		Thread.sleep(1000);
		//Enter =
		x.controlClick("Kalkulator", "", "121") ;
		x.winClose("Kalkulator");
	}
	
	AutoItX x;
	
	Pattern psiBtn3;
	Pattern psiBtnEq;
	Pattern psiBtnAdd;
	Pattern psiMainForm;
	
	Screen screen;
}
