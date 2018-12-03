package chat.view;

import chat.controller.ChatController;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Canvas;

public class ChatPanel extends JPanel
{
	private ChatController appController;
	private JLabel chatLabel;
	private JButton chatButton;
	private SpringLayout chatLayout;
	
	public ChatPanel(ChatController appController)
	{
		super();
		
		this.appController = appController;
		
		chatLabel = new JLabel("");
		chatButton = new JButton("");
		chatLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(chatLayout);
		this.add(chatButton);
		this.add(chatLabel);
	}
	
	private void setupLayout()
	{
	//	chatLayout.putConstraints(SpringLayout.NORTH)
	}
	
	private void setupListeners()
	{
		chatButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
						
			}
		});
	}
}
