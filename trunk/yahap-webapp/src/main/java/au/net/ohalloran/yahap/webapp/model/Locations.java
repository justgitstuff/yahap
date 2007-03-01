package au.net.ohalloran.yahap.webapp.model;

import au.net.ohalloran.yahap.webapp.model.impl.Locations_WS_impl;

public class Locations extends BaseMap {

	
	private static final long serialVersionUID = 6946842150287545294L;

	/**
	 * 
	 */
	public Locations() {
		updateMap = new Locations_WS_impl();
	}
	
}
