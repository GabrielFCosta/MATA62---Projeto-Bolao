package views;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class TelaAdministrador extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3038095236283380438L;

	public TelaAdministrador(String usuario) {
		setLocation(new Point(600, 220));
		getContentPane().setLayout(null);
		
		this.setSize(320,240);
        this.setResizable(false);
        this.setTitle("Administrador: "+usuario);
	
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
