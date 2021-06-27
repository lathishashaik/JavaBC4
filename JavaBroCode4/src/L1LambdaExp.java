import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//How to use lambda exp:  (arguments)->{statement/s}
//Used for functional interface(the interface having only one abstract method)
//eg: ActionListener,Runnable,(or any user defined(next(L2)program)
public class L1LambdaExp extends JFrame implements ActionListener{
	JButton b1=new JButton("Button #1");
	
	
	L1LambdaExp(){
		b1.setBounds(200, 100, 100, 100);
		b1.setFocusable(false);
		
		
		b1.addActionListener((e)->{
									System.out.println("You pressed Button #1");
									System.out.println("Bye");
								});

		
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLayout(null);
		this.setDefaultCloseOperation(3);
		this.setLocationRelativeTo(null);
		this.add(b1);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


}
