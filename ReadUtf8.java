import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class ReadUtf8 {
	public static void main(String[] args){

	try {
		File fileDir = new File("3500.txt");

		BufferedReader in = new BufferedReader(
		   new InputStreamReader(
                      new FileInputStream(fileDir), "UTF8"));

		int str;

		while ((str = in.read()) != -1) {
		    System.out.println(str);
		}

                in.close();
	    }
	    catch (UnsupportedEncodingException e)
	    {
			System.out.println(e.getMessage());
	    }
	    catch (IOException e)
	    {
			System.out.println(e.getMessage());
	    }
	    catch (Exception e)
	    {
			System.out.println(e.getMessage());
	    }
	}
}