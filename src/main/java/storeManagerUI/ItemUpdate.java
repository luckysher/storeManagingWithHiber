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
	
		
	}
