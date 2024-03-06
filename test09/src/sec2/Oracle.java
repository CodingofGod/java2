package sec2;

public class Oracle implements Database {
	String url;
	int port;
	String id;
	String pw;
	@Override
	public void connect(String url, String port, String id, String pw) {
		System.out.println(url+":"+port+"/"+id+";"+pw);
		System.out.println("데이터베이스가 성공적으로 연결되어있습니다.");
		
	}
	@Override
	public void select(String tbname, String condition) {
		if(rs!==null) {
			System.out.println("결과셋(저장소) 닫기");
		}
		if(pstmt!==null) {
			System.out.println("데이터베이스를 비활성화");
		}
		if(conn!==null) {
			System.out.println("데이터베이스 연결 종료");
		}
		

		
	}
	@Override
	public void insert(String tbname, String field1, int value1, String condition) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update(String tbname, String field1, int value1, String condition) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(String tbname, String condition) {
		// TODO Auto-generated method stub
		
	}
	
}
