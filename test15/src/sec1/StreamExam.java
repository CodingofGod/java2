package sec1;
//파일/키보드/데이터 입력 : FileInputStream, BufferedInputStream, FileReader, BufferedReader
//파일/키보드/데이터 출력 : FileOutputStream, BufferedOutputStream, FileWriter, BufferedWriter
//Stream으로 끝나는 클래스는 데이터 입출력을 바이트 단위로 : FileInputStream, BufferedInputStream, FileOutputStream, BufferedOutputStream
//Stream으로 끝나지 않는 클래스는 데이터 입출력을 문자 단위로 :FileReader, BufferedReader, FileWriter, BufferedWriter
public class StreamExam {
	public static void main(String[] args) {
		String fileInputStream = "fileInputStream는 바이트 단위로 입력하기 위한 스트림";
		String buffredInputStream = "buffredInputStream는 바이트 단위로 입력하기 위한 스트림 : 메모리 버퍼로 로딩 후";
		String fileReader = "fileReader는 문자 단위로 입력하기 위한 스트림";
		String bufferedReader = "bufferedReader는 문자 단위로 입력하기 위한 스트림: 메모리 버퍼로 로딩 후";
		String FileOutputStream = "FileOutputStream는 바이트 단위로 출력하기 위한 스트림";
		String BufferedOutputStream = "BufferedOutputStream는 바이트 단위로 출력하기 위한 스트림 : 메모리 버퍼로 로딩 후";
		String FileWriter = "FileWriter는 문자 단위로 출력하기 위한 스트림";
		String BufferedWriter = "BufferedWriter는 문자 단위로 출력하기 위한 스트림 : 메모리 버퍼로 로딩 후";
		System.out.println(fileInputStream);
		System.out.println(buffredInputStream);
		System.out.println(fileReader);
		System.out.println(bufferedReader);
		System.out.println(FileOutputStream);
		System.out.println(BufferedOutputStream);
		System.out.println(FileWriter);
		System.out.println(BufferedWriter);

	}

}
