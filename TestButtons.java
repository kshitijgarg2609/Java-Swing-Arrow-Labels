import java.awt.*;
import java.awt.event.*;
import java.io.*;
import com.kgprojects.module.arrowlabels.button.*;
import com.kgprojects.module.arrowlabels.frame.*;
import com.kgprojects.module.arrowlabels.panel.*;
import com.kgprojects.module.arrowlabels.util.*;
class TestButtons
{
	static boolean flg=true;
	TestButtons()
	{
		//testframe();
	}
	void testframe()
	{
		DefaultFrame df = new DefaultFrame("test");
		File ff = new File((new File((new File(System.getProperty("user.dir"))),"img")),"left_arrow.jpg");
		HighlightButton hb = new HighlightButton(ff,40,40,12,Color.YELLOW,Color.CYAN);
		//HighlightButton hb = new HighlightButton(40,40,12,Color.GREEN,Color.RED);
		hb.setLocation(40,40);
		df.add(hb);
		df.ready();
	}
	void testdhb()
	{
		DefaultFrame df = new DefaultFrame("test");
		File ff = new File((new File((new File(System.getProperty("user.dir"))),"img")),"left_arrow.jpg");
		DualHighlightButton db = new DualHighlightButton(40,40,12,80,false,Color.YELLOW,Color.CYAN,Color.RED,"A","D");
		db.cen.setBackground(Color.BLUE);
		//HighlightButton hb = new HighlightButton(40,40,12,Color.YELLOW,Color.CYAN);
		//HighlightButton hb = new HighlightButton(40,40,12,Color.GREEN,Color.RED);
		db.setLocation(40,40);
		df.add(db);
		df.ready();
	}
	void testdhb2()
	{
		DefaultFrame df = new DefaultFrame("test");
		File ff = new File((new File((new File(System.getProperty("user.dir"))),"img")),"left_arrow.jpg");
		DualHighlightButton db = new DualHighlightButton(40,40,12,80,false,Color.YELLOW,Color.CYAN,Color.RED,"A","D");
		db.cen.setBackground(Color.BLUE);
		//HighlightButton hb = new HighlightButton(40,40,12,Color.YELLOW,Color.CYAN);
		//HighlightButton hb = new HighlightButton(40,40,12,Color.GREEN,Color.RED);
		db.setLocation(140,80);
		df.add(db);
		df.add(db.get3Tab(Color.CYAN,Color.YELLOW,"forward","vertical arm","backward"));
		df.ready();
	}
	void testdhb3()
	{
		DefaultFrame df = new DefaultFrame("test");
		File ff = new File((new File((new File(System.getProperty("user.dir"))),"img")),"left_arrow.jpg");
		DualHighlightButton db = new DualHighlightButton(40,40,12,80,false,Color.YELLOW,Color.CYAN,Color.RED,"A","D");
		db.cen.setBackground(Color.BLUE);
		//HighlightButton hb = new HighlightButton(40,40,12,Color.YELLOW,Color.CYAN);
		//HighlightButton hb = new HighlightButton(40,40,12,Color.GREEN,Color.RED);
		db.setLocation(140,80);
		df.add(db);
		//df.add(db.get3Tab(Color.CYAN,Color.YELLOW,"forward","vertical arm","backward"));
		df.add(db.getVerticalLeftTag(Color.GREEN,"vertical"));
		df.add(db.getVerticalUpTag(Color.CYAN,"test1"));
		df.add(db.getVerticalDownTag(Color.CYAN,"test1"));
		df.ready();
	}
	void testapb()
	{
		DefaultFrame df = new DefaultFrame("test");
		//File ff = new File((new File((new File(System.getProperty("user.dir"))),"img")),"left_arrow.jpg");
		//DualHighlightButton db = new DualHighlightButton(40,40,12,80,false,Color.YELLOW,Color.CYAN,Color.RED,"A","D");
		//db.cen.setBackground(Color.BLUE);
		//HighlightButton hb = new HighlightButton(40,40,12,Color.YELLOW,Color.CYAN);
		//HighlightButton hb = new HighlightButton(40,40,12,Color.GREEN,Color.RED);
		
		ArrowPointerButton db = new ArrowPointerButton(40,12,Color.YELLOW,Color.BLUE,Color.GREEN,"A","D","W","S");
		db.setLocation(40,40);
		df.add(db);
		df.addKeyListener(new KeyListener()
		{
			public void keyPressed(KeyEvent e)
			{
				if(flg==true)
				{
					return;
				}
				if(e.getKeyCode()==KeyEvent.VK_A)
				{
					db.highlightLeft();
				}
				else if(e.getKeyCode()==KeyEvent.VK_D)
				{
					db.highlightRight();
				}
				else if(e.getKeyCode()==KeyEvent.VK_W)
				{
					db.highlightForward();
				}
				else if(e.getKeyCode()==KeyEvent.VK_S)
				{
					db.highlightBackward();
				}
				flg=true;
			}
			public void keyReleased(KeyEvent e)
			{
				db.highlightBlank();
				flg=false;
			}
			public void keyTyped(KeyEvent e)
			{
			}
		}
		);
		
		df.ready();
	}
	void teststb()
	{
		DefaultFrame df = new DefaultFrame("test");
		//File ff = new File((new File((new File(System.getProperty("user.dir"))),"img")),"left_arrow.jpg");
		//DualHighlightButton db = new DualHighlightButton(40,40,12,80,false,Color.YELLOW,Color.CYAN,Color.RED,"A","D");
		//db.cen.setBackground(Color.BLUE);
		//HighlightButton hb = new HighlightButton(40,40,12,Color.YELLOW,Color.CYAN);
		//HighlightButton hb = new HighlightButton(40,40,12,Color.GREEN,Color.RED);
		
		StatusToggleButton db = new StatusToggleButton(40,40,12,Color.YELLOW,Color.CYAN,Color.GREEN,Color.RED,"A");
		db.setLocation(40,40);
		df.add(db);
		df.addKeyListener(new KeyListener()
		{
			public void keyPressed(KeyEvent e)
			{
				if(flg==true)
				{
					return;
				}
				if(e.getKeyCode()==KeyEvent.VK_A)
				{
					db.toggle(true);
					db.switchColor();
				}
				flg=true;
			}
			public void keyReleased(KeyEvent e)
			{
				if(e.getKeyCode()==KeyEvent.VK_A)
				{
					db.toggle(false);
				}
				flg=false;
			}
			public void keyTyped(KeyEvent e)
			{
			}
		}
		);
		
		df.ready();
	}
	void testtp()
	{
		DefaultFrame df = new DefaultFrame("test");
		TaggedPanel db = new TaggedPanel(50,70,700,300,5,Color.YELLOW,130,"Tested");
		//HighlightButton hb = new HighlightButton(40,40,12,Color.YELLOW,Color.CYAN);
		//HighlightButton hb = new HighlightButton(40,40,12,Color.GREEN,Color.RED);
		df.add(db);
		df.add(db.tag);
		df.ready();
	}
}
