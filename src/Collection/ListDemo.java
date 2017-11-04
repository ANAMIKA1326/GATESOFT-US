package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	
	public List<User> getUserDetails(){
		
		User user1 = new User();
		user1.setLastName("Shah");
		user1.setUserName("Bharat Shah");
		
		User user2 = new User();
		user2.setLastName("Mhta");
		user2.setUserName("Divyang");
		
		List<User> user = new ArrayList<>();
		user.add(user1);
		user.add(user2);
		
		
		return user;
		
	}
	
	public static void main(String[] args) {
		ListDemo demo = new ListDemo();
		List<User> userDetails = demo.getUserDetails();
		for (User user : userDetails) {
			
			System.out.println("UserName " + user.getUserName());
		}
		
	}

}
