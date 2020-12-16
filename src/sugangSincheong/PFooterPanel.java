package sugangSincheong;

import javax.swing.JLabel;
import javax.swing.JPanel;

import constants.Constants.ESincheongPanel;

public class PFooterPanel  extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private JLabel copyrightLabel;

	public PFooterPanel() {
		this.copyrightLabel = new JLabel();
		this.add(this.copyrightLabel);
	}

	public void initialize() {
		this.copyrightLabel.setText(ESincheongPanel.copyright.getText());				
	}
}

