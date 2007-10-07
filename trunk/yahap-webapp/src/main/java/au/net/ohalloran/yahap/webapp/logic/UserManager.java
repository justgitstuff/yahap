package au.net.ohalloran.yahap.webapp.logic;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;

import au.net.ohalloran.yahap.webapp.model.User;

public class UserManager {

	  private static User guestUser;
	  private static Hashtable users = new Hashtable();

	  static {
	    guestUser = new User("Guest");
	    guestUser.setFullName("Guest");

	    User librarian = new User("librarian");
	    librarian.setLibrarian(true);
	    librarian.setPassword("librarian");
	    librarian.setFullName("John Librarian");
	    users.put("librarian", librarian);

	    User borrower = new User("Borrower");
	    borrower.setBorrower(true);
	    borrower.setPassword("borrower");
	    borrower.setFullName("Jane Borrower");
	    users.put("borrower", borrower);
	  }

	  public static User getGuestUser() {
	    return guestUser;
	  }

	  public static boolean confirmLogin(String username, String password) {
	    if ((username == null) || (password == null)) return false;

	    User theUser = (User) users.get(username);
	    if (theUser == null) return false;
	    return password.equals(theUser.getPassword());
	  }

	  public static User getUser(String username) {
	    return (User) users.get(username);
	  }

}
