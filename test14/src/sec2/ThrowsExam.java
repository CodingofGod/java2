package sec2;
//(폴더)는 디렉토리 이다
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//예외 떠넘기기
public class ThrowsExam {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		FileInputStream fis = null;
		String absolutePath = "d:\\minwoo\\java2\\test14\\bin\\sec2\\a.txt"; //절대 경로
		String relativePath = "./a.txt"; //상대 경로 -> 현재 디렉토리
		String relativePath2 = "../a.txt"; //상대 경로 -> 상위 디렉토리
		fis = new FileInputStream(absolutePath); //파일을 지정하는 것이 "절대 경로" 이다
		if(fis!=null) {
			fis.close();
		}
	}

}
