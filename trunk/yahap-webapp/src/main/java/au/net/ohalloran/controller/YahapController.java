package au.net.ohalloran.controller;

import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.myfaces.tobago.context.ResourceManager;
import org.apache.myfaces.tobago.context.ResourceManagerFactory;

import au.net.ohalloran.model.LocationEnum;
import au.net.ohalloran.model.Locations;

public class YahapController {

	private static final Log LOG = LogFactory.getLog(YahapController.class);

	private LocationEnum locationValue;
	
	public YahapController() {
	    locationValue = LocationEnum.UNKNOWN;
	}

	public SelectItem[] getLocations() {
	    ResourceManager resourceManager = ResourceManagerFactory
	        .getResourceManager(FacesContext.getCurrentInstance());
	    return Locations.getLocationSelectItems(resourceManager, "webapp");
	}

	public LocationEnum getLocationValue() {
		return locationValue;
	}

	public void setLocationValue(LocationEnum locationValue) {
		this.locationValue = locationValue;
	}

	
}
