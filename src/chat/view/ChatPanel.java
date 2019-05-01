package chat.view;

import chat.controller.ChatController;
import chat.controller.IOController;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Component;
import java.awt.*;

public class ChatPanel extends JPanel
{
	private ChatController appController;
	private SpringLayout chatLayout;
	private JButton saveButton;
	private JButton loadButton;
	private JButton chatButton;
	private JButton checkerButton;
	private JTextField chatField;	
	private JTextArea chatArea;	
	private JScrollPane chatPane;
	private JPanel buttonPanel;
	private JButton tweetButton;
	private JButton searchTwitterButton;
	
	private ImageIcon saveIcon;
	private ImageIcon loadIcon;
	private ImageIcon chatIcon;
	private ImageIcon checkerIcon;
	private ImageIcon tweetIcon;
	private ImageIcon searchIcon;
	
	private String labelText = "Please don't say anything mean to Xo, as it's a crappy program that won't care, so it would be a waste of your time";
	
	
	public ChatPanel(ChatController appController)
	{
		super();	
		
		this.appController = appController;
		chatLayout = new SpringLayout();

		saveIcon = new ImageIcon(getClass().getResource("/chat/view/images/save.png"));
		loadIcon = new ImageIcon(getClass().getResource("/chat/view/images/load.png"));
		chatIcon = new ImageIcon(getClass().getResource("/chat/view/images/chat.png"));
//		checkerIcon = new ImageIcon(getClass().getResource("/chat/view/images/check.png"));
		tweetIcon = new ImageIcon(getClass().getResource("/chat/view/images/tweet.png"));
		searchIcon = new ImageIcon(getClass().getResource("/chat/view/images/searchTwitter.png"));
		
		chatButton = new JButton("Chat", chatIcon);
		checkerButton = new JButton("Check", checkerIcon);
		loadButton = new JButton("Load", loadIcon);
		saveButton = new JButton("Save", saveIcon);		
		tweetButton = new JButton("Tweet", tweetIcon);
		searchTwitterButton = new JButton("Search Twitter", searchIcon);
		
		chatField = new JTextField("");		
		chatField.setToolTipText("type words");
		chatPane = new JScrollPane();		
		chatArea = new JTextArea();
		buttonPanel = new JPanel(new GridLayout(1, 0));
		setupScrollPane();
		setupPanel();
		setupButtonPanel();
		setupLayout();
		setupListeners();
	}
	
	
	private void setupScrollPane()
	{
		chatArea.setEditable(false);
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
		chatPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		chatPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	}
	
	
	private void setupPanel()
	{
		this.setLayout(chatLayout);
		this.setPreferredSize(new Dimension(1024, 768));
		this.setBackground(Color.DARK_GRAY);
		
		this.add(buttonPanel);
		buttonPanel.setPreferredSize(new Dimension(900, 150));
		buttonPanel.setBackground(Color.GRAY);
		this.add(chatPane);
		this.add(chatField);
		chatArea = new JTextArea("Area of chat \n -----------------", 20, 50);

		this.add(chatArea);
		
	}
	
	
	private void setupButtonPanel()
	{
		buttonPanel.add(chatButton);
		buttonPanel.add(tweetButton);
		buttonPanel.add(searchTwitterButton);
		buttonPanel.add(checkerButton);
		buttonPanel.add(saveButton);
		buttonPanel.add(loadButton);
		buttonPanel.add(saveButton);
	}
	
	
	public String getPath(String choice)
	{
		String path = ".";
		int result = -99;
		JFileChooser fileChooser = new JFileChooser();
		if (choice.equals("save"))
		{
			fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			result = fileChooser.showSaveDialog(this);
			if(result == JFileChooser.APPROVE_OPTION)
			{
				path = fileChooser.getCurrentDirectory().getAbsolutePath();
			}
		}
		else
		{
			result = fileChooser.showOpenDialog(this);
			if(result == JFileChooser.APPROVE_OPTION)
			{
				path = fileChooser.getSelectedFile().getAbsolutePath();
			}
		}
		return path;
	}
	
	
	private void setupLayout()
	{
		chatLayout.putConstraint(SpringLayout.NORTH, chatArea, 0, SpringLayout.NORTH, chatPane);
		chatLayout.putConstraint(SpringLayout.WEST, chatArea, 0, SpringLayout.WEST, buttonPanel);
		chatLayout.putConstraint(SpringLayout.SOUTH, chatArea, 0, SpringLayout.SOUTH, chatPane);
		chatLayout.putConstraint(SpringLayout.EAST, chatArea, 0, SpringLayout.EAST, buttonPanel);
		
		chatLayout.putConstraint(SpringLayout.NORTH, chatPane, 40, SpringLayout.NORTH, this);
		chatLayout.putConstraint(SpringLayout.WEST, chatPane, 0, SpringLayout.WEST, buttonPanel);
		chatLayout.putConstraint(SpringLayout.SOUTH, chatPane, 0, SpringLayout.NORTH, chatField);
		chatLayout.putConstraint(SpringLayout.EAST, chatPane, 0, SpringLayout.EAST, buttonPanel);
		chatLayout.putConstraint(SpringLayout.WEST, chatField, 0, SpringLayout.WEST, buttonPanel);
		chatLayout.putConstraint(SpringLayout.SOUTH, chatField, -20, SpringLayout.NORTH, buttonPanel);
		chatLayout.putConstraint(SpringLayout.EAST, chatField, 0, SpringLayout.EAST, buttonPanel);
		chatLayout.putConstraint(SpringLayout.WEST, buttonPanel, 40, SpringLayout.WEST, this);
		chatLayout.putConstraint(SpringLayout.SOUTH, buttonPanel, -40, SpringLayout.SOUTH, this);
		chatLayout.putConstraint(SpringLayout.EAST, buttonPanel, -40, SpringLayout.EAST, this);
	}
	
	
	private void setupListeners()
	{
		chatButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				String input = chatField.getText();
				String output = ""; 
				output = appController.interactWithChatBot(input);
				chatArea.append(output);
				chatField.setText("");
				chatArea.setCaretPosition(chatArea.getDocument().getLength());
			}
		});
		
		searchTwitterButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String usernameToSearch = chatField.getText();
			}
		});
		
		saveButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent click)
					{
						String chatText = chatArea.getText();
						String path = ".";
						IOController.saveText(appController, path, chatText);
						chatArea.setText("Chat saved");
					}
				});
		
		loadButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String path = getPath("load");
				String chatText = IOController.loadFromFile(appController, path);
				chatArea.setText(chatText);
			}
		});
		
		tweetButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent tweetClick)
			{
				String textToTweet = chatField.getText().trim();
				appController.tweet(textToTweet);
			}
		});
		
		searchTwitterButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent searchClick)
			{
				String username = chatField.getText().trim();
				String display = appController.findWords(username);
				chatArea.append("\n\n" + display);
			}
		});
	}
}
