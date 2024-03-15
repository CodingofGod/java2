package sec1;

import java.util.ArrayList;
import java.util.List;

import section.Board;

public class BoardExam {
	public static void main(String[] args) {
		List<Board> boList = new ArrayList<>();
		for(int i=1;i<=6;i++) {
			Board bo = new Board(i, "제목"+i, "내용"+i, "작성자"+i, "2024-03-15", 315);
			boList.add(bo);
		}
		for(Board b:boList) {
			System.out.println(b.toString());
		}
	}

}
