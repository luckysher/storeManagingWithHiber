package utils;

import java.awt.Dimension;
import java.awt.Toolkit;

public class StorageUiUtils {

	// get available width and height
	public static Dimension getSceenSize(){
		return Toolkit.getDefaultToolkit().getScreenSize();
	}
}
