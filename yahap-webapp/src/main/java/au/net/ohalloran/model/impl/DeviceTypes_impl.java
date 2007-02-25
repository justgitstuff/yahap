package au.net.ohalloran.model.impl;

import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.myfaces.tobago.context.ResourceManager;
import org.apache.myfaces.tobago.context.ResourceManagerFactory;

import au.net.ohalloran.model.DeviceTypes;

public class DeviceTypes_impl implements DeviceTypes  {
	private DeviceTypeEnum deviceTypeValue;

	public DeviceTypes_impl() {
		deviceTypeValue = DeviceTypeEnum.LAMP;
	}
	
	private static final Log LOG = LogFactory.getLog(DeviceTypes_impl.class);

	public SelectItem[] getDeviceTypesSelectItems(
			ResourceManager resourceManager, String resource) {
		DeviceTypeEnum[] deviceTypes = DeviceTypeEnum.values();
		SelectItem[] items = new SelectItem[deviceTypes.length];
		for (int i = 0; i < items.length; i++) {
			String label = resourceManager.getProperty(FacesContext
					.getCurrentInstance().getViewRoot(), resource, deviceTypes[i]
					.getKey());
			if (LOG.isTraceEnabled()) {
				LOG.trace("label = " + label + "");
			}
			if (label == null) {
				label = deviceTypes[i].getKey();
			}
			items[i] = new SelectItem(deviceTypes[i], label);
		}
		return items;
	}

	public SelectItem[] getDeviceTypes() {
	    ResourceManager resourceManager = ResourceManagerFactory
	        .getResourceManager(FacesContext.getCurrentInstance());
	    return new DeviceTypes_impl().getDeviceTypesSelectItems(resourceManager, "webapp");
	}

	public DeviceTypeEnum getLocationValue() {
		return deviceTypeValue;
	}

	public void setDeviceTypeValue(DeviceTypeEnum deviceTypeValue) {
		this.deviceTypeValue = deviceTypeValue;
	}

}
