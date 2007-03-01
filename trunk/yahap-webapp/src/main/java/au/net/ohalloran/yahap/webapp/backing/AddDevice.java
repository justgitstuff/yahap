package au.net.ohalloran.yahap.webapp.backing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import au.net.ohalloran.yahap.webapp.model.impl.DeviceTypeEnum;

public class AddDevice {

	private static final Log LOG = LogFactory.getLog(AddDevice.class);

	private String locationValue="";
	private String deviceName="";
	private String houseCode="";
	private String unitCode="";
	private String deviceType="";

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public String getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public String getHouseCode() {
		return houseCode;
	}
	public void setHouseCode(String houseCode) {
		this.houseCode = houseCode;
	}
	public String getUnitCode() {
		return unitCode;
	}
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}
	public String getLocationValue() {
		return locationValue;
	}
	public void setLocationValue(String locationValue) {
		this.locationValue = locationValue;
	}

	public String addDevice() {
		// This method would call a database or other service and add the
		// confirmed user information.
		System.out.println("Adding device");
		return "success";
	}
}
