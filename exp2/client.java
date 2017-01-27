import java.util.*;
import java.net.*;
import java.io.*;

class client
{
	public static void main(String args[]) throws IOException
	{
		Socket s = new Socket("localhost",8080);
		Scanner sc = new Scanner(System.in);
		DataInputStream dis = new DataInputStream(s.getInputStream());
		byte b[] = new byte[10000];
		dis.read(b);
		dis.close();
		String str = new String(b, "UTF-8");
		FileOutputStream fos = new FileOutputStream("copy.txt");
		fos.write(b);
		fos.close();
		System.out.println("File saved successfuly");
	}
}