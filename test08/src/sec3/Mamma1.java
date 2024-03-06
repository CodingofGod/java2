package sec3;
//Animal(부모 클래스 = super), Mamma1(자식 클래스 = sub)
public class Mamma1 extends Animal{ //Animal 로 부터 모든 멤버를 상속받은 Mamma1 클래스
	protected int leg;
	protected int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}

	public String print() {
		return "Mamma1 leg= [" + leg +"], name = ["+ super.name + "]";
	}
	
	
}
