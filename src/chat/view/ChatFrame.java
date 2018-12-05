package chat.view;

import javax.swing.JFrame;
import chat.controller.ChatController;
import java.awt.GridBagLayout;

public class ChatFrame extends JFrame
{
	private ChatController appController;
	private ChatPanel appPanel;
	
	public ChatFrame(ChatController appController)
	{
		super();
		this.appPanel = new ChatPanel(appController);
		GridBagLayout gbl_appPanel = new GridBagLayout();
		gbl_appPanel.columnWidths = new int[]{0};
		gbl_appPanel.rowHeights = new int[]{0};
		gbl_appPanel.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_appPanel.rowWeights = new double[]{Double.MIN_VALUE};
		appPanel.setLayout(gbl_appPanel);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(800, 800);
		this.setTitle("Xo");
		this.setResizable(true);
		this.setVisible(true);
	}
}
