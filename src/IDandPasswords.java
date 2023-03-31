import java.util.*;

public class IDandPasswords {

	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
		
		logininfo.put("Aryan","Surve");
		
	}
	
	IDandPasswords(String userID , String pass){
		
		logininfo.put(userID, pass);
		System.out.println(logininfo);
	
	}
	
	protected HashMap getLoginInfo() {
		
		return logininfo;
		
	}
	
}
