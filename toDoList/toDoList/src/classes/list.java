package classes;

import java.awt.*;
import javax.swing.*;

public class list extends JPanel{
	list(){
		GridLayout layout = new GridLayout(10, 1);
		layout.setVgap(5);
		
		this.setLayout(layout);
		this.setBackground(Color.darkGray);
	}
	public void updateNum() {
		Component[] listItems = this.getComponents();
		
		for(int i = 0; i< listItems.length; i++) {
			if(listItems[i] instanceof task) {
				((task)listItems[i]).changeIndex(i+1);
			}
		}
	}
}
