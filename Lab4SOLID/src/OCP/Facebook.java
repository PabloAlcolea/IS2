package OCP;

public class Facebook implements SignInSystem{

	@Override
	public boolean signIn(String log, String pass) {
		System.out.println("Has sido logeado via Facebook");
		return true;
	}
	
	

}
