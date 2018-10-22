package chat.xocontroller;
import chat.xomodel.ChatBot;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class XoController
{
	

	private ChatBot bot;
	
	public XoController()
	{
		bot = new ChatBot();
	}
	
	public void start()
	{	
		initialization();
		
		String latestInput = "N/A";
		while(!latestInput.equalsIgnoreCase("quit"))
		{
			latestInput = (JOptionPane.showInputDialog(null, "type some stuff, or say quit to quit"));
		}
	
	}
	
	public ChatBot getChatBot()
	{
		return bot;
	}
	
	/**
	 * Shows disclaimer and asks for username.
	 */
	public void initialization()
	{
		String disclaimer = JOptionPane.showInputDialog(null, "HHEY! I'm Xo. I say stupid crap. I don't save any data other than the name you give me, and I don't send that to anyone. You cool with that? (y/n)");
		
		while(!disclaimer.equalsIgnoreCase("y"))
		{
			disclaimer = JOptionPane.showInputDialog(null, "Scuse me, kiddo, if you wanna get past this screen, you pretty much have to type y. Either try again or go do something else.");		
		}
				
		String userName = JOptionPane.showInputDialog(null, "Marvelous. You're gonna have to give me something to adress you by. Like a name. It doesn't have to be your actual name. It doesn't even matter what you type in here, It's just another variable to fart out.");
		bot.setName(userName);
		
		JOptionPane.showMessageDialog(null, "And a kindhearted chapstick to you. Welcome to Xo, " + bot.getName() + ".");
	}
	
	
	
	public String repeatInput(String words)
	{
		String output = "";
		String userInput = JOptionPane.showInputDialog(null, "Gimme some words");
		output = bot.parseInput(userInput);
		
		return output;
	}
	
	

	

}
