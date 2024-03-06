package sec2;

public class RemoteExam5 {

	public static void main(String[] args) {
		RemoteControl r; 	//RemoteControl 객체 선언
		
		r = new RemoteControl() { //RemoteControl 로 형 변환 	
			int volume;
			public void turnOn() {
				System.out.println("기기 전원 ON");	
			}
			public void turnOff() {
				System.out.println("기기 전원 OFF");	
			}
			public void setVolume(int volume) {
				if(volume > MAX) this.volume = RemoteControl.MAX;
				else if(volume < MIN) this.volume = RemoteControl.MIN;
				else this.volume = volume;
			}
		};
	}
}



RemoteControl r1 = new RemoteControl() {
	
}

