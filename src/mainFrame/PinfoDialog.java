package mainFrame;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

import constants.Constants.ESetTitle;
import constants.Constants.EinfoDialog;

public class PinfoDialog extends JDialog {
	private static final long serialVersionUID = 1L;

	private JButton univ1;
	private JButton univ2;
	private JButton univ3;
	
	public PinfoDialog() {
		setTitle(ESetTitle.infoTitle.getText());
		this.setSize(EinfoDialog.width.getInt(), EinfoDialog.height.getInt());
		this.setLocationRelativeTo(null);
		this.setResizable(false);

		this.setLayout(new FlowLayout());

		JPanel line1 = new JPanel();

		this.univ1 = new JButton("¼þ½Ç´ëÇÐ±³");
		line1.add(this.univ1);
		this.univ2 = new JButton("±¹¹Î´ëÇÐ±³");
		line1.add(this.univ2);
		this.univ3 = new JButton("±¤¿î´ëÇÐ±³");
		line1.add(this.univ3);
		this.add(line1);
		
	}

}
