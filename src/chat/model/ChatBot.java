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
		int index = random.nextInt(16);
		response = responseList.get(index);
		return content + "ChatBot says: " + response;
	}
	
	
	
	private void createLists()
	{		
		///////////////////////////// --- RESONSE LIST --- ////////////////////////////
		//////////////////////////// --- 16 RESPONSES --- ////////////////////////////	
		/*00*/	responseList.add("hhHhhhHHhHhhHHello");
		/*01*/	responseList.add("HEY!! What the frick is up?");
		/*02*/	responseList.add("Tell me stuff.");
		/*03*/	responseList.add("send me your words");
		/*04*/	responseList.add("you can probably send me images, but i think i'll have a seizure");
		/*05*/	responseList.add("hhhhhhey that's great");
		/*06*/	responseList.add("hey, kid. i'm a computer.");
		/*07*/	responseList.add("54035");
		/*08*/	responseList.add("sorry, i only speak r0b0t c0mput3r w0rd5");
		/*09*/	responseList.add("spam");
		/*10*/	responseList.add("i don't want your cabbage, sir");
		/*11*/	responseList.add("try don't-ing");
		/*12*/	responseList.add("responseList.add(\"words\")");
		/*13*/	responseList.add("want some jokes? no? ok.");
		/*14*/	responseList.add("you sure you don't want some jokes?");
		/*15*/	responseList.add("i'm pretty sure you could use some jokes");
		///////////////////////////// --- SPOOKY  LIST --- ////////////////////////////
		//////////////////////////// --- 15 responses --- ////////////////////////////	
		/*00*/	spookyList.add("hey what day is Halloween? like yesterday?");
		/*01*/	spookyList.add("bats.");
		/*02*/	spookyList.add("skeletons says heck you");
		/*03*/	spookyList.add("is pom-pom really dead?");
		/*04*/	spookyList.add("dead things?");
		/*05*/	spookyList.add("ehboo");
		/*06*/	spookyList.add("don't get F L A T");	
		/*07*/	spookyList.add("i dont eat candy i only eat MANDY");
		/*08*/	spookyList.add("toilet paper, sir");
		/*09*/	spookyList.add("you are in fact ghost");
		/*10*/	spookyList.add("for decemberween i'm going to be dog from word world");
		/*11*/	spookyList.add("s n i c k e r s b a r s");
		/*12*/	spookyList.add("spooky shoes");
		/*13*/	spookyList.add("i like to glue my candy to half a ball of styrofoam and watch the kids yell heck");
		/*14*/	spookyList.add("only "
							+ "take "
							+ "one "
							+ ""
							+ ""
							+ "sir"
							+ "");
	}
	
///////////////////////////// --- CHECKER SECTION --- /////////////////////////////
	
	public boolean contentChecker(String input)
	{
		boolean special = false;
		if(input.equals(getContent()))
		{
			special = true;
		}
		if(input == content)
		
		{
			special = true;
		}
		return special;
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
		return content;
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
