import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//Best examples of AnonymousInnercls are actionlistener
public class K2AnonymousInner extends JFrame implements ActionListener{
	JButton b1=new JButton("Button #1");
	JButton b2=new JButton("Button #2");
	JButton b3=new JButton("Button #3");
	
	K2AnonymousInner(){
		b1.setBounds(100, 100, 100, 100);
		b2.setBounds(200, 100, 100, 100);
		b3.setBounds(300, 100, 100, 100);
		
		b1.setFocusable(false);
		b2.setFocusable(false);
		b3.setFocusable(false);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("You pressed Button #1");
				
			}
		});
	b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("You pressed Button #2");
				
			}
		});
	b3.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("You pressed Button #3");
			
		}
	});
		
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLayout(null);
		this.setDefaultCloseOperation(3);
		this.setLocationRelativeTo(null);
		this.add(b1);		this.add(b2);		this.add(b3);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
