package storeManagerUI;

import java.awt.Color;
import java.awt.Insets;

import javax.swing.JPanel;

import utils.StorageUiUtils;

public class Container extends JPanel {

	public Container(){
		this.setBackground(Color.pink);		
	}
	@Override
	public Insets getInsets() {
		return new Insets(0, 200, StorageUiUtils.getSceenSize().height, StorageUiUtils.getSceenSize().width);
	}
}
