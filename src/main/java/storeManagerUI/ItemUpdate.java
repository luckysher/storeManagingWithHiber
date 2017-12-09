package storeManagerUI;




public class ItemUpdate extends JPanel implements ActionListener, ItemListener{
		LogFactory logger;
		StoreManager storeManager;
			
		JTextField namefield;
		JTextField idfield;
		Boolean expired;
		JCheckBox expCheck;
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
		this.expCheck.addItemListener(this);
		this.idfield.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void changedUpdate(DocumentEvent vent) {searchAndSetValues();}

			@Override
			public void insertUpdate(DocumentEvent arg0) {
				try{
					searchAndSetValues();				
				}catch(Exception e){
					logger.info("Exception :%s ", e);
					e.printStackTrace();
				}
			}

			@Override
			public void removeUpdate(DocumentEvent arg0) {searchAndSetValues();}
		});
	
public void showValidationMessage(){
	   String mesg = "This field can not be blank.";
	   JOptionPane.showMessageDialog(this, mesg, "error", JOptionPane.ERROR_MESSAGE);
    }
	public void showValidationMessage(String message){
      JOptionPane.showMessageDialog(this, message, "error", JOptionPane.ERROR_MESSAGE);
   }
   
   public Boolean validateFormData(){
	   if (this.namefield.getText().trim().equals("") || this.namefield.getText().trim().length() < 3 ){
		   this.showValidationMessage("Not a valid storage name: '" + this.namefield.getText().trim() + "'" );
		   return false;
	   }
	   if (this.pricefield.getText().trim().equals("") || Integer.parseInt(this.pricefield.getText().trim()) < 0 ){
		   this.showValidationMessage("Not a valid storage price: '" + this.pricefield.getText().trim() + "'" );
		   return false;
	   }
	   
	   System.out.println("Buydate: " +  StorageUiUtils.parseDate(this.buydatefield.getText().trim()));
	   if (this.buydatefield.getText().trim().equals("") || StorageUiUtils.parseDate(this.buydatefield.getText().trim()) == null){
		   this.showValidationMessage("Not a valid date: '" + this.buydatefield.getText().trim() + "'" );
		   return false;
	   }
	   // means form contains valid field values
	   return true;
   }
	 //fun for clearing fields values
    public void clearForm(){
		   this.namefield.setText("");
		   this.pricefield.setText("");
		   this.detailsfield.setText("Clear text test");
		   this.expCheck.setSelected(false);
		   this.buydatefield.setText("");
	   }
	 //fun for setting update Item form values
    public void setFormValues(Item item){		   
    	   this.namefield.setText(item.getName());
		   this.pricefield.setText(new Integer(item.getPrice()).toString());		   
		   this.expCheck.setSelected(item.getExpire());
		   this.buydatefield.setText(item.getBuyingdate().toString().replace("00:00:00.0", ""));
		   this.detailsfield.setText(item.getDetails());
	   }
	public void updateItemInfo(){		
		this.storeManager.addStorage(this.namefield.getText().trim(), Integer.parseInt(this.pricefield.getText().trim()), this.buydatefield.getText().trim(), this.expired, this.detailsfield.getText().trim());	
		JOptionPane.showMessageDialog(this, "Storage Item saved", "Info", JOptionPane.INFORMATION_MESSAGE);
	}	
	@Override
	public void actionPerformed(ActionEvent ae) {
		String command = ae.getActionCommand();
		if(command == "Update info"){
			this.updateItemInfo();
			}	
		}
	
	}
