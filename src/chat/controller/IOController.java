package chat.controller;

import java.*;

import java.util.Calendar;
import java.util.Scanner;

import javax.swing.JFileChooser;

import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

public class IOController
{
	public static void saveText(ChatController app, String path, String textToSave)
	{
		try
		{
			String filename = path; // links the filename variable to the path parameter
			Calendar date = Calendar.getInstance(); // the date variable is the current date
			filename += "/" + date.get(Calendar.MONTH) + " " + date.get(Calendar.DAY_OF_MONTH); // begins building a filename around the current date, starting with the day
			filename += date.get(Calendar.HOUR) + "-" + date.get(Calendar.MINUTE);			
			filename += " chatbot save.txt";
			File saveFile = new File(filename); // saves file with name specified by filename
			Scanner textScanner = new Scanner(textToSave);
			PrintWriter saveText = new PrintWriter(saveFile);
			
			while(textScanner.hasNext())
			{
				String currentLine = textScanner.nextLine(); 
				saveText.println(currentLine);
			}
			
			textScanner.close();
			saveText.close();
			
		}
		catch(IOException error)
		{
		//	app.handleErrors(error);
		}
		catch(Exception genericError)
		{
			//	app.handleErrors(genericError);
		}
	}
		
	
	
	
		public static String loadFromFile(ChatController controller, String path)
		{
			String contents = "";
		
			try
			{
				File saveFile = new File(path);
				Scanner fileScanner;
				if(saveFile.exists())
				{
					fileScanner = new Scanner(saveFile);
					while(fileScanner.hasNext())
					{
						contents += fileScanner.nextLine() + "\n";
					}
					fileScanner.close();
				}
			}
			catch(IOException error)
			{
			//	app.handleErrors(error);
			}
			catch(Exception genericError)
			{
			//	app.handleErrors(genericError);
			}
		
			return contents;
		}
}
