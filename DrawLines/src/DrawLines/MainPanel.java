package DrawLines;

import javax.swing.JPanel;

public class MainPanel extends JPanel {
	public static final int PANEL_POSITION_X=0;
	public static final int PANEL_POSITION_Y=0;
	public static final int PANEL_SIZE_Y=120;
	
	public MainPanel() {
		setBounds(0,0,ExampleFrame.FRAME_SIZE_X,PANEL_SIZE_Y);
		setLayout(null);
	}
}
