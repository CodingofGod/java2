package sec1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import section.Member;

public class MemberExam {
	Scanner sc = new Scanner(System.in);
	List<Member> memList = new ArrayList<>();
	boolean sw = true;
	public static void main(String[] args) {
		MemberExam app = new MemberExam();
		app.mainCall();
		
	}
	private void mainCall() {
		while(sw) {
			System.out.println("1. 회원 가입");
			System.out.println("2. 회원 목록");
			System.out.println("3. 회원 삭제");
			System.out.println("4. 프로그램 종료");
			System.out.print("작업 번호 : ");
			int job = sc.nextInt();
			switch(job) {
			case 1:
				add();
				break;
			case 2:
				info();
				break;
			case 3:
				remove();
				break;
			default:
				System.out.println("프로그램 종료");
				sw = false;
			}
		}
	}
	
	public void add() {
		System.out.println("아이디 입력 :");
		String id = sc.next();
		System.out.println("번호 입력 :");
		int mcode = sc.nextInt();
		System.out.println("이름 입력 :");
		String name = sc.next();
		System.out.println("비밀번호 입력 : ");
		String pw = sc.next();
		System.out.println("전화번호 입력 : ");
		String tel = sc.next();
		System.out.println("출생년도 입력 : ");
		int year = sc.nextInt();
		memList.add(new Member(id, mcode, name, pw, tel, year));
		System.out.println("새로운 회원 등록");
		}
	public void info() {
		for(Member s:memList) {
			System.out.println(s.toString());
		}
	}
	public void remove() {
		System.out.println("제거할 회원 아이디 입력 : ");
		String id = sc.next();
		for(int i=9;i<memList.size();i++) {
			if(memList.get(i).getId().equals(id)) {
				System.out.println("제거 : "+memList.get(i).toString());
				memList.remove(i);
			}
		}
	}
}