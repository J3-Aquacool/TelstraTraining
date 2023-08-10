import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class ReaderAndWriteDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Create a Channel of Stream to read from the dataSource
		
		File f=new File("D:\\JFS2\\workspace\\IOStreams\\src\\ReadDatafromConsole.java");
		System.out.println(f.length());
				
		
		
		FileReader fin=new FileReader(f);
				
		char data[]=new char[(int)f.length()];
		fin.read(data);
		
	
		File w=new File("abc.txt");
		FileWriter fw=new FileWriter(w);
		
		fw.write(data);
		
		fw.close();
		
		
		
		
		
				//read(),skip(),available(),close()
				
				
				
	}

}
