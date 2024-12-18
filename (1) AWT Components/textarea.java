import java.awt.*;
import java.applet.*;

public class textarea extends Applet {
	
	TextArea ta, ta2;
	
	public void init() {

		/* TextArea Constructors:
		 * TextArea ta = new TextArea();
		 * TextArea ta = new TextArea("This is a TextArea. Mainly used for multiline content.");
		 * TextArea ta = new TextArea("This is a TextArea. Mainly used for multiline content.", 10, 100);
		*/
		String str = "'Nothing fears the man who doesn't fear death' \n-- innovator";

		ta = new TextArea("This is a TextArea. Mainly used for multiline content.", 10, 100, TextArea.SCROLLBARS_BOTH);
		ta2 = new TextArea(str);
		
		/* TextArea Scrollbar Constants:
		 * SCROLLBARS_NONE
		 * SCROLLBARS_BOTH
		 * SCROLLBARS_VERTICAL_ONLY
		 * SCROLLBARS_HORIZONTAL_ONLY
		*/
		
		//ta.setEditable(true);
		
		ta.setText("Hello chat. It's a me! Mario! ");
		ta.append("Trynna append some text here.");
		ta.insert("lorem ipsum", 5);
		ta.replaceRange("hi there ", 0, 5);
		
		add(ta);
		add(ta2);
		
	}
	
	public void paint(Graphics g){
		g.drawString(ta.getText(), 50, 200);
	}
	
}

/*
	<applet code="textarea.class" width=300 height=300>
	</applet>
*/