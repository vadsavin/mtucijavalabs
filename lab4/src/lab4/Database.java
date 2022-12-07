package lab4;

import java.util.HashMap;

public class Database {
	private HashMap<String, String> Credentials;
	
	private static Database _instance;
	
	private Database() {
		Credentials = new HashMap<String, String>();
	}
	
	public static Database GetDatabase() {
		if (_instance == null)
			_instance = new Database();
		
		return _instance;
	}
	
	public boolean Register(String login, String password) {
		if (Credentials.containsKey(login)) return false;
		Credentials.put(login, password);
		return true;
	}
	
	public User Login(String login, String password) {
		if (Credentials.containsKey(login) && Credentials.get(login) == password) {
			var User = new User();
			User.Login = login;
			User.Password = Credentials.get(login);
			return User;
		}
		else
		{
			return new User();	
		}
	}
}
