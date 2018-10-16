package xomodel;
import java.util.ArrayList;


public class ChatBot
{
	private String name;
	private String jokeAsk;
	private String jokeAnswer;
	private String dismissal;
	
	private ArrayList<String> responseBank;
	private ArrayList<String> spookyStuff;
	
	
	
	/**
	 * Initializes ChatBot with default settings.
	 */
	public ChatBot()
	{
		
		this.name = "N/A";
		this.jokeAsk = "What do you call this joke?";
		this.jokeAnswer = "Default.";
		this.dismissal = "Wow that's great, let's talk about [topic]";
	
		
		this.responseBank = new ArrayList<String>();
		this.spookyStuff = new ArrayList<String>();
		
	}
	
	public ChatBot(String name, String jokeAsk, String jokeAnswer, String dismissal)
	{
		this.name = name;
		this.jokeAsk = jokeAsk;
		this.jokeAnswer = jokeAnswer;
		this.dismissal = dismissal;
	}
	
	private void responseList()
	{
		
	}
	
	
	// BELOW LIES THE LAND OF GET
	
	public String getName()
	{
		return name;
	}
	
	// NOW ENTERING THE REALM OF SET
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	

}
