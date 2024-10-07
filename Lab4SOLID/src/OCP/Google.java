package OCP;

public class Google implements SignInSystem{

	@Override
	public boolean signIn(String log, String pass) {
		System.out.println("Has sido logeado via Google");
		return true;
	}
	
	

}
