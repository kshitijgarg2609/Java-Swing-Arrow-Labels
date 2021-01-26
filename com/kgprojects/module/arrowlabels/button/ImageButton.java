package com.kgprojects.module.arrowlabels.button;

import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.swing.*;
import com.kgprojects.module.arrowlabels.util.*;
public class ImageButton extends JLabel
{
	public JLabel img = new JLabel("",SwingConstants.CENTER);
	public ImageButton(File a,int w,int h,int b)
	{
		setSize(w,h);
		setOpaque(true);
		img.setOpaque(true);
		img.setBounds(CenterRectangle.getInnerRectangle(w,h,b));
		setImageIcon(ImageLoader.loadImage(a,img.getWidth(),img.getHeight()));
		add(img);
	}
	public ImageButton(BufferedImage a,int w,int h,int b)
	{
		setSize(w,h);
		setOpaque(true);
		img.setOpaque(true);
		img.setBounds(CenterRectangle.getInnerRectangle(w,h,b));
		setImageIcon(ImageLoader.scaledImage(a,img.getWidth(),img.getHeight()));
		//img.setIcon(new ImageIcon());
		add(img);
	}
	public ImageButton(int w,int h,int b)
	{
		super("",SwingConstants.CENTER);
		setSize(w,h);
		setOpaque(true);
		img.setBounds(CenterRectangle.getInnerRectangle(w,h,b));
		img.setOpaque(true);
		img.setBackground(Color.GREEN);
		add(img);
	}
	public void setImageIcon(BufferedImage a)
	{
		img.setIcon(new ImageIcon(a));
	}
}
