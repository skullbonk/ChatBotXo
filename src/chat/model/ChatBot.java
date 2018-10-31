package chat.model;
import java.util.ArrayList;
import java.util.Random;


public class ChatBot
{
	private String currentUser = "definitely not null";
	private String input = "definitely not null";
	private String content = "definitely not null";
	private String response = "definitely not null";
	
	Random random = new Random();

	
	private ArrayList<String> responseList;
	private ArrayList<String> spookyList;
	
	
	/**
	 * Initializes ChatBot with default settings.
	 */
	public ChatBot()
	{
		
		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();
		
		createLists();
		getContent();
		
	}

	public ChatBot(String content)
	{
		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();
		this.content = content;
		
		createLists();
		getContent();
	}
	
	
	public String processText(String input)
	{
		if(input == getContent())
		{
			return "You said the special words";
		}
		content = "You said: " + input;
		int index = random.nextInt(15);
		response = "ChatBot says: " + responseList.get(index);
		return getContent();
	}
	
	
	
	private void createLists()
	{
		// Some generic crap to say
		responseList.add("hhHhhhHHhHhhHHello");
		responseList.add("HEY!! What the frick is up?");
		responseList.add("Tell me stuff.");
		responseList.add("send me your words");
		responseList.add("you can probably send me images, but i think i'll have a seizure");
		responseList.add("hhhhhhey that's great");
		responseList.add("hey, kid. i'm a computer.");
		responseList.add("54035");
		responseList.add("sorry, i only speak r0b0t c0mput3r w0rd5");
		responseList.add("spam");
		responseList.add("i don't want your cabbage, sir");
		responseList.add("try don't-ing");
		responseList.add("responseList.add(words)");
		responseList.add("want some jokes? no? ok.");
		responseList.add("you sure you don't want some jokes?");
		responseList.add("i'm pretty sure you could use some jokes");
		
		spookyList.add("hey what day is Halloween? like yesterday?");
		spookyList.add("bats.");
		spookyList.add("skeletons says heck you");
		spookyList.add("is pom-pom really dead?");
		spookyList.add("dead things?");
		spookyList.add("ehboo");
		spookyList.add("don't get F L A T");	
		spookyList.add("i dont eat candy i only eat MANDY");
		spookyList.add("toilet paper, sir");
		spookyList.add("you are in fact ghost");
		spookyList.add("for decemberween i'm going to be dog from word world");
		spookyList.add("s n i c k e r s b a r s");
		spookyList.add("spooky shoes");
		spookyList.add("i like to glue my candy to half a ball of styrofoam and watch the kids yell heck");
		spookyList.add("only "
				+ "take "
				+ "one "
				+ ""
				+ ""
				+ "sir"
				+ "");
	}
	
	////////////////////  CHECKER SECTION  ////////////////////
	
	public boolean contentChecker(String content)
	{
		
		getContent();
		return getContent();
	}
	
	public boolean spookyChecker(String input)
	{
		boolean isSpooky = false;
		
		for(int spookyLocation = 0; spookyLocation <= spookyList.size(); spookyLocation++)
		{
			isSpooky = true;
		}
		if(input.contains("Halloween"))
		{
			isSpooky = true;
		}
		
		else if(input.contains("Easter"))
		{
			isSpooky = false;
		}
		
		return isSpooky;
	}
	
	
	
	
	/**
	 * Determines whether the user's input actually means anything.
	 * @param input User's input
	 * @return The input makes sense if true
	 */
	public boolean legitimacyChecker(String input)
	{
		boolean isValid = true;
		
		if(input == null)
		{
			isValid = false;
		}
		else if(input == "")
		{
			isValid = false;
		}
		else if(input.length() < 2)
		{
			isValid = false;
		}
		else if(input.contains(";"))     // Because if someone is sending a chatbot
		{							    // fancy semicolon sentences, they're either
			isValid = false;           // fake or trying to heck up my javas
		}
		else if(input.contains("df"))
		{
			isValid = false;
		}
		
		return isValid;
	}
	
	
	
	////////////////////  BELOW LIES THE LAND OF GET  ////////////////////

	public String getContent()
	{
		return content + ". " + response;
	}
	
	
	public String getCurrentUser()
	{
		return currentUser;
	}
	
	
	public ArrayList<String> getResponseList()
	{
		return responseList;
	}
	
	
	public ArrayList<String> getSpookyList()
	{
		return spookyList;
	}
	
	
	////////////////////  NOW ENTERING THE REALM OF SET  ////////////////////
	
	
	public void setCurrentUser(String currentUser)
	{
		this.currentUser = currentUser;
	}
	
	
	public void setInput(String input)
	{
		this.input = input;
	}
}
