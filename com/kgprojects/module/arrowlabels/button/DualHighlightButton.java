package com.kgprojects.module.arrowlabels.button;

import java.awt.*;
import javax.swing.*;
import com.kgprojects.module.arrowlabels.util.*;
public class DualHighlightButton extends JLabel
{
	public JLabel cen = new JLabel("",SwingConstants.CENTER);
	public HighlightButton h1,h2;
	boolean h_ori=true;
	public DualHighlightButton(int w,int h,int b,int l,boolean horz,Color c1,Color c2,String txt1,String txt2)
	{
		super();
		h1 = new HighlightButton(w,h,b,c1,c2,txt1);
		h2 = new HighlightButton(w,h,b,c1,c2,txt2);
		h_ori=horz;
		if(horz)
		{
			setSize((2*w)+l,h);
			h1.setLocation(0,0);
			cen.setOpaque(true);
			cen.setBounds(w,0,l,h);
			h2.setLocation(w+l,0);
		}
		else
		{
			setSize(w,(2*h)+l);
			h1.setLocation(0,0);
			cen.setOpaque(true);
			cen.setBounds(0,h,w,l);
			h2.setLocation(0,h+l);
		}
		add(h1);
		add(cen);
		add(h2);
	}
	public DualHighlightButton(int w,int h,int b,int l,boolean horz,Color c1,Color c2,Color c3,String txt1,String txt2)
	{
		super();
		h1 = new HighlightButton(w,h,b,c1,c2,c3,txt1);
		h2 = new HighlightButton(w,h,b,c1,c2,c3,txt2);
		h_ori=horz;
		if(horz)
		{
			setSize((2*w)+l,h);
			h1.setLocation(0,0);
			cen.setOpaque(true);
			cen.setBounds(w,0,l,h);
			h2.setLocation(w+l,0);
		}
		else
		{
			setSize(w,(2*h)+l);
			h1.setLocation(0,0);
			cen.setOpaque(true);
			cen.setBounds(0,h,w,l);
			h2.setLocation(0,h+l);
		}
		add(h1);
		add(cen);
		add(h2);
	}
	public JLabel get3Tab(Color c1,Color c2,String txt1,String txt2,String txt3)
	{
		JLabel tag = new JLabel();
		JLabel t1 = new JLabel((h_ori?txt1:UITextGenerator.getVerticalText(txt1)),SwingConstants.CENTER);
		JLabel t2 = new JLabel((h_ori?txt2:UITextGenerator.getVerticalText(txt2)),SwingConstants.CENTER);
		JLabel t3 = new JLabel((h_ori?txt3:UITextGenerator.getVerticalText(txt3)),SwingConstants.CENTER);
		if(h_ori)
		{
			int h=15;
			tag.setBounds(getX(),getY()-h-4,getWidth(),h);
			t1.setBounds(0,0,h1.getWidth(),h);
			t2.setBounds(h1.getWidth(),0,cen.getWidth(),h);
			t3.setBounds(h1.getWidth()+cen.getWidth(),0,h2.getWidth(),h);
		}
		else
		{
			int w=15;
			tag.setBounds(getX()-w-4,getY(),w,getHeight());
			t1.setBounds(0,0,w,h1.getHeight());
			t2.setBounds(0,h1.getHeight(),w,cen.getHeight());
			t3.setBounds(0,h1.getHeight()+cen.getHeight(),w,h2.getHeight());
		}
		t1.setOpaque(true);
		t1.setBackground(c1);
		t2.setOpaque(true);
		t2.setBackground(c2);
		t3.setOpaque(true);
		t3.setBackground(c1);
		tag.add(t1);
		tag.add(t2);
		tag.add(t3);
		return tag;
	}
	public JLabel getVerticalLeftTag(Color c1,String txt)
	{
		JLabel t1 = new JLabel(UITextGenerator.getVerticalText(txt),SwingConstants.CENTER);
		if(!h_ori)
		{
			int w=15;
			t1.setBounds(getX()-w-4,getY()-4,w,getHeight()+(2*4));
			t1.setOpaque(true);
			t1.setBackground(c1);
			return t1;
		}
		return null;
	}
	public JLabel getVerticalUpTag(Color c1,String txt)
	{
		JLabel t2 = new JLabel(txt,SwingConstants.CENTER);
		if(!h_ori)
		{
			int w=15;
			t2.setBounds(getX()-w-4,getY()-w-4,w+getWidth()+4,w);
			t2.setOpaque(true);
			t2.setBackground(c1);
			return t2;
		}
		return null;
	}
	public JLabel getVerticalDownTag(Color c1,String txt)
	{
		JLabel t3 = new JLabel(txt,SwingConstants.CENTER);
		if(!h_ori)
		{
			int w=15;
			t3.setBounds(getX()-w-4,getY()+getHeight()+4,w+getWidth()+4,w);
			t3.setOpaque(true);
			t3.setBackground(c1);
			return t3;
		}
		return null;
	}
}
