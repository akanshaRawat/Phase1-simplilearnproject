package lockmeapp;

public class credential {
	private String sitename;
	private String username;
	private String password;
	
	
	public credential() {
		super();
	}


	public credential(String sitename, String username, String password) {
		super();
		this.sitename = sitename;
		this.username = username;
		this.password = password;
	}


	public String getSitename() {
		return sitename;
	}


	public void setSitename(String sitename) {
		this.sitename = sitename;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "credential [sitename=" + sitename + ", username=" + username + ", password=" + password + "]";
	}
}
