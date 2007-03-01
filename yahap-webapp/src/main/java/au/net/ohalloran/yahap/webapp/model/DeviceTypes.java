package au.net.ohalloran.yahap.webapp.model;

import au.net.ohalloran.yahap.webapp.model.impl.DeviceTypes_WS_impl;
/**
 * 
 * Session bean that contains map of devices
 * used.
 * 
 * @author sohalloran
 *
 */
public class DeviceTypes extends BaseMap {

	/**
	 * generated serial version uid
	 */
	private static final long serialVersionUID = -3793876944484465758L;

	/**
	 * default constructor:
	 * set the hashmap update implementation
	 * in the constructor
	 *
	 */
	public DeviceTypes() {
		updateMap = new DeviceTypes_WS_impl();
	}

}
