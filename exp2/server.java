import java.util.*;
import java.net.*;
import java.io.*;

class server
{
	public static void main(String args[]) throws IOException
	{
		ServerSocket ss = new ServerSocket(8080);
		Socket s = ss.accept();
		File file = new File("original.txt");
		FileInputStream fis = new FileInputStream(file);
		byte[] data = new byte[(int) file.length()];
		fis.read(data);
		fis.close();
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		dos.write(data);
		dos.close();
		System.out.println("File is on server");		
	}
}