/**
 * 
 */
package au.net.ohalloran.yahap.webapp.model.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * @author sohalloran
 *
 */
public enum LocationEnum {

	
	UNKNOWN("location_itemUnknown"),

	PORCH("location_itemPorch"),

	MRS("location_itemLivingRoom");

	private static final Log LOG = LogFactory.getLog(LocationEnum.class);

	private String key;

	  LocationEnum(String key) {
	    this.key = key;
	  }

	  public String getKey() {
	    return key;
	  }

	  public static LocationEnum getLocation(String key) {
	    for(LocationEnum location:values()) {
	      if (location.getKey().equals(key)) {
	        return location;
	      }
	    }
	    return null;
	  }

}
