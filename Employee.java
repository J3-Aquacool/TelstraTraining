import java.io.Serializable;


public class Employee implements Serializable

{
	transient static String acno="JA123456";
	
		
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	String name;
	int id;
	
}
