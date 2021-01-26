package com.kgprojects.module.arrowlabels.util;

public class UITextGenerator
{
	public static String getVerticalText(String a)
	{
		String tmp="<html>";
		for(char c : a.toCharArray())
		{
			tmp+=c+"<br>";
		}
		return tmp+"</html>";
	}
	public static String underlineChar(String a)
	{
		return "<html><u>"+a+"</u></html>";
	}
	public static String underlineChar(String a,char b)
	{
		String tmp="<html>";
		boolean x=true;
		for(char c : a.toCharArray())
		{
			if(x&&(b==c))
			{
				tmp+="<u>"+c+"</u>";
				x=false;
				continue;
			}
			tmp+=c;
		}
		return tmp+"</html>";
	}
}
