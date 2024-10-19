package ISP;

public class GmailAccount {
	String name,emailAddress;
	
	public GmailAccount(String name,String emailAddress) {
		this.name = name;
		this.emailAddress = emailAddress;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public String getName() {
		return name;
	}
}
