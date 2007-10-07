package au.net.ohalloran.yahap.webapp.ui;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;

import au.net.ohalloran.yahap.webapp.model.DeviceList;
import au.net.ohalloran.yahap.webapp.session.UserSession;

public class YahapBaseAction extends Action {
	  protected DeviceList getLibrary() {
		    return (DeviceList) servlet.getServletContext().getAttribute(
		        WebGlobals.LIBRARY_KEY);
		  }

		  /**
		   * Return the UserSession from the session.
		   * 
		   * @param request
		   * @return the UserSession
		   * @throws RuntimeException
		   */
		  protected UserSession getUserSession(HttpServletRequest request) {
		    HttpSession session = (HttpSession) request.getSession();
		    if (session == null) {
		      throw new RuntimeException("Couldn't get a reference to the Session");
		    }
		    UserSession userSession = (UserSession) session.getAttribute(WebGlobals.USER_SESSION_KEY);
		    if (userSession == null) {
		      throw new RuntimeException("Couldn't retrieve UserSession attribute from Session");
		    }
		    return userSession;
		  }
	
}
