package storeManagerUI;




public class ItemUpdate extends JPanel implements ActionListener, ItemListener {
		JTextField namefield;
		JTextField idfield;
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
		
	public ItemUpdate(){		
		GridBagLayout gbl = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();		
		this.setLayout(gbl);   
			
		//set main heading
		setToolTipText("Update Item form");

		addTopHeading(gbl, gbc, "Update Item Form");
		
		// Set Id label and text field
		setLabel(gbl, gbc, "Id");
		this.idfield = setTextField(gbl, gbc);
			
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
		
		
	}
