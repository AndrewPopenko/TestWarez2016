package modules;

import modules.maps.FirstWindowMap;

import java.util.Iterator;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;

public class FirstWindow extends FirstWindowMap {
	public FirstWindow() throws FindFailed {
		
		Region rgn = btnRestart.getRegion();
		rgn = btnRestart.getRegion();
		rgn = rgn.below(250);
		rgn.setW(250);
		Pattern pt = new Pattern("res\\red_square.png");
		pt.similar((float) 0.99);
		//rgn.find(pt).click();
		Iterator<Match> matches;
		//matches = redSquare.
		matches = rgn.findAll(pt);
		
		while(matches.hasNext())
			matches.next().click();
	}
}
