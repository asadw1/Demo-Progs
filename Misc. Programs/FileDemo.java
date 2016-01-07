/*
 *  	Programmer: Asad Waheed 
 *	Project: FileDemo.java
 * 	Description: Basic demonstration of file IO and streams
 */

	//	Imports
	import java.io.BufferedReader; 		//	to read
	import java.io.File;			//	to create file
	import java.io.FileOutputStream;	//	to convert file to output stream
	import java.io.IOException;		//	to avoid try-catch in output stream
	import java.io.OutputStream;
	import java.net.URL;
	import java.io.*;			//	Example of a useless import BAD PRACTICE

public class FileDemo 
{

	public static void main(String[] args) throws IOException
	{
		//	The File class always refers to a path, NOT a file
		File path = new File("hello.txt");
		System.out.println("We got a file: " + path);

		System.out.println("Does it exist? " + path.exists());
		System.out.println("Wat? " + path.isDirectory()); //isDirectory returns bool
	
		//	Writing the file to a stream (pipe) 
		//String contentsToWrite = "hello world";
		
		//	Output stream instantiation 
		
		/*OutputStream outStream = new FileOutputStream(path);
		outStream.write(contentsToWrite.getBytes());
		outStream.close(); */
		
		//	Before writing to stream, exists and isDirectory methods 
		//	both return false
		
		//	Now reading file via BufferedReader
		/*BufferedReader reader = new BufferedReader(new InputStreamReader(
				new FileInputStream(path)));
		String firstLine = reader.readLine();
		reader.close();
		System.out.println("Read a Line: " + firstLine);*/
		
		//	Instantiating a URL object & reading it w/ BufferedReader 
		URL url = new URL("http://mirrors.xmission.com/gutenberg/etext98/2ws2610.txt");
		InputStream stream = url.openStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
		String line = reader.readLine();
		while(line != null){
			System.out.println(line);
			line = reader.readLine();
		}
		System.out.println("Reading complete!"); 
	}

		

}
