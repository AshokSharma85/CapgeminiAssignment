package lab6;
import java.io.*;
public class Exercise2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new FileReader("Sample.txt"));
		String str=br.readLine();
		int line=1;
		System.out.println("Your File Contain the following information line by line: ");
		while(str!=null)
		{
			System.out.print((line++)+" ");
			System.out.println(str);
			str=br.readLine();
		}
		br.close();
	}

}
