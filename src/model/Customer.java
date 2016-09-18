package model;

//만들고 ctrl+shift+o를 누르면 객체생성
import lombok.Getter;
import lombok.Setter; 

//lombok으로 지저분하지 않게 자동적으로 생성
@Getter
@Setter

public class Customer {

	private String id;
	private String name;
	private String email;
	
	
	public Customer(String id, String name, String email) {

		this.id = id;
		this.name = name;
		this.email = email;
	}


	
	
	
}
