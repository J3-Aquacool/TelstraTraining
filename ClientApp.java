import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;




public class ClientApp {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		
		FileInputStream fin=new FileInputStream("empdata.ser");
		
		ObjectInputStream readObj=new ObjectInputStream(fin);
		
		
		//System.out.println(readObj.readObject());
		
		Employee emp=(Employee)readObj.readObject();
		
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		
		
		
	}

}
