package classes;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class buttonPanel extends JPanel{
	private JButton addTask;
	private JButton clear;
	
	Border emptyBorder = BorderFactory.createEmptyBorder();
	
	buttonPanel(){
		this.setPreferredSize(new Dimension(400, 60));
		
		//this.setBackground(Color.cyan);
		addTask = new JButton("Add Task");
		clear = new JButton("Clear Completed Tasks");
		
		addTask.setBorder(emptyBorder);
		addTask.setFont(new Font("Sans-serif", Font.PLAIN, 20));
		
		clear.setBorder(emptyBorder);
		clear.setFont(new Font("Sans-serif", Font.PLAIN, 20));
		
		
		this.add(addTask);
		this.add(Box.createHorizontalStrut(20));
		this.add(clear);
		
	}
	
	public JButton getAddTask() {
		return addTask;
	}
	public JButton getClear() {
		return clear;
	}
}
