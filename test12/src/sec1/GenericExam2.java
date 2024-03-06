package sec1;

class StudentMap<K, V> {
	private K key;
	private V value;
	public StudentMap() { }
	public StudentMap(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
}

public class GenericExam2 {
	public static void main(String[] args) {
		StudentMap<Integer, String> s1 = new StudentMap<>(1,"강민우");
		StudentMap<Integer, String> s2 = new StudentMap<>(2,"이종우");
		StudentMap<Integer, String> s3 = new StudentMap<>(3,"강범준");
		StudentMap<Integer, String> s4 = new StudentMap<>(4,"박성은");
		
		StudentMap<String, Integer> s5 = new StudentMap<>("강민우", 90);
		StudentMap<String, Integer> s6 = new StudentMap<>("이종우", 100);
		
		Student st1 = new Student("오주형", 26);
		StudentMap<Student, Integer> s7 = new StudentMap<>(st1, 100);
		
	}

}
