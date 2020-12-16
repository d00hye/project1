package mainFrame;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import valueObject.VUser;

public class Main {

	private PLoginDialog pLoginDialog;
	private PMainFrame pMainFrame;
	private ActionHandler actionHandler;
	
	private Toolkit toolkit;
	private Image img;
	
	public Main() {
		this.actionHandler = new ActionHandler();
		this.pLoginDialog = new PLoginDialog(actionHandler);
		this.pLoginDialog.setVisible(true);	
	}
	

	private void initialize() {
		this.pLoginDialog.initialize();
	}
	
	private void validateUser(String actionCommand) {
		VUser vUser = pLoginDialog.validateUser(actionCommand);
		if (vUser != null) {
			toolkit = Toolkit.getDefaultToolkit();
			img = toolkit.getImage("resources/icon.png");
			this.pMainFrame = new PMainFrame();
			this.pMainFrame.setVisible(true);
			this.pMainFrame.initialize(vUser);
			this.pMainFrame.setIconImage(img);
		}
		this.pLoginDialog.dispose();
	}
	
	
	public class ActionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			validateUser(event.getActionCommand());
		}		
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.initialize();		

	}
}