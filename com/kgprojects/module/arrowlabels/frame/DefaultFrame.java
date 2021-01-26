package com.kgprojects.module.arrowlabels.frame;

import javax.swing.*;
import com.kgprojects.module.arrowlabels.util.*;
public class DefaultFrame extends JFrame
{
	public DefaultFrame(String a)
	{
		this(a,800,600);
	}
	public DefaultFrame(String a,int w,int h)
	{
		super(a);
		setBounds(CenterRectangle.getScreenRectangle(w,h));
		setResizable(false);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void ready()
	{
		setVisible(true);
		repaint();
		refresh();
	}
	public void refresh()
	{
		revalidate();
		requestFocus();
	}
}
