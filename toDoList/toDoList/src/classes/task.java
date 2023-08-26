package classes;

import java.awt.*;

import javax.swing.*;

public class task extends JPanel{
	
	private JLabel index;
	private JTextField name;
	private JButton done;
	
	private boolean checked;
	
	
	task(){
		this.setPreferredSize(new Dimension(20, 40));
		this.setBackground(Color.gray);
		this.setLayout(new BorderLayout());
		
		index = new JLabel("");
		index.setPreferredSize(new Dimension(20, 20));
		index.setHorizontalAlignment(JLabel.CENTER);
		
		checked = false;
		
		this.add(index, BorderLayout.WEST);
		
		name = new JTextField("Your task here");
		name.setBorder(BorderFactory.createEmptyBorder());
		name.setBackground(Color.magenta);
		
		this.add(name, BorderLayout.CENTER);
		
		done = new JButton("Done");
		done.setPreferredSize(new Dimension(40, 20));
		done.setBorder(BorderFactory.createEmptyBorder());
		
		this.add(done, BorderLayout.EAST);
	}
	public void changeIndex(int num) {
		this.index.setText(num+"");
		this.revalidate();
	}
	public void changeState() {
		this.setBackground(Color.gray);
		name.setBackground(Color.gray);
		checked = true;
	}
	public JButton getDone() {
		return done;
	}
	public boolean isChecked() {
        return checked;
    }
	
}
