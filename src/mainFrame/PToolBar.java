package mainFrame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToolBar;

import constants.Constants;

public class PToolBar extends JToolBar {
	private static final long serialVersionUID = 1L;
	
	private PinfoDialog pinfoDialog;
	
	public PToolBar() {		
		
		this.setLayout(new FlowLayout());

		ImageIcon img = new ImageIcon("resources/logo.png"); 
		JLabel imageLabel = new JLabel(img);
		this.add(imageLabel);
		
		int i=1;
		for (Constants.EToolBar eToolBar: Constants.EToolBar.values()) {
			String path = "resources/button" + i + ".jpg";
			ImageIcon icon = new ImageIcon(path);
			JButton buttonItem = new JButton(eToolBar.getText() , icon);
			this.add(buttonItem);
			i += 1;	
		
			 buttonItem.addActionListener( new ActionListener(){
		            
		            public void actionPerformed(ActionEvent e) {
		            	pinfoDialog = new PinfoDialog();
		            	pinfoDialog.setVisible(true);	
		            }
		            
		        });
		    }       
		}		
		
	public void initialize() {

	}
}
	
	

