package main;
import java.lang.String;
import java.util.Scanner;

public class CustomerName{
	private String name1;
	private Scanner sc;

	public void customer() {
		CustomerName cn=new CustomerName();
		sc = new Scanner(System.in);
		String name = sc.nextLine();
		cn.setName(name);
		cn.getName();
	}
	
	public String getName() {
		return name1;
	}

	public void setName(String name) {
		this.name1=name;
	}
	
}
	
