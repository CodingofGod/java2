package org.kh.object1;


public class member {
	private String id;
	private String pw;
	private String email;
	private String tel;
	private int Birth;
	
	

	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getPw() {
		return pw;
	}



	public void setPw(String pw) {
		this.pw = pw;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getTel() {
		return tel;
	}



	public void setTel(String tel) {
		this.tel = tel;
	}



	public int getBirth() {
		return Birth;
	}



	public void setBirth(int birth) {
		Birth = birth;
	}



	// 오른쪽클릭 Source에서 Generate toString    // Override :상속받아서 내용을 바꿔서 정의하는것 (오브젝트 클래스-> 오버라이드) 
	public String toString() {
		return "Memder [id=" + id + ", pw=" + pw + ", email=" + email + ", tel=" + tel + ", Birth=" + Birth + "]";
	}
	
	
}

