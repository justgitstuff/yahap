package au.net.ohalloran.model;

import java.util.HashMap;

public abstract class BaseMap extends HashMap<String, String> {
	
	IUpdateMap updateMap;
	
	public void doUpdate() {
		updateMap.doUpdate();
	}
	
}
