package chat.view;

import javax.swing.*;
import chat.controller.ChatController;
import java.awt.GridBagLayout;
import java.awt.*;

public class ChatFrame extends JFrame
{
	private ChatController appController;
	private ChatPanel appPanel;
	
	public ChatFrame(ChatController appController)
	{
		super();
		this.appPanel = new ChatPanel(appController);
//		SpringLayout frameLayout = new SpringLayout();
//		appPanel.setLayout(frameLayout);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(1024, 768);
		this.setTitle("Xo");
		this.setResizable(false);
		this.setVisible(true);
	}
}
