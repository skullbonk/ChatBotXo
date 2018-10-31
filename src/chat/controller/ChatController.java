package chat.controller;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import chat.model.ChatBot;

public class ChatController
{
	

	private ChatBot bot;
	
	public ChatController()
	{
		bot = new ChatBot();
	}
	
	public void start()
	{	
		initialization();
		
		String input = "definitely not null";
		while(!input.equalsIgnoreCase("quit"))
		{
			input = (JOptionPane.showInputDialog(null, "type some stuff, or say quit to quit"));
			bot.setInput(input);
		}
	
	}
	
	public ChatBot getChatBot()
	{
		return bot;
	}
	
	public String interactWithChatBot(String input)
	{
		if(input == null)
		{
			return "sir you left it null";
		}
		return "words";
	}
	
	public String useChatBotCheckers(String input)
	{
		bot.spookyChecker(input);
		bot.contentChecker(input);
		return "";
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
		bot.setCurrentUser(userName);
		
		JOptionPane.showMessageDialog(null, "And a kindhearted chapstick to you. Welcome to Xo, " + bot.getCurrentUser() + ".");
	}
	
	
	
	public String repeatInput(String words)
	{
		String output = "not null";
		String userInput = JOptionPane.showInputDialog(null, "Gimme some words");
		output = bot.processText(userInput);
		
		return output;
	}
	
	

	

}
