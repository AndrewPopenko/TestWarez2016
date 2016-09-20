package modules.maps;

import fp.forevo.manager.MasterScript;
import fp.forevo.manager.TestObjectManager;
import fp.forevo.proxy.*;

/**
 * Class generated automaticaly. Do not edit from text editor. Change it using Test Object Manager.
 * @author Test Object Manager by ForProgress
 * @see www.forprogress.com.pl
 * @since 2016-09-14 20:06:43
 */
public class CommonControlMap extends MasterScript {

	private TestObjectManager tomgr = new TestObjectManager(getProjectPath(this.getClass()), "res/modules/CommonControl/CommonControl.map");

	/**
	 * <b>Description:</b> 
	 */
	protected Window winNew = getWindow(tomgr, "winNew");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> btnNext.PNG<br/>
	 * <b>Offset: </b> 0:0<br/>
	 * <b>Tags: </b><i> </i><br/>
	 * <div style="overflow:visible;width:98px;height:30px;">
	 * <div style="border:1px solid #ff00ff;width:0px;height:0px;margin-top:0px;margin-left:0px;position:absolute;z-index:2"></div>
	 * <div style="background: url('{@docRoot}/../res/modules/CommonControl/btnNext.PNG') no-repeat;width:98px;height:30px;margin-left:0px;margin-top:0px;z-index:1;border:1px solid #0000ff;">
	 * <img style="margin-left:44px;margin-top:10px;position:absolute;z-index:3;" src="{@docRoot}/../res/point.png"></div>
	 * </div>
	 * <br/>
	 */
	protected Button btnNext = getButton(tomgr, winNew, "btnNext");

}
