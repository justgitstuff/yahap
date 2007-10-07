package au.net.ohalloran.yahap.webapp.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeviceList {
	  private Map<String, Device> devices = new HashMap<String, Device>(); // use a hashtable for synchronization

	  public DeviceList() {
	  }

	  public List<Device> getDeviceList() {
	    return new ArrayList<Device>(devices.values());
	  }

	  public Map<String, Device> getBooks() {
	    return devices;
	  }

	  public void addBook(Device device) {
	    if (device != null) devices.put(device.getDeviceId(), device);
	  }

}
