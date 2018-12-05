package chat.view;

import chat.controller.ChatController;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Component;

public class ChatPanel extends JPanel
{
	private ChatController appController;
	
	
	private JButton chatButton;
	private JButton checkerButton;
	private JButton loadButton;
	private JButton saveButton;
	
	private JTextField chatField;
	
	private JTextArea chatArea;
	
	private JScrollPane chatPane;
	
	private SpringLayout chatLayout;
	
	private String labelText = "Please don't say anything mean to Xo, as it's a crappy program that won't care, so it would be a waste of your time";
	
	public ChatPanel(ChatController appController)
	{
		super();
		
		
		this.appController = appController;
		
		chatArea = new JTextArea("Area of chat", 20, 50);
		
		chatButton = new JButton("Chat");
		checkerButton = new JButton("Check");
		loadButton = new JButton("Load");
		/*
		loadButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		*/
		saveButton = new JButton("Save");
		
		chatField = new JTextField("Type words", 50);
		
		chatPane = new JScrollPane();
		
		chatLayout = new SpringLayout();
		
		
		
		setupScrollPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupScrollPane()
	{
		chatArea.setEditable(false);
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
		
	}
	
	private void setupPanel()
	{
		this.setLayout(chatLayout);
		this.setPreferredSize(new Dimension(800, 600));
		this.setBackground(Color.DARK_GRAY);
		
		this.add(chatPane);
		this.add(chatField);
		this.add(loadButton);
		this.add(saveButton);
		this.add(checkerButton);
		this.add(chatButton);
	}
	
	private void setupLayout()
	{
		chatLayout.putConstraint(SpringLayout.NORTH, saveButton, 6, SpringLayout.SOUTH, chatField);
		chatLayout.putConstraint(SpringLayout.NORTH, loadButton, 6, SpringLayout.SOUTH, chatField);
		chatLayout.putConstraint(SpringLayout.WEST, loadButton, 50, SpringLayout.WEST, this);
		chatLayout.putConstraint(SpringLayout.WEST, chatField, 50, SpringLayout.WEST, this);
		chatLayout.putConstraint(SpringLayout.EAST, chatField, -6, SpringLayout.WEST, chatButton);
		chatLayout.putConstraint(SpringLayout.NORTH, checkerButton, 0, SpringLayout.NORTH, loadButton);
		chatLayout.putConstraint(SpringLayout.WEST, checkerButton, 6, SpringLayout.EAST, saveButton);
		chatLayout.putConstraint(SpringLayout.WEST, saveButton, 6, SpringLayout.EAST, loadButton);
		
		chatPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		chatPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		chatLayout.putConstraint(SpringLayout.NORTH, chatButton, 6, SpringLayout.SOUTH, chatArea);
		chatLayout.putConstraint(SpringLayout.NORTH, chatField, 6, SpringLayout.SOUTH, chatArea);
		chatLayout.putConstraint(SpringLayout.EAST, chatButton, 0, SpringLayout.EAST, chatArea);
		chatLayout.putConstraint(SpringLayout.SOUTH, chatArea, -202, SpringLayout.SOUTH, this);
		chatLayout.putConstraint(SpringLayout.WEST, chatArea, 50, SpringLayout.WEST, this);
		chatLayout.putConstraint(SpringLayout.EAST, chatArea, -50, SpringLayout.EAST, this);
		add(chatArea);
		
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
