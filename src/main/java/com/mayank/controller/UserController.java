package com.mayank.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.mayank.bean.Product;
import com.mayank.bean.User;

@RestController
@RequestMapping("/users")
public class UserController {

	public static Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	private final String uri = "http://localhost:8012";
	
//	@Autowired
//	public RestTemplate restTemplate;
//	
	private static List<User> list;

	static {
		list = new ArrayList<User>();
		list.add(new User(new Integer(101),"Mohan","bangalore","Andra pradesh"));
		list.add(new User(new Integer(121),"madhulika","delhi","delhi"));
		list.add(new User(new Integer(131),"Surendra","noida","UP"));
		list.add(new User(new Integer(105),"Sohan","jalaun","UP"));
		list.add(new User(new Integer(143),"krishna","orai","UP"));
		list.add(new User(new Integer(134),"Bihari","patna","Bihar"));
		list.add(new User(new Integer(156),"Mohan","noida","UP"));
		list.add(new User(new Integer(176),"ramesh","noida","UP"));
		list.add(new User(new Integer(177),"rakesh","jalaun","UP"));

	}

	@GetMapping("/userList")
	private List<User> getuser() {
//		System.out.println(restTemplate);
		return list;
	}
//	@RequestMapping("/productList/{id}")
//	private Product getPersonList(@PathVariable Integer id) {
//		Product product =  restTemplate.getForObject(uri+"products/productListById/"+id,Product.class);
//		return product;
//	}
	
	@RequestMapping("/userListById/{userId}")
	public User getUserList(@PathVariable Integer userId){
		Iterator<User> it = list.iterator();
		while(it.hasNext()) {
			User user = (User)it.next();
			if(user.getUserId().equals(userId)) {
				return user;
			}
		}
		return null;
	}
	
//	@RequestMapping("/productLists")
//	private String getPersonListString() {
//		LOGGER.info("Start user class method execution");
//		String string =  restTemplate.getForObject(uri+"/products/userLists",String.class);
//		LOGGER.info("End user class method execution");
//		return string;
//	}
//	
	
}
