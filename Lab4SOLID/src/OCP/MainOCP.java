package OCP;

public class MainOCP {

	public static void main(String[] args) {
		String log = "User1";
		
		String pass ="pass";
		AuthService as = new AuthService();
		
		as.signIn(new Apple(), log, pass);
		as.signIn(new Google(), log, pass);
		as.signIn(new Twitter(), log, pass);
		

	}

}
