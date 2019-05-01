package chat.controller;
// import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Canvas;
import twitter4j.Twitter;
import twitter4j.TwitterException;

import chat.model.*;
import chat.view.*;



/*	 
 * 
 *                    *       *                                               
 *             *      |             *                                          
 *          *  |      |                 * 
 *       *     |      |                   *
 *             |      |                                                             
 * 	   *       |      |                     *
 *             |      |        
 * 	  *        |      |                      *
 * 	           |      |         
 *    *        |      |                      *
 *             |      |           
 *     *       |      |                     *
 *      --------      ----------------------                    
 *       -------      --------------------
 *             |      |
 *          *  |      |               *
 *             *      |            *
 *                    *       *
 * 
 */



public class ChatController
{
	

	private ChatBot bot;
	private ChatFrame frame;
	private ChatPanel panel;
	private ChatTwitter meTwit;
	
	String input = "definitely not null";
	
	
	public ChatController()
	{
		bot = new ChatBot(input);
		meTwit = new ChatTwitter(this);
		frame = new ChatFrame(this);
	}
	
	public void start()
	{
		
	}
	
	public String findWords(String user)
	{
		String results = meTwit.getMostCommonWord(user);
		return results;
	}
	
	public ChatBot getChatBot()
	{
		return bot;
	}
	
	///// new interactWithChatBot() /////
	
	public String interactWithChatBot(String input)
	{
		String output = "";
		output += bot.processText(input);
		return output;
	}
	
	
	public String useChatBotCheckers(String input)
	{
		bot.spookyChecker(input);
		bot.contentChecker(input);
		return "Halloween";
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
	
	
	public void tweet(String text)
	{
		meTwit.sendTweet(text);
	}
	

	private void close()
	{
		System.exit(0);
	}
	
	public void handleErrors(Exception error)
	{
		System.out.println(error);
	}
	
	

	

}
