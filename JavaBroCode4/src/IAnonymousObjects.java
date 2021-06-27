import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class IAnonymousObjects {

	public static void main(String[] args) {
		JFrame frame=new JFrame();
		ArrayList<JLabel> deck=new ArrayList<>();
		
		/*ImageIcon AC=new ImageIcon("cards\\1.png");
		JLabel AClabel=new JLabel();
		AClabel.setIcon(AC);
		
		deck.add(AClabel);
		frame.add(deck.get(0));*/
		//ABOVE /**/ code should be written 52 times..SO INSTEAD
		frame.setVisible(true);
		frame.setLayout(new FlowLayout());
		frame.setSize(1000,1000);
		frame.setDefaultCloseOperation(3);
		frame.setLocationRelativeTo(null);
		for(int i=1;i<=4;i++) {
	
			deck.add(new JLabel(new ImageIcon("PlayingCards\\"+i+".png")));
			frame.add(deck.get(i-1));
		}
		frame.pack();
		
		

	}

}
