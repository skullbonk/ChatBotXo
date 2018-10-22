package chat.model;
import java.util.ArrayList;


public class ChatBot
{
	private String name;
	private String jokeAsk;
	private String jokeAnswer;
	private String dismissal;
	
	private ArrayList<String> responseList;
	private ArrayList<String> spookyList;
	
	
	
	/**
	 * Initializes ChatBot with default settings.
	 */
	public ChatBot()
	{
		
		this.name = "N/A";
		this.jokeAsk = "What do you call this joke?";
		this.jokeAnswer = "Default.";
		this.dismissal = "Wow that's great, let's talk about [topic]";
	
		
		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();
		
		createLists();
		
	}
	
	public ChatBot(String name, String jokeAsk, String jokeAnswer, String dismissal, ArrayList<String> responseBank, ArrayList<String> spookyStuff)
	{
		this.name = name;
		this.jokeAsk = jokeAsk;
		this.jokeAnswer = jokeAnswer;
		this.dismissal = dismissal;
		
		this.responseList = responseBank;
		this.spookyList = responseBank;
		
		createLists();
	}
	
	public String parseInput(String userInput)
	{
		String response = userInput;
		return response;
	}
	
	private void createLists()
	{
		// Some generic crap to say
		responseList.add("hhi");
		responseList.add("HEY!! What the frick is up?");
		responseList.add("Tell me stuff.");
		
		spookyList.add("bats.");
		spookyList.add("skeletons says heck you");
		spookyList.add("frick or flight?");
		spookyList.add("Stinky skanky belly rubs?");
		spookyList.add("ehboo");
		spookyList.add("");
		
		
	}
	
	
	// BELOW LIES THE LAND OF GET
	
	public String getName()
	{
		return name;
	}
	
	public ArrayList<String> getResponseList()
	{
		return responseList;
	}
	
	public ArrayList<String> getSpookyList()
	{
		return spookyList;
	}
	
	// NOW ENTERING THE REALM OF SET
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	

}
