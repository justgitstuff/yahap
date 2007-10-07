package au.net.ohalloran.yahap.webapp.session;

import au.net.ohalloran.yahap.webapp.logic.UserManager;
import au.net.ohalloran.yahap.webapp.model.User;

public class UserSession {
	  private User currentUser = null;

	  public UserSession() {
	    currentUser = UserManager.getGuestUser();
	  }

	  public User getCurrentUser() {
	    return currentUser;
	  }

	  public void setCurrentUser(User currentUser) {
	    this.currentUser = currentUser;
	  }

	  public boolean isLoggedIn() {
	    if (currentUser == null) return false;
	    if (currentUser == UserManager.getGuestUser()) return false;
	    return true;
	  }

	  public void logout() {
	    currentUser = UserManager.getGuestUser();
	  }


}
