package valueObject;

public class VUser {
	private String userId;
	private String name;
	private String address;
	private String hakgwa;
	private String score;
	
	public VUser(String userId, String name, String address, String hakgwa, String score) {
		this.userId = userId;
		this.name = name;
		this.address = address;
		this.hakgwa = hakgwa;
		this.score = score;
	}

	public String getUserId() {
		return userId;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	
	public String getHakgwa() {
		return hakgwa;
	}

	public String getScore() {
		return score;
	}
}
