
package makeshapes;


import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

public class CompositeMain extends JPanel {

	public static JFrame frame;
	public Graphics g2 = getGraphics(); ;
	
	public CompositeMain() {

		JButton btnRect = new JButton("quadrilateral");
		btnRect.setBounds(51, 402, 120, 23);
		btnRect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Chouturvuj quad = new Chouturvuj();
				quad.setX1(200);
                                quad.setY1(130);
				quad.setX2(500);
                                quad.setY2(130);
				quad.setX3(500);
                                quad.setY3(300);
				quad.setX4(200);
                                quad.setY4(300);
				
				quad.draw(getGraphics());
			}
		});
		frame.add(btnRect);
		
		JButton btnFlag = new JButton("FLAG");
		btnFlag.setBounds(210, 402, 120, 23);
		btnFlag.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Flag flag = new Flag();
				flag.setX1(200);		
                                flag.setY1(130);
				flag.setX2(500);		
                                flag.setY2(130);
				flag.setX3(500);		
                                flag.setY3(300);
				flag.setX4(200);		
                                flag.setY4(300);
				
				flag.draw(getGraphics());
                                
			}
		});
		frame.add(btnFlag);
		
		JButton btnCircle = new JButton("CIRCLE");
		btnCircle.setBounds(357, 402, 120, 23);
		btnCircle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x, y;
				x = 300 ;
				y = 200 ;
				Circle circle = new Circle(x, y, 100);
				circle.draw(getGraphics());
			}
		});
		frame.add(btnCircle);
		
		JButton btnLine = new JButton("LINE");
		btnLine.setBounds(512, 402, 120, 23);
		btnLine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				Line line = new Line(20,100,400,200);
				line.draw(getGraphics());
			}
		});
		frame.add(btnLine);
		

	}
	
	public static void main(String[] args) {
	    JFrame.setDefaultLookAndFeelDecorated(true);
	    frame = new JFrame("Composite Pattern");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(750, 550);
	 
	    CompositeMain panel = new CompositeMain();
	 
	    frame.getContentPane().add(panel);
	 
	    frame.setVisible(true);
	  }
}
