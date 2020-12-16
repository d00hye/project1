package mainFrame;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import constants.Constants.ELoginDialog;
import constants.Constants.ESetTitle;
import control.CLogin;
import control.CUser;
import mainFrame.Main.ActionHandler;
import valueObject.VLogin;
import valueObject.VUser;

public class PLoginDialog extends JDialog {
	//attributes
	private static final long serialVersionUID = 1L;

	//components
	private JLabel userIdLabel;
	private JLabel passwordLabel;
	private JLabel imageLabel;
	private JButton okButton;
	private JButton cancelButton;
	private JTextField UserIdTextField;
	private JPasswordField passwordTextField;
	
	private ImageIcon img;
	private String password;
	
	//control
	private CLogin cLogin;
	private CUser cUser;
		
	
	public PLoginDialog(ActionHandler actionHandler) {
		//attributes
		setTitle(ESetTitle.dialogTitle.getText());
		this.setSize(
				ELoginDialog.width.getInt(), 
				ELoginDialog.height.getInt());
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		
		this.setLayout(new FlowLayout());
		
		img = new ImageIcon("resources/dialog.png"); 
		imageLabel = new JLabel(img);
		this.add(imageLabel);
		
		Font font = new Font("Arial", Font.BOLD, 13);
		
		JPanel line1 = new JPanel();
		this.userIdLabel = new JLabel(ELoginDialog.nameLabel.getText());
		line1.add(this.userIdLabel);
		this.UserIdTextField = new JTextField(ELoginDialog.sizeNameText.getInt());
		line1.add(this.UserIdTextField);
		this.add(line1);
		
		JPanel line2 = new JPanel();
		this.passwordLabel = new JLabel(ELoginDialog.passwordLabel.getText());
		line2.add(this.passwordLabel);
		this.passwordTextField = new JPasswordField(ELoginDialog.sizePasswordText.getInt());
		passwordTextField.setEchoChar('*');
		line2.add(this.passwordTextField);
		this.add(line2);
		
		JPanel line3 = new JPanel();
		this.okButton = new JButton(ELoginDialog.okButtonLabel.getText());
		okButton.setFont(font);
		this.okButton.addActionListener(actionHandler);
		this.okButton.setActionCommand(this.okButton.getText());
		this.getRootPane().setDefaultButton(this.okButton);

		line3.add(this.okButton);
		this.cancelButton = new JButton(ELoginDialog.cancelButtonLabel.getText());
		cancelButton.setFont(font);
		this.cancelButton.addActionListener(actionHandler);
		this.cancelButton.setActionCommand(this.cancelButton.getText());
		line3.add(this.cancelButton);
		this.add(line3);
		
		this.cLogin = new CLogin();
		this.cUser = new CUser();
		
		//control
		this.cLogin = new CLogin();
		this.cUser = new CUser();
	}
	
	public void initialize() {
		
	}	

	public VUser validateUser(String actionCommand) {
		VUser vUser = null;
		if (actionCommand.contentEquals(this.okButton.getText())) {
			password = new String(passwordTextField.getPassword());
			VLogin vLogin = new VLogin(this.UserIdTextField.getText(), password);	
			boolean bLoginSuccess = this.cLogin.validate(vLogin);			
			if (bLoginSuccess) {
				vUser = this.cUser.getUser(vLogin.getUserId());			
				if (vUser == null) {
					// 시스템 에러 - 회원 정보가 존재 하지 않음
					JOptionPane.showConfirmDialog(this, ELoginDialog.noAccountInfo.getText());
				}
			} else {
				// 로그인 실패 - id, 비밀번호 불일치
				JOptionPane.showMessageDialog(null, ELoginDialog.loginFailed.getText(), 
						ELoginDialog.errormessage.getText(),
						JOptionPane.ERROR_MESSAGE);
			}
		}
		return vUser;
	}

}
