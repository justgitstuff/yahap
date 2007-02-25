package au.net.ohalloran.model.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public enum DeviceTypeEnum {
	
	LAMP("deviceType_Lamp"),

	MotionSensor("deviceType_MotionSensor"),

	AM466("deviceType_AM466");

	private static final Log LOG = LogFactory.getLog(DeviceTypeEnum.class);

	private String key;

	  DeviceTypeEnum(String key) {
	    this.key = key;
	  }

	  public String getKey() {
	    return key;
	  }

	  public static DeviceTypeEnum getDeviceType(String key) {
	    for(DeviceTypeEnum deviceType:values()) {
	      if (deviceType.getKey().equals(key)) {
	        return deviceType;
	      }
	    }
	    return null;
	  }


}
