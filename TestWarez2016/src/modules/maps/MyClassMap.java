package modules.maps;

import fp.forevo.manager.MasterScript;
import fp.forevo.manager.TestObjectManager;
import fp.forevo.proxy.*;

/**
 * Class generated automaticaly. Do not edit from text editor. Change it using Test Object Manager.
 * @author Test Object Manager by ForProgress
 * @see www.forprogress.com.pl
 * @since 2016-09-12 23:30:26
 */
public class MyClassMap extends MasterScript {

	private TestObjectManager tomgr = new TestObjectManager(getProjectPath(this.getClass()), "res/modules/MyClass/MyClass.map");

	/**
	 * <b>Description:</b> 
	 */
	protected Window winNew = getWindow(tomgr, "winNew");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 */
	protected Button btnNew = getButton(tomgr, winNew, "btnNew");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> TextBox<br/>
	 */
	protected TextBox txtNew = getTextBox(tomgr, winNew, "txtNew");

}
