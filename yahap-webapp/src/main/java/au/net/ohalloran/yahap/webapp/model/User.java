package au.net.ohalloran.yahap.webapp.model;

public class User {
	  private String username = null;
	  private String password = null;
	  private boolean librarian = false;
	  private boolean borrower = false;
	  private String fullName = null;

	  public User() {

	  }

	  public User(String username) {
	    this.username = username;
	  }

	  public String getUsername() {
	    return username;
	  }

	  public void setUsername(String username) {
	    this.username = username;
	  }

	  public String getPassword() {
	    return password;
	  }

	  public void setPassword(String password) {
	    this.password = password;
	  }

	  public boolean isLibrarian() {
	    return librarian;
	  }

	  public void setLibrarian(boolean librarian) {
	    this.librarian = librarian;
	  }

	  public boolean isBorrower() {
	    return borrower || librarian; // Librarians can borrow
	  }

	  public void setBorrower(boolean borrower) {
	    this.borrower = borrower;
	  }

	  public String getFullName() {
	    return fullName;
	  }

	  public void setFullName(String fullName) {
	    this.fullName = fullName;
	  }

}
