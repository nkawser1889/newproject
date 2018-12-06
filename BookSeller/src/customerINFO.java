
public class customerINFO {
	public String name;
	public  String email;
    public	String userName;
	public String password;
	
	public customerINFO(String name,String email, String userName,String password) {
		this.name=name;
		this.email=email;
		this.userName=userName;
		this.password=password;
	}
	public customerINFO(String userName,String password) {
		this.userName=userName;
		this.password=password;
	}
	public customerINFO () {
		this.userName=userName;
		this.password=password;
		
	}

}
