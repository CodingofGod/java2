package sec2;

public interface Database {
	void connect(String url, String port, String id, String pw);
	void close(Connection con, PreparedStatement pstmt, ResultSet rs);
	void select(String tbname, String condition);
	void insert(String tbname, String field1, int value1, String condition);
	void update(String tbname, String field1, int value1, String condition);
	void delete(String tbname, String condition);
}

//final static