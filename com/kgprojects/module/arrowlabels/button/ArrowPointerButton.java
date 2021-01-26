package com.kgprojects.module.arrowlabels.button;

import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.swing.*;
import com.kgprojects.module.arrowlabels.util.*;
public class ArrowPointerButton extends JPanel
{
	File basic_ff=null;
	BufferedImage blank_arrow=null;
	BufferedImage left_arrow=null;
	BufferedImage right_arrow=null;
	BufferedImage forward_arrow=null;
	BufferedImage backward_arrow=null;
	
	HighlightButton cen;
	HighlightButton left;
	HighlightButton right;
	HighlightButton forward;
	HighlightButton backward;
	
	int stat=0;
	public ArrowPointerButton(int s,int b,Color c1,Color c2,Color c3,String txt1,String txt2,String txt3,String txt4)
	{
		super();
		setLayout(null);
		
		basic_ff = new File(System.getProperty("user.dir"),"img");
		blank_arrow=ImageLoader.loadImage(new File(basic_ff,"blank_arrow.jpg"));
		
		cen=new HighlightButton(blank_arrow,s,s,b,c1,c2);
		cen.setLocation(s,s);
		left=new HighlightButton(s,s,b,c1,c2,c3,txt1);
		left.setLocation(0,s);
		right=new HighlightButton(s,s,b,c1,c2,c3,txt2);
		right.setLocation((2*s),s);
		forward=new HighlightButton(s,s,b,c1,c2,c3,txt3);
		forward.setLocation(s,0);
		backward=new HighlightButton(s,s,b,c1,c2,c3,txt4);
		backward.setLocation(s,(2*s));
		
		setSize((3*s),(3*s));
		add(cen);
		add(left);
		add(right);
		add(forward);
		add(backward);
		
		blank_arrow=ImageLoader.scaledImage(blank_arrow,cen.img.getWidth(),cen.img.getHeight());
		left_arrow=ImageLoader.loadImage(new File(basic_ff,"left_arrow.jpg"),cen.img.getWidth(),cen.img.getHeight());
		right_arrow=ImageLoader.loadImage(new File(basic_ff,"right_arrow.jpg"),cen.img.getWidth(),cen.img.getHeight());
		forward_arrow=ImageLoader.loadImage(new File(basic_ff,"forward_arrow.jpg"),cen.img.getWidth(),cen.img.getHeight());
		backward_arrow=ImageLoader.loadImage(new File(basic_ff,"backward_arrow.jpg"),cen.img.getWidth(),cen.img.getHeight());
		
	}
	
	public void highlight(int a)
	{
		if(a==stat)
		{
			return;
		}
		stat=a;
		if(stat==0)
		{
			cen.setImageIcon(blank_arrow);
			cen.highlight(false);
			left.highlight(false);
			right.highlight(false);
			forward.highlight(false);
			backward.highlight(false);
		}
		else if(stat==1)
		{
			cen.setImageIcon(left_arrow);
			cen.highlight(true);
			left.highlight(true);
			right.highlight(false);
			forward.highlight(false);
			backward.highlight(false);
		}
		else if(stat==2)
		{
			cen.setImageIcon(right_arrow);
			cen.highlight(true);
			left.highlight(false);
			right.highlight(true);
			forward.highlight(false);
			backward.highlight(false);
		}
		else if(stat==3)
		{
			cen.setImageIcon(forward_arrow);
			cen.highlight(true);
			left.highlight(false);
			right.highlight(false);
			forward.highlight(true);
			backward.highlight(false);
		}
		else if(stat==4)
		{
			cen.setImageIcon(backward_arrow);
			cen.highlight(true);
			left.highlight(false);
			right.highlight(false);
			forward.highlight(false);
			backward.highlight(true);
		}
	}
	
	public void highlightBlank()
	{
		highlight(0);
	}
	
	public void highlightLeft()
	{
		highlight(1);
	}
	
	public void highlightRight()
	{
		highlight(2);
	}
	
	public void highlightForward()
	{
		highlight(3);
	}
	
	public void highlightBackward()
	{
		highlight(4);
	}
}
