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
	
	}
