package storeManagerUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ItemStore extends JPanel {
	
	public void addComponent(GridBagLayout gbl, GridBagConstraints gbc, Component comp){
		gbl.setConstraints(comp, gbc);
		add(comp);
	}
	
	public ItemStore(){		
		GridBagLayout gbl = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		this.setLayout(gbl);
		
	
	 }	
	}
