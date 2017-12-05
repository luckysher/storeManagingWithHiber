package storeManagerUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ItemStore extends JPanel {
		
	
	public void setTextField(GridBagLayout gbl, GridBagConstraints gbc){
		gbc.insets = new Insets(15, 15, 0, 200);
		gbc.gridwidth = GridBagConstraints.REMAINDER;		
		gbc.gridheight = 1;
		gbc.weighty = 0.03;
						
	}
	
	
	public ItemStore(){		
		GridBagLayout gbl = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();		
		this.setLayout(gbl);   
		
		//set main heading
		setToolTipText("Storage form");
		addTopHeading(gbl, gbc, "Storage form");
		
		// Set Name label and text field
		setLabel(gbl, gbc, "Name");
		setTextField(gbl, gbc);
				
		// Set Name label and text field
		setLabel(gbl, gbc, "Price");
		setTextField(gbl, gbc);
					
		// Set Buying label and text field
		setLabel(gbl, gbc, "Buying date");
		setTextField(gbl, gbc);
		
		// Set Expire label and text field
		setLabel(gbl, gbc, "Expire");
		setTextField(gbl, gbc);
		
		// Set Details label and text field
		setLabel(gbl, gbc, "Details");
		setTextField(gbl, gbc);
		
		
	 }	
	}
