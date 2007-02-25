package au.net.ohalloran.model;

import javax.faces.model.SelectItem;

import org.apache.myfaces.tobago.context.ResourceManager;

public interface Locations {

	public abstract SelectItem[] getLocationSelectItems(
			ResourceManager resourceManager, String resource);

}
