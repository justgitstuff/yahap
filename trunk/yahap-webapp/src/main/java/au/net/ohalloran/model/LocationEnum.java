/**
 * 
 */
package au.net.ohalloran.model;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * @author sohalloran
 *
 */
public enum LocationEnum {

	
	UNKNOWN("location_itemUnknown"),

	PORCH("location_itemUnknown"),

	MRS("basic_itemMrs");

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
