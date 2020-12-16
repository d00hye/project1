package mainFrame;
import java.awt.BorderLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

import constants.Constants;
import constants.Constants.ESetTitle;
import sugangSincheong.PSugangSincheongPanel;
import valueObject.VUser;

public class PMainFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	private PMenuBar pMenuBar;
	private PToolBar pToolBar;
	private PSugangSincheongPanel pMainPanel;
	private WindowListener windowListener;
	
	// constructor
	public PMainFrame() {
		// set attributes
		setTitle(ESetTitle.mainTitle.getText());
		this.setSize(
				Constants.EMainFrame.width.getInt()*2, 
				Constants.EMainFrame.height.getInt()
				);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.windowListener = new WindowHandler();
		this.addWindowListener(this.windowListener);
		this.setLayout(new BorderLayout());
		
		// create and register components
		this.pMenuBar = new PMenuBar();
		this.setJMenuBar(this.pMenuBar);		
		
		this.pToolBar = new PToolBar();
		this.add(this.pToolBar, BorderLayout.NORTH);
		
		this.pMainPanel = new PSugangSincheongPanel();
		this.add(this.pMainPanel, BorderLayout.CENTER);	
	}
	
	
	public void initialize(VUser vUser) {
		this.pMenuBar.initialize();
		this.pToolBar.initialize();
		this.pMainPanel.initialize(vUser);		
	}
	
	private void save() {
		this.pMainPanel.save();
	}
	
	private class WindowHandler implements WindowListener {

		@Override
		public void windowOpened(WindowEvent e) {
			
		}

		@Override
		public void windowClosing(WindowEvent e) { //exit버튼을 눌렀을때(윈도우는 여전히 없어지지 않은 상태)
			save();
		}

		@Override
		public void windowClosed(WindowEvent e) { //완전히 끝난 직후(윈도우가 완전히 없어진 상태)
			
		}

		@Override
		public void windowIconified(WindowEvent e) { //완전 최소화했을때 작업표시줄에 수납
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) { //작업표시줄에서 활성화
			
		}

		@Override
		public void windowActivated(WindowEvent e) { //화면 줄이기 실행
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) { //화면 크기 늘리기 실행
			
		}
		
	}
}
