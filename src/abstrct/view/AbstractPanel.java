package abstrct.view;

import abstrct.controller.AbstractController;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AbstractPanel extends JPanel
{
	private AbstractController baseController;
	private SpringLayout baseLayout;
	private JTextArea textArea;
	private JButton firstButton;
	private JButton secondButton;
	
	public AbstractPanel(AbstractController baseController)
	{
		super();
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		textArea = new JTextArea(5, 25);
		firstButton = new JButton("");
		secondButton = new JButton("");
			
		
		setupLayout();
		setupPanel();
		setupListeners();
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.GRAY);
		this.add(textArea);
		this.add(firstButton);
		this.add(secondButton);	
	}
	
	private void setupListeners()
	{
		
	}
	
	
	
}
