package au.net.ohalloran.model;

import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.myfaces.tobago.context.ResourceManager;
import org.apache.myfaces.tobago.context.ResourceManagerFactory;

public class Locations {

	  private static final Log LOG = LogFactory.getLog(Locations.class);
	
	  public static SelectItem[] getLocationSelectItems(ResourceManager resourceManager, String resource) {
		    LocationEnum[] locations = LocationEnum.values();
		    SelectItem[] items = new SelectItem[locations.length];
		    for (int i = 0; i < items.length; i++) {
		      String label = resourceManager.getProperty(
		          FacesContext.getCurrentInstance().getViewRoot(), resource, locations[i].getKey());
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


}
