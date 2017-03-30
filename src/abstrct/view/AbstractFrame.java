package abstrct.view;

import javax.swing.JFrame;
import abstrct.controller.AbstractController;
import java.awt.Dimension;


public class AbstractFrame extends JFrame
{
	private AbstractController baseController;
	private AbstractPanel basePanel;
	
	public AbstractFrame(AbstractController baseController)
	{
		super();
		this.baseController = baseController;
		basePanel = new AbstractPanel(baseController);
		
		setupFrame();
	}
	
	//Sets the parameters for the frame
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setTitle("Chat Bot");
		this.setSize(new Dimension(600, 400));
		this.setResizable(false);
		this.setVisible(true);
	}
}
