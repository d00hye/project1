package constants;

public class Constants {

	public enum EConfiguration{
		rootFileName("root"),
		miridamgiFilePostfix("M"),
		sincheongFilePostfix("S");
		
		private String text;

		private EConfiguration(String text) {
			this.text = text;
		}
		public String getText() {
			return this.text;
		}
		public int getInt() {
			return Integer.parseInt(text);
		}
	}
	
	public enum ESetTitle{
		dialogTitle("Login"),
		mainTitle("명지대학교 수강신청 시스템"),
		infoTitle("학점 교류 대상 학교");
		
		private String text;
		
		private ESetTitle(String text) {
			this.text = text;
		}
		public String getText() {
			return this.text;
		}
		public int getInt() {
			return Integer.parseInt(text);
		}
	}

	public enum ELoginDialog {
		width("300"),
		height("440"),
		nameLabel(" 아이디   "),
		sizeNameText("10"),
		passwordLabel("비밀번호"),
		sizePasswordText("10"),
		okButtonLabel("ok"),
		cancelButtonLabel("cancel"),
		noAccountInfo("회원 정보가 존재 하지 않습니다."),
		loginFailed("아이디나 비밀번호가 다릅니다."),
		errormessage("Password error");
		
		private String text;
		
		private ELoginDialog(String text) {
			this.text = text;
		}
		public String getText() {
			return this.text;
		}
		public int getInt() {
			return Integer.parseInt(text);
		}
	}
	
	public enum EinfoDialog {
		width("600"),
		height("400");
		
		private String text;
		
		private EinfoDialog(String text) {
			this.text = text;
		}
		public String getText() {
			return this.text;
		}
		public int getInt() {
			return Integer.parseInt(text);
		}
	}

	
	public enum EMainFrame {
		width("500"),
		height("600");
		
		private String text;
		
		private EMainFrame(String text) {
			this.text = text;
		}
		public String getText() {
			return this.text;
		}
		public int getInt() {
			return Integer.parseInt(text);
		}
	}
	
	public enum EMenuBar {
		FILE("파일"),
		EDIT("편집");
		
		private String text;
		
		private EMenuBar(String text) {
			this.text = text;
		}
		public String getText() {
			return this.text;
		}
	}
	
	public enum EToolBar {
		수강신청("수강신청"), 
		책가방("책가방"), 
		개인정보("개인정보"),
		학점교류("학점교류");
		
		private String text;

		EToolBar(String text) {
			this.text = text;
		}

		public String getText() {
			return this.text;
		}
		

	}
	
	public enum EFileMenu {
		NEW("생성"),
		OPEN("열기"),
		SAVE("저장"),
		SAVEAS("다른이름으로"),
		PRINT("프린트"),
		EXIT("종료");
		
		private String text;
		
		private EFileMenu(String text) {
			this.text = text;
		}
		public String getText() {
			return this.text;
		}
	}
	
	public enum EEditMenu {
		COPY("복사"),
		CUT("자르기"),
		PASTE("붙여넣기"),
		DELETE("삭제");
		
		private String text;
		
		private EEditMenu(String text) {
			this.text = text;
		}
		public String getText() {
			return this.text;
		}
	}
	
	public enum EDirectory{
		campus("캠퍼스"),
		college("대학"),
		hakgwa("학과");
		
		private String text;
		
		private EDirectory(String text) {
			this.text = text;
		}
		
		public String getText() {
			return this.text;
		}
	}
	
	public enum EPGangjwaSelection{
		gangjwaNo("강좌번호"),
		gangjwaName("강좌명"),
		damdangGyosu("담당교수"),
		hakjeom("학점"),
		time("시간");
		
		private String text;
		
		private EPGangjwaSelection(String text) {
			this.text = text;
		}
		
		public String getText() {
			return this.text;
		}
	}
	
	public enum EPResult{
		gangjwaNo("강좌번호"),
		gangjwaName("강좌명");
		
		private String text;
		
		private EPResult(String text) {
			this.text = text;
		}
		
		public String getText() {
			return this.text;
		}
	}
	
	public enum ESincheongPanel{
		welcome("님 안녕하세요."),
		copyright("Copyright(C) MYONGJI UNIVERSITY. All rights reserved");
		
		private String text;
		
		private ESincheongPanel(String text) {
			this.text = text;
		}
		
		public String getText() {
			return this.text;
		}
	}

	
}
