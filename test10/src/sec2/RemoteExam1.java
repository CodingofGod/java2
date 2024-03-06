package sec2;

public class RemoteExam1 {
	
	public static void main(String[] args) {
		RemoteControl r1; 
		
		r1 = new RemoteControl() {
			
			int volume;
			int light;
		
			
			public void turnOff() {
				System.out.println("전원 OFF");
			}
			
			public void turnOn() {
				System.out.println("전원 ON");
			}

			public void setVolume(int volume) {
				if(volume > MAX) {
					this.volume = RemoteControl.MAX;
				}else if(volume < MIN) {
					this.volume = RemoteControl.MIN;
				}else {
					this.volume = volume;
				}
				
				System.out.println("현재 볼륨: "+volume);
				
				}
		};
		RemoteControl.changeBettery();
		r1.turnOn();
		r1.setVolume(4); //최대 : 10 까지
		r1.setMute(true);
		r1.setMute(false);
		r1.turnOff();
}
}