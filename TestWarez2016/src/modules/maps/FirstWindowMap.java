package modules.maps;

import fp.forevo.manager.MasterScript;
import fp.forevo.manager.TestObjectManager;
import fp.forevo.proxy.*;

/**
 * Class generated automaticaly. Do not edit from text editor. Change it using Test Object Manager.
 * @author Test Object Manager by ForProgress
 * @see www.forprogress.com.pl
 * @since 2016-09-14 23:56:39
 */
public class FirstWindowMap extends MasterScript {

	private TestObjectManager tomgr = new TestObjectManager(getProjectPath(this.getClass()), "res/modules/FirstWindow/FirstWindow.map");

	/**
	 * <b>Description:</b> 
	 */
	protected Window FirtsWindow = getWindow(tomgr, "FirtsWindow");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> btn_restart.PNG<br/>
	 * <b>Similarity:</b> 0.8<br/>
	 * <b>Offset: </b> 0:0<br/>
	 * <b>Tags: </b><i> </i><br/>
	 * <div style="overflow:visible;width:46px;height:23px;">
	 * <div style="border:1px solid #ff00ff;width:0px;height:0px;margin-top:0px;margin-left:0px;position:absolute;z-index:2"></div>
	 * <div style="background: url('{@docRoot}/../res/modules/FirstWindow/btn_restart.PNG') no-repeat;width:46px;height:23px;margin-left:0px;margin-top:0px;z-index:1;border:1px solid #0000ff;">
	 * <img style="margin-left:18px;margin-top:6px;position:absolute;z-index:3;" src="{@docRoot}/../res/point.png"></div>
	 * </div>
	 * <br/>
	 */
	protected Button btnRestart = getButton(tomgr, FirtsWindow, "btnRestart");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Image<br/>
	 * <br/>
	 * <b>File:</b> red_square.PNG<br/>
	 * <b>Similarity:</b> 0.99<br/>
	 * <b>Offset: </b> 0:0<br/>
	 * <b>Tags: </b><i> </i><br/>
	 * <div style="overflow:visible;width:57px;height:58px;">
	 * <div style="border:1px solid #ff00ff;width:0px;height:0px;margin-top:0px;margin-left:0px;position:absolute;z-index:2"></div>
	 * <div style="background: url('{@docRoot}/../res/modules/FirstWindow/red_square.PNG') no-repeat;width:57px;height:58px;margin-left:0px;margin-top:0px;z-index:1;border:1px solid #0000ff;">
	 * <img style="margin-left:23px;margin-top:24px;position:absolute;z-index:3;" src="{@docRoot}/../res/point.png"></div>
	 * </div>
	 * <br/>
	 */
	protected Image redSquare = getImage(tomgr, FirtsWindow, "redSquare");

}
