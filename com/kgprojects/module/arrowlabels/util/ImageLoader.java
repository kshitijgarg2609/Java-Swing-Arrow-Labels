package com.kgprojects.module.arrowlabels.util;

import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.imageio.*;
public class ImageLoader
{
	public static BufferedImage scaledImage(Image a,int w,int h)
	{
		BufferedImage b;
		Graphics2D g2;
		b=new BufferedImage(w,h,BufferedImage.TYPE_INT_ARGB);
		g2=b.createGraphics();
		g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g2.drawImage(a,0,0,w,h,null);
		g2.dispose();
		return b;
	}
	public static BufferedImage loadImage(File name)
	{
		BufferedImage icon;
		try
		{
			icon=ImageIO.read(name);
		}
		catch(Exception e)
		{
			return null;
		}
		return icon;
	}
	public static BufferedImage loadImage(File name,int w,int h)
	{
		BufferedImage icon;
		try
		{
			icon=ImageIO.read(name);
			icon=scaledImage(icon,w,h);
		}
		catch(Exception e)
		{
			return null;
		}
		return icon;
	}
	public static BufferedImage loadImage(String name)
	{
		return loadImage(new File(name));
	}
	public static BufferedImage loadImage(String name,int w,int h)
	{
		return loadImage(new File(name),w,h);
	}
}
