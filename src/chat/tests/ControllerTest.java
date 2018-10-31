package chat.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import chat.controller.ChatController;

public class ControllerTest
{

	private ChatController testController;
	@Before
	public void setUp() throws Exception
	{
		testController = new ChatController();
	}

	@After
	public void tearDown() throws Exception
	{
		testController = null;
	}

	@Test
	public void testChatController()
	{
		assertNotNull("Chatbot data member not initialized", testController.getChatBot());
	}

	@Test
	public void testInteractWithChatbot()
	{
		assertNotNull("Stub method used, implement with code", testController.interactWithChatBot(""));
		assertNotNull("Null should not ever be returned", testController.interactWithChatBot(null));
		assertTrue("If null is supplied user should be notified about it", testController.interactWithChatBot(null).toLowerCase().contains("null"));
	}

	@Test
	public void testUseChatbotCheckers()
	{
		assertTrue("Spooky tester method not implemented", testController.useChatBotCheckers("spooky").contains("Halloween"));
	}

	@Test
	public void testGetChatBot()
	{
		assertNotNull("Chatbot data member not initialized", testController.getChatBot());
	}

}
