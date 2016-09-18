package model;

//����� ctrl+shift+o�� ������ ��ü����
import lombok.Getter;
import lombok.Setter; 

//lombok���� ���������� �ʰ� �ڵ������� ����
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
