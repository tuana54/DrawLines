package DrawLines;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ExampleFrame extends JFrame implements ActionListener {
	public static final int FRAME_POSITION_X=0;
	public static final int FRAME_POSITION_Y=0;
	public static final int FRAME_SIZE_X=400;
	public static final int FRAME_SIZE_Y=380;
	
	public static final String FRAME_TITLE="F";
	
	public Random randNum=new Random();
	
	JButton btnaddLine;
	JTextField txtN;
	JTextField txtR;
	JLabel lblP;
	DrawPanel dr;
	
	int n=0;
	int r=0;
	
	public ExampleFrame(String title) {
		super(title);
		createComponents();
	}
	
	private void createComponents() {
		setLayout(null);
		MainPanel mainPanel=new MainPanel();
		add(mainPanel);
		
		dr=new DrawPanel();
		add(dr);
		
		btnaddLine=new JButton("Add Line");
		btnaddLine.setBounds(80, 10, btnaddLine.getPreferredSize().width, btnaddLine.getPreferredSize().height);
		mainPanel.add(btnaddLine);
		btnaddLine.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnaddLine) {
			int sX=randNum.nextInt(ExampleFrame.FRAME_SIZE_X);
			int sY=randNum.nextInt(DrawPanel.PANEL_SIZE_Y);
			int eX=randNum.nextInt(ExampleFrame.FRAME_SIZE_X);
			int eY=randNum.nextInt(DrawPanel.PANEL_SIZE_Y);
			
			dr.linesToDraw.add(new Line(sX,sY,eX,eY));
			dr.repaint();
			this.repaint();
		}
	}
	private int calculatePermutation(int n2,int r2) {
		int val=1;
		for(int i=0;i<r2;i++) {
			val *=(n2-i);
		}
		return val;
	}
}
