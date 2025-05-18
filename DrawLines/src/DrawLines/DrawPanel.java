package DrawLines;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class DrawPanel extends JPanel {
	public static final int PANEL_POSITION_X=0;
	public static final int PANEL_POSITION_Y=120;
	public static final int PANEL_SIZE_Y=200;
	
	public ArrayList<Line> linesToDraw= new ArrayList<Line>();
	
	public DrawPanel() {
		setBounds(PANEL_POSITION_X,PANEL_POSITION_Y,ExampleFrame.FRAME_SIZE_X,PANEL_SIZE_Y);
		setBackground(Color.WHITE);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(Line l :linesToDraw) {
			g.drawLine(l.getStartY(), l.getStartY(), l.getEndX(), l.getEndY());
		}
	}
}
