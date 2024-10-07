package OCP;

public class Apple implements SignInSystem{

	@Override
	public boolean signIn(String log, String pass) {
		System.out.println("Has sido logeado via Apple");
		return true;
	}
	
	

}
