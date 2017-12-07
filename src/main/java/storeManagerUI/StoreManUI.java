package storeManagerUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import service.StoreManager;
import utils.StorageUiUtils;

/*
 * Class for StoreManager User Interface
*/

public class StoreManUI {
	
	String storeUITitle = null;
	StoreManager storeManager;
	// constructor for the store manager UI
	public StoreManUI(String title){
		this.storeUITitle = title;
	}
		
	// Return Instace of store manager UI
	public JFrame getStoreUI(){
		JFrame storeUI = new JFrame(this.storeUITitle);
		//add to panel to container
		storeUI.add(new Container().add(this.getAllTabs()));
		
		storeUI.setSize(StorageUiUtils.getSceenSize());
		return storeUI;
	}
	
	//start showing store manager UI
	public boolean startUI(){
		this.getStoreUI().setVisible(true);
		return true;
	}
	
	// get all store manager tabs
	public JTabbedPane getAllTabs(){
		JTabbedPane stab = new JTabbedPane();
		stab.addTab("  	   Add        ", new ItemStore(new StoreManager()));
		stab.addTab("     Update      ", new ItemUpdate());
		stab.addTab("     Delete      ", new ItemUpdate());
		stab.addTab("      View       ", new ItemUpdate());
		stab.setFont(new Font("SansSerif", Font.ITALIC, 14));
		stab.setBackgroundAt(0, Color.PINK);
		stab.setBackgroundAt(1, Color.green);
		stab.setBackgroundAt(2, Color.ORANGE);
		stab.setBackgroundAt(3, Color.RED);
		
		return stab;
	}
	
}
