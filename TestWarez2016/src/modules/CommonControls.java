package modules;

import fp.forevo.manager.MasterScript;
import fp.forevo.manager.TafException;
import modules.maps.CommonControlsMap;

public class CommonControls extends CommonControlsMap {
	public CommonControls() {
		runApp("res\\FP_AutomationExercises.bat");
	}
	
	public void clickNext() throws TafException {
		btnNext.click();
	}
}
