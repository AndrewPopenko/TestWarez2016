package modules;

import fp.forevo.manager.TafException;
import modules.maps.MyWindowMap;

public class MyWindow extends MyWindowMap {
	public MyWindow() {
		runApp("res\\FP_AutomationExercises.bat");
		FirstWindow.activate();
	}
	
	public void clickOnBtnRestart() {
		FirstWindow.activate();
		try {
			btnRestart.click();
		} catch (TafException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
