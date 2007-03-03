package au.net.ohalloran.yahap.services.model.ws;

import javax.xml.ws.Endpoint;



public class DeviceServiceTest {

	  public static void main(String[] args) throws Exception {
		    DeviceService ds = new DeviceService();

		    // create and start a new webservice end point on port 8080

		    // using our WebService, WeatherGetter
		    Endpoint endpoint =
		                    Endpoint.publish("http://localhost:8080/services/weather", ds);

		    // run our web server for 5 minutes by sleeping main thread,
		    // then shutting down web server
		    //
		    // note: if you were to comment out these next two lines of code,
		    // the web server would continue to run till you sent the process the TERM
		    // signal (ctrl-c)
		    Thread.sleep(1000 * 60 * 5); // sleep for 5 minutes

		    // unpublish the web service (and stop the web server)
		    endpoint.stop();
		  }
}
