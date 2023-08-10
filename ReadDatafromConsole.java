import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReadDatafromConsole {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Enter The Name");
		
		// Create an object of DataInputStream class
		
		DataInputStream d=new DataInputStream(System.in);
		
		// To read any data from console use the readLine() which returns String
		
		/*String ename=d.readLine();  // depracted method
		
		int age=Integer.parseInt(d.readLine());
		
		
		System.out.println("Name:"+ename);
		System.out.println("Age:"+age);*/
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
         String ename=br.readLine();  // depracted method
		
		int age=Integer.parseInt(br.readLine());
		
		
		System.out.println("Name:"+ename);
		System.out.println("Age:"+age);
		
		
		
		

	}

}
