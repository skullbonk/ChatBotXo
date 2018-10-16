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
		
		createBanks();
		
	}
	
	public ChatBot(String name, String jokeAsk, String jokeAnswer, String dismissal, ArrayList<String> responseBank, ArrayList<String> spookyStuff)
	{
		this.name = name;
		this.jokeAsk = jokeAsk;
		this.jokeAnswer = jokeAnswer;
		this.dismissal = dismissal;
		
		this.responseBank = responseBank;
		this.spookyStuff = responseBank;
		
		createBanks();
	}
	
	private void createBanks()
	{
		// Some generic crap to say
		responseBank.add("HEY!! What the frick is up?");
		responseBank.add("")
		
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
