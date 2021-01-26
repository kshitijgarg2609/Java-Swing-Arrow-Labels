package com.kgprojects.module.arrowlabels.panel;

import java.awt.*;
import javax.swing.*;
public class TaggedPanel extends JPanel
{
	public JLabel tag = new JLabel("",SwingConstants.CENTER);
	public TaggedPanel(int x,int y,int w,int h,int b,Color c1,int l,String txt)
	{
		super();
		setBounds(x,y,w,h);
		setBorder(BorderFactory.createLineBorder(c1,b));
		setLayout(null);
		tag.setBounds(x,getY()-20,l,20);
		tag.setOpaque(true);
		tag.setBackground(c1);
		tag.setText(txt);
	}
}
