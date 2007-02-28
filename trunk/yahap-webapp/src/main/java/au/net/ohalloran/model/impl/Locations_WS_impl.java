package au.net.ohalloran.model.impl;

import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.myfaces.tobago.context.ResourceManager;
import org.apache.myfaces.tobago.context.ResourceManagerFactory;

import au.net.ohalloran.model.IUpdateMap;


public class Locations_WS_impl implements IUpdateMap {

	private LocationEnum locationValue;

	public Locations_WS_impl() {
	    locationValue = LocationEnum.UNKNOWN;
	}
	
	private static final Log LOG = LogFactory.getLog(Locations_WS_impl.class);

	public SelectItem[] getLocationSelectItems(
			ResourceManager resourceManager, String resource) {
		LocationEnum[] locations = LocationEnum.values();
		SelectItem[] items = new SelectItem[locations.length];
		for (int i = 0; i < items.length; i++) {
			String label = resourceManager.getProperty(FacesContext
					.getCurrentInstance().getViewRoot(), resource, locations[i]
					.getKey());
			if (LOG.isTraceEnabled()) {
				LOG.trace("label = " + label + "");
			}
			if (label == null) {
				label = locations[i].getKey();
			}
			items[i] = new SelectItem(locations[i], label);
		}
		return items;
	}

	public SelectItem[] getLocations() {
	    ResourceManager resourceManager = ResourceManagerFactory
	        .getResourceManager(FacesContext.getCurrentInstance());
	    return new Locations_WS_impl().getLocationSelectItems(resourceManager, "webapp");
	}

	public LocationEnum getLocationValue() {
		return locationValue;
	}

	public void setLocationValue(LocationEnum locationValue) {
		this.locationValue = locationValue;
	}

	public void doUpdate() {
		
	}

}
