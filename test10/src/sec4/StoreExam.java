package sec4;

public class StoreExam {
	public static void main(String[] args) {
		Inventory store;
		store = new Store();
		store.Inventory();
		
		Pay pay;
		pay = new Pay();
		pay.Inventory();
		pay.pay();
		
		pay = new Store();
		pay.Inventory();
		pay.pay();
	}

}
