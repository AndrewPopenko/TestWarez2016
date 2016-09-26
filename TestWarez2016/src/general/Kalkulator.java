package general;

import java.io.File;

import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import autoitx4java.AutoItX;
import com.jacob.com.LibraryLoader;

public class Kalkulator {
	public Kalkulator() {
		System.out.print("============== do tego testu wykorzystamy ");
	}
	
	public void withSikuli() throws FindFailed {
		System.out.println("Sikuli ===============");
		
		//przycisk - 3
		Pattern psiBtn3		= new Pattern("res\\btn3.png");
		//przycisk równoœci
		Pattern psiBtnEq	= new Pattern("res\\btnEq.png");
		//przycisk - dodaæ
		Pattern psiBtnAdd	= new Pattern("res\\btnAdd.png");
		//czêœæ okna z przyciskami
		Pattern psiMainForm	= new Pattern("res\\allbtn.png");
		
		//ekran
		Screen screen 		= new Screen();
		
		App app 			= App.open("calc.exe");

		//czekamy na kalkulator
		screen.wait(psiMainForm);
		
		screen.find(psiBtn3).click();
		screen.find(psiBtnAdd).click();
		screen.find(psiBtn3).click();
		screen.find(psiBtnEq).click();
		app.close();
		
		System.out.println("========================= koniec testu =========================");
	}
	
	public void withAutoIt() throws InterruptedException {
		System.out.println("AutoIt ===============");
		File file = new File("C:\\Program Files\\ForProgress\\ForEVO\\drivers", "jacob-1.18-M2-x64.dll");
		System.setProperty(LibraryLoader.JACOB_DLL_PATH, file.getAbsolutePath());
		AutoItX app = new AutoItX();
		
		app.run("calc.exe");
		app.winActivate("Kalkulator");
		app.winWaitActive("Kalkulator");
		//Enter 3
		app.controlClick("Kalkulator", "", "133") ;
		System.out.println("klikn¹³em na przycisk 3");
		Thread.sleep(1000);
		//Enter +
		app.controlClick("Kalkulator", "", "93") ;
		System.out.println("klikn¹³em na przycisk dodaæ");
		Thread.sleep(1000);
		//Enter 3
		app.controlClick("Kalkulator", "", "133") ;
		System.out.println("klikn¹³em na przycisk 3");
		Thread.sleep(1000);
		//Enter =
		app.controlClick("Kalkulator", "", "121") ;
		System.out.println("klikn¹³em na przycisk równoœci");
		app.winClose("Kalkulator");
		
		System.out.println("========================= koniec testu =========================");
	}
	
	public void mix() throws FindFailed {
		System.out.println("AutoIt + Sikuli ======");
		File file = new File("C:\\Program Files\\ForProgress\\ForEVO\\drivers", "jacob-1.18-M2-x64.dll");
		System.setProperty(LibraryLoader.JACOB_DLL_PATH, file.getAbsolutePath());
		AutoItX app = new AutoItX();
		
		app.run("calc.exe");
		app.winActivate("Kalkulator");
		app.winWaitActive("Kalkulator");
		
		//przycisk - 3
		Pattern psiBtn3		= new Pattern("res\\btn3.png");
		//przycisk równoœci
		Pattern psiBtnEq	= new Pattern("res\\btnEq.png");
		//przycisk - dodaæ
		Pattern psiBtnAdd	= new Pattern("res\\btnAdd.png");
		//czêœæ okna z przyciskami
		Pattern psiMainForm	= new Pattern("res\\allbtn.png");

		//ekran
		Screen screen 		= new Screen();

		//czekamy na kalkulator
		screen.wait(psiMainForm);

		screen.find(psiBtn3).click();
		screen.find(psiBtnAdd).click();
		screen.find(psiBtn3).click();
		screen.find(psiBtnEq).click();
		
		app.winClose("Kalkulator");
		
		System.out.println("========================= koniec testu =========================");
	}
}
