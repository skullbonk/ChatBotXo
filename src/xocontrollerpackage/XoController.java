package xocontrollerpackage;
import xomodel.ChatBot;
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
		
		String bun = "chunk \\pi π ";
		System.out.println(bun);
		int windex = "chunk \\pi π ".indexOf("hn");
		System.out.println(windex);
		
		
		
		initialization();
		String latestInput = "none";
		while(!latestInput.equalsIgnoreCase("quit"))
		{
			chatSession();
		}
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
	}
	
	public void chatSession()
	{
		JOptionPane.showMessageDialog(null, "Excellent. Welcome to Xo, " + bot.getName() + ".");
		String latestInput = JOptionPane.showInputDialog(null, "What do you wanna say?");
	}

	

}
