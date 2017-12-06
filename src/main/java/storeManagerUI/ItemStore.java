package storeManagerUI;

import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;


public class ItemStore extends JPanel implements ActionListener, ItemListener {
		JTextField namefield;
		Boolean expired;
		JTextField buydatefield;
		JTextArea detailsfield;
		JTextField pricefield;
		
	public void addComponent(GridBagLayout gbl, GridBagConstraints gbc, Component comp){	
			gbl.setConstraints(comp, gbc);
			add(comp);
		}
	
	public void addTopHeading(GridBagLayout gbl, GridBagConstraints gbc, String heading){
		gbc.insets = new Insets(15, 0, 5, 0);	
		gbc.gridwidth = GridBagConstraints.REMAINDER;		
		gbc.weighty = 0.25;
		gbc.weightx = 0.25;		
		gbc.fill = GridBagConstraints.BOTH;
		JLabel formLabel = new JLabel(heading, JLabel.CENTER);
		formLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
		addComponent(gbl, gbc, formLabel);		
	}
	
	public void setLabel(GridBagLayout gbl, GridBagConstraints gbc, String lname){
		gbc.insets = new Insets(15, 50, 0, 20);	
		gbc.gridwidth = GridBagConstraints.RELATIVE;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.ipady = 1;		
		gbc.weighty = 0.02;
		gbc.weightx = 0.7;		
		JLabel label = new JLabel(lname, JLabel.RIGHT);
		label.setFont(new Font("SansSerif", Font.PLAIN, 16));				
		addComponent(gbl, gbc, label);		
	}
	
	public JTextField setTextField(GridBagLayout gbl, GridBagConstraints gbc){
		gbc.insets = new Insets(15, 15, 0, 350);
		gbc.gridwidth = GridBagConstraints.REMAINDER;		
		gbc.gridheight = 1;
		gbc.weighty = 0.03;
		gbc.weightx = 0.7;		
		gbc.fill = GridBagConstraints.BOTH;
	
		JTextField tfield = new JTextField();
		tfield.setFont(new Font("SansSerif", Font.PLAIN, 16));
		addComponent(gbl, gbc, tfield);
		return tfield;
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
		this.namefield = setTextField(gbl, gbc);
				
		// Set Name label and text field
		setLabel(gbl, gbc, "Price");
		this.pricefield = setTextField(gbl, gbc);
					
		// Set Buying label and text field
		setLabel(gbl, gbc, "Buying date");
		this.buydatefield = setTextField(gbl, gbc);
		
		// Set Expire label and text field
		setLabel(gbl, gbc, "Expire");	
		gbc.insets = new Insets(15, 15, 0, 50);
		gbc.gridwidth = GridBagConstraints.REMAINDER;		
		gbc.gridheight = 1;
		gbc.weighty = 0.03;
		gbc.weightx = 0.7;		
		gbc.fill = GridBagConstraints.BOTH;	
		JCheckBox expire = new JCheckBox();
		addComponent(gbl, gbc, expire);
			
		// Set Details label and text field
		gbc.insets = new Insets(15, 15, 0, 20);		
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridwidth = GridBagConstraints.RELATIVE;
		gbc.weighty = 0.05;
		JLabel label = new JLabel("Details", JLabel.RIGHT);
		label.setFont(new Font("SansSerif", Font.PLAIN, 16));				
		addComponent(gbl, gbc, label);
		
		gbc.insets = new Insets(15, 15, 0, 350);		
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.weighty = 0.07;		
		JTextArea tArea = new JTextArea(5, 10);
		tArea.setWrapStyleWord(true);
		tArea.setLineWrap(true);
		JScrollPane spane = new JScrollPane(tArea);		
		addComponent(gbl, gbc, spane);		
		
		gbc.insets = new Insets(15, 700, 200, 500);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridwidth = GridBagConstraints.CENTER;
		gbc.weighty = 0.04;		
		JButton button = new JButton("Store info");
		addComponent(gbl, gbc, button);
		button.addActionListener(this);
		expire.addItemListener(this);
	}
	
	public void saveItem(){		
		String name = this.namefield.getText();
		System.out.println("Name : " + name);
		System.out.println("Expired : " + this.expired);
	}
		
	@Override
	public void actionPerformed(ActionEvent ae) {
		String command = ae.getActionCommand();
		if(command == "Store info"){
			if (this.namefield.getText().equals("")){
				this.namefield.setBorder(arg0););
			}else{
					this.saveItem();
				}	
			}
		}

		
	}
