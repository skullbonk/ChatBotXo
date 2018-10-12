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
		initialization();
	}
	
	/**
	 * Shows disclaimer and asks for username.
	 */
	public void initialization()
	{
		String disclaimer = JOptionPane.showInputDialog(null, "HHEY! I'm Xo. I say stupid crap. I don't save any data other than the name you give me, and I don't send that to anyone. You cool with that? (y/n)");
		if(disclaimer == "n")
		{
			JOptionPane.showMessageDialog(null, "Well what the frick are you doing here then? Go do something else!");
		}
		else
		{
			if(disclaimer == "y")
			{
				String userName = JOptionPane.showInputDialog(null, "Marvelous. You're gonna have to give me something to adress you by. You know, like a name. It doesn't have to be your actual name. It doesn't even matter what you type in here. It's just a variable that some nerd has to remember to fart back out at you now and then. Hurry up lad, this Mac isn't getting any faster.");
				bot.setName(userName);
			}
			else
			{
				JOptionPane.showInputDialog(null, "Scuse me, kiddo, you gotta type in either y or n. Try again.");
			}
		}
	}
	

	

}
