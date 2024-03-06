package sec2;

public class Notice {
	private String tltle;
	private String content;
	private String author;
	
	public Notice() { }
	public Notice(String tltle, String content, String author) {
		super();
		this.tltle = tltle;
		this.content = content;
		this.author = author;
	}
	public String getTltle() {
		return tltle;
	}
	public void setTltle(String tltle) {
		this.tltle = tltle;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Notice [tltle=" + tltle + ", content=" + content + ", author=" + author + "]";
	}
	
	
	
}
