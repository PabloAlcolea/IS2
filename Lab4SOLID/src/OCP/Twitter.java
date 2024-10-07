package OCP;

public class Twitter implements SignInSystem{

	@Override
	public boolean signIn(String log, String pass) {
		System.out.println("Has sido logeado via Twitter");
		return true;
	}
	
	

}
