package au.net.ohalloran.yahap.services.model.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import au.net.ohalloran.yahap.services.model.ws.beans.Device;



@WebService(name="DeviceService")
public class DeviceService {

	@WebMethod
	public @WebResult(name="deviceId") int addDevice(@WebParam(name="device") Device device) {
		return 0;
	}
}
