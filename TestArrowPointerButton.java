import java.awt.*;
import com.kgprojects.module.arrowlabels.button.*;
import com.kgprojects.module.arrowlabels.frame.*;
class TestArrowPointerButton extends ArrowPointerButton
{
	DefaultFrame df;
	TestArrowPointerButton()
	{
		super(40,12,Color.YELLOW,Color.CYAN,Color.RED,"A","D","W","S");
		df = new DefaultFrame("test");
		setLocation(40,40);
		df.add(this);
		df.ready();
	}
}
