package au.net.ohalloran.backing;

import javax.faces.event.ActionEvent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import au.net.ohalloran.model.Locations;

public class AddDevice {

	  private static final Log LOG = LogFactory.getLog(AddDevice.class);

	private String deviceName="";

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	
    public void click(ActionEvent actionEvent) {
    	if (LOG.isDebugEnabled()){LOG.debug("add device button clicked");}
        actionEvent.getComponent().getId();
      }

}
