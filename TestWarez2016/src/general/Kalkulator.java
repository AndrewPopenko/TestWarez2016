package general;

import java.io.File;

import org.sikuli.script.Pattern;

import autoitx4java.AutoItX;
import com.jacob.com.LibraryLoader;

public class Kalkulator {
	public Kalkulator() {
		File file = new File("C:\\Program Files\\ForProgress\\ForEVO\\drivers", "jacob-1.18-M2-x64.dll");
		System.setProperty(LibraryLoader.JACOB_DLL_PATH, file.getAbsolutePath());
		x = new AutoItX();
	}
	
	public void withSykuli() {
		
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
	}
	
	AutoItX x;
	
	Pattern btn3;
	Pattern btnEq;
	Pattern btnPlus;
}
