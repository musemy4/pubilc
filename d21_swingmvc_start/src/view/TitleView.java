package view;

import java.awt.Font;

import javax.swing.JLabel;

public class TitleView extends View {
	public TitleView() {
		display();
	}
	
	@Override
	void display() {
		JLabel title = new JLabel("::: MEMBER LIST :::");
		title.setFont(new Font("consolas",Font.BOLD,28));
		add(title);
	}
	

	@Override
	void evt() {}

}
