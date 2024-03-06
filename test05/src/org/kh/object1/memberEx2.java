package org.kh.object1;

public class memberEx2 {
	public static void main(String[] args) {
		member mem1 = new member();
		mem1.setId("강민우"); // "kang"
		mem1.setPw("1234");
		mem1.setEmail("rkdalsdn2542@naver.com"); //"rkdalsdn2542@naver.com";
		mem1.setBirth(1999);  //= 1999;
		mem1.setTel("01022856385"); // = "01022856385";
		System.out.println("id : "+mem1.getId());
		System.out.println("pw : "+mem1.getPw());
		System.out.println("email : "+mem1.getEmail());
		System.out.println("birth : "+mem1.getBirth());
		System.out.println("tel : "+mem1.getTel());
		System.out.println(mem1.toString());
		
	}

}
