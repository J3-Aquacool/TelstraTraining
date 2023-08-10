import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class ReadAndWriteDataFromFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		// Create a Channel of Stream to read from the dataSource
		
		
		FileInputStream fin=new FileInputStream("D:\\JFS2\\workspace\\IOStreams\\src\\ReadDatafromConsole.java");
		
		//read(),skip(),available(),close()
		
		int size=fin.available();
		
		System.out.println("Size:"+size);
		
		
		fin.skip(500);
		for(int i=0;i<size;i++)
			
		{
			System.out.print((char)fin.read());
		}
		
		
		fin.close();
		
		// Lets Write Some data to a file
		
		
		FileOutputStream fout=new FileOutputStream("myfile.txt",true);
		
		
		String data=" Hope the Append mode is followed";
		
		// write(),write(byte[]) close
		
		byte b[]=data.getBytes();
		
		
		fout.write(b);
		
		fout.close();
		
		
		// When a write operation is opened with a Stream by deafult it will open 
		//in write mode
		
	}

}
