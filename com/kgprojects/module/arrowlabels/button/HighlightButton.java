package com.kgprojects.module.arrowlabels.button;

import java.awt.*;
import java.awt.image.*;
import java.io.*;
import com.kgprojects.module.arrowlabels.util.*;
public class HighlightButton extends ImageButton
{
	Color cl,op;
	boolean sw=true;
	int type_switch=1;
	public HighlightButton(File a,int w,int h,int b,Color c1,Color c2)
	{
		super(a,w,h,b);
		type_switch=1;
		cl=c1;
		op=c2;
		highlight(false);
	}
	public HighlightButton(BufferedImage a,int w,int h,int b,Color c1,Color c2)
	{
		super(a,w,h,b);
		type_switch=1;
		cl=c1;
		op=c2;
		highlight(false);
	}
	public HighlightButton(Color c1,Color c2,int w,int h,int b)
	{
		super(w,h,b);
		type_switch=1;
		cl=c1;
		op=c2;
		highlight(false);
	}
	public HighlightButton(int w,int h,int b,Color c1,Color c2)
	{
		super(w,h,b);
		type_switch=2;
		cl=c1;
		op=c2;
		highlight(false);
	}
	public HighlightButton(int w,int h,int b,Color c1,Color c2,String txt)
	{
		super(w,h,b);
		type_switch=2;
		cl=c1;
		op=c2;
		img.setText(txt);
		highlight(false);
	}
	public HighlightButton(int w,int h,int b,Color c1,Color c2,Color c3,String txt)
	{
		super(w,h,b);
		type_switch=3;
		cl=c1;
		op=c3;
		img.setBackground(c2);
		img.setText(txt);
		highlight(false);
	}
	public void switchColor()
	{
		highlight(!sw);
	}
	public void highlight(boolean a)
	{
		if(sw==a)
		{
			return;
		}
		if(type_switch==1)
		{
			setBackground((a?op:cl));
			sw=a;
		}
		else if(type_switch==2)
		{
			setBackground((a?op:cl));
			img.setBackground((a?cl:op));
			sw=a;
		}
		else if(type_switch==3)
		{
			setBackground((a?op:cl));
			img.setForeground((a?cl:op));
			sw=a;
		}
	}
}
