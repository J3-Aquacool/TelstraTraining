import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class SerializationDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	
	FileOutputStream fout=new FileOutputStream("empdata.ser");
	
	
	ObjectOutputStream serdata=new ObjectOutputStream(fout);
	
	Employee emp=new Employee("Rahul",100);
	
	serdata.writeObject(emp);

	
	serdata.close();
	fout.close();
	}

}
