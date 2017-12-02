package storeManagerUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import utils.StorageUiUtils;


/*
 * Class for StoreManager User Interface
*/

public class StoreManUI {
	
	String storeUITitle = null;
	
	// constructor for the store manager UI
	public StoreManUI(String title){
		this.storeUITitle = title;
	}
	// Return Instace of store manager UI
	public JFrame getStoreUI(){
		JFrame storeUI = new JFrame(this.storeUITitle);
				return storeUI;
	}
		
	
}
