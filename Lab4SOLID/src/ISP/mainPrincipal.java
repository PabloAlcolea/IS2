package ISP;

public class mainPrincipal {

	public static void main(String[] args) {
			
		GmailAccount g = new GmailAccount("Jorge", "j01@gmail.com");
		EmailSender.sendEmail(g,"hola");
		

	}

}
