package au.net.ohalloran.yahap.services.model.beans;

import javax.xml.bind.annotation.XmlElement;

public class Device {
	private String deviceName;
	private String deviceType;
	private String location;
	private String houseCode;
	private String unitCode;
	
	public Device() {
	}

	/**
	 * @return the deviceName
	 */
	@XmlElement(name="deviceName")
	public String getDeviceName() {
		return deviceName;
	}

	/**
	 * @param deviceName the deviceName to set
	 */
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	/**
	 * @return the deviceType
	 */
	@XmlElement(name="deviceType")
	public String getDeviceType() {
		return deviceType;
	}

	/**
	 * @param deviceType the deviceType to set
	 */
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	/**
	 * @return the houseCode
	 */
	@XmlElement(name="houseCode")
	public String getHouseCode() {
		return houseCode;
	}

	/**
	 * @param houseCode the houseCode to set
	 */
	public void setHouseCode(String houseCode) {
		this.houseCode = houseCode;
	}

	/**
	 * @return the location
	 */
	@XmlElement(name="location")
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the unitCode
	 */
	@XmlElement(name="unitCode")
	public String getUnitCode() {
		return unitCode;
	}

	/**
	 * @param unitCode the unitCode to set
	 */
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}
}
