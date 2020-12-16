package sugangSincheong;

import javax.swing.JLabel;
import javax.swing.JPanel;

import constants.Constants.ESincheongPanel;
import valueObject.VUser;

public class PHeaderPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	private JLabel welcomeLabel;
	private JLabel introduceLabel;
	
	public PHeaderPanel() {
		this.welcomeLabel = new JLabel();
		this.add(this.welcomeLabel);
		
		this.introduceLabel = new JLabel();
		this.add(this.introduceLabel);
		
	}
	public void initialize(VUser vUser) {
		this.welcomeLabel.setText(vUser.getHakgwa()+"  "+vUser.getName()+ESincheongPanel.welcome.getText());		
		this.introduceLabel.setText(vUser.getAddress()+" 거주 " + "평균 평점: "+vUser.getScore());
	}
}

