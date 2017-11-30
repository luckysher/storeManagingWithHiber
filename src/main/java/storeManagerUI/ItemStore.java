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
		
		//this.setFont(new Font("SansSerif", Font.BOLD, 14));
	
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 0.0;
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		JLabel formLabel = new JLabel("Item store form", JLabel.CENTER);
		formLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
		addComponent(gbl, gbc, formLabel);

		gbc.weightx = 1.0;
		gbc.gridwidth = GridBagConstraints.RELATIVE;
		JLabel nameLabel = new JLabel("Name", JLabel.CENTER);
		nameLabel.setFont(new Font("SansSerif", Font.BOLD, 12));
		addComponent(gbl, gbc, nameLabel);
		
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		JTextField namefield = new JTextField();
		addComponent(gbl, gbc, namefield);
	
		gbc.gridwidth = GridBagConstraints.RELATIVE;
		JLabel priceLabel = new JLabel("Price", JLabel.CENTER);
		priceLabel.setFont(new Font("SansSerif", Font.BOLD, 12));
		addComponent(gbl, gbc, priceLabel);
		
		
		
				
		
	
	 }	
	}
