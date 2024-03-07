package sec1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExam {
	public static void main(String[] args) throws IOException {
		File file = new File("e.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		BufferedWriter fw = new BufferedWriter (new FileWriter(file, true));
		fw.write("흥민손 ");
		fw.newLine();
		fw.write("이번 시즌도 득점왕~ 가즈아!");
		fw.newLine();
		fw.write("토트넘 살려야지~");
		fw.flush();
		fw.close();
	}
}
