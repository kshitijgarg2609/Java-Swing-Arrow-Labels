package com.kgprojects.module.arrowlabels.button;

import java.awt.*;
public class StatusToggleButton extends ImageButton
{
	Color cl,op,bg,fg;
	boolean sw=true;
	boolean tsw=true;
	public StatusToggleButton(int w,int h,int b,Color c1,Color c2,Color i_bg,Color i_fg,String txt)
	{
		super(w,h,b);
		cl=c1;
		op=c2;
		bg=i_bg;
		fg=i_fg;
		img.setText(txt);
		highlight(false);
		toggle(false);
	}
	public void switchColor()
	{
		highlight(!sw);
	}
	public void highlight(boolean a)
	{
		if(a==sw)
		{
			return;
		}
		sw=a;
		setBackground((a?op:cl));
	}
	public void switchToggle()
	{
		toggle(!tsw);
	}
	public void toggle(boolean a)
	{
		if(a==tsw)
		{
			return;
		}
		tsw=a;
		img.setBackground(a?fg:bg);
		img.setForeground(a?bg:fg);
	}
}
