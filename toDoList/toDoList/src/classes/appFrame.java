package classes;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

public class appFrame extends JFrame{
	private list list;
	private titleBar title;
	private buttonPanel btnPanel;
	private JButton addTask;
	private JButton clear;
	appFrame(){
		this.setSize(400, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		list = new list();
		title = new titleBar();
		btnPanel = new buttonPanel();
		
		this.add(title, BorderLayout.NORTH);
		this.add(btnPanel, BorderLayout.SOUTH);
		this.add(list, BorderLayout.CENTER);
		
		addTask = btnPanel.getAddTask();
		clear = btnPanel.getClear();
		
		addListeners();
		
	}
	
	public void addListeners() {
		addTask.addMouseListener(new MouseAdapter() {
			//@override
			public void mousePressed(MouseEvent e) {
				task t = new task();
				list.add(t);
				list.updateNum();
				
				t.getDone().addMouseListener(new MouseAdapter() {
					//@override
					public void mousePressed(MouseEvent e) {
						t.changeState();
						revalidate();
					}
				});
				
				revalidate();
			}
		});
	}
}
