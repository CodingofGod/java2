package sec3;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;


public class MapExam {
	public static void main(String[] args) {
		//Map은 List처럼 index가 없어서 순서가 없다.
		Map<String, Integer> map1 = new HashMap<>();
		Map<String, String> map2 = new Hashtable<>();
		Map<Integer, String> map3 = new TreeMap<>();
		Properties map4 = new Properties();
		
		map1.put("kim", 90); 	//추가
		map1.put("lee", 100);
		map1.put("park", 80);
		map1.put("kang", 100);
		map1.put("kwon", 90);
		System.out.println(map1);
		System.out.println("park : "+map1.get("park")); //개별 요소 접근시 인덱스가 아니라 ket값으로 접근
		//맵 순회1 : Iterator(분리자)에 의한 접근
		//keys = {kang,lee,park,kim,kwon}
		System.out.println("Iterator(분리자)에 의한 접근");
		Iterator<String> keys = map1.keySet().iterator(); //맵의 키모음(ketset)이 하나의 요소로 분리됨
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(key + "=" +map1.get(key)); //map1.get("lee")
		}
		
		//맵 순회2 : entryset(키와 값의 하나의 쌍 => entry)에 의한 접근
		System.out.println("entrySet에 의한 순회");
		for(Map.Entry<String, Integer> entry : map1.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " : "+value);
		}
		//맵 순회3 : keyset에 의한 접근
		System.out.println("keySet에 의한 순회");
		for(String key : map1.keySet()) {
			System.out.println(key + " : "+map1.get(key));
		}
		
		if(map1.containsKey("kang")) { //특정 키의 존재유무
			System.out.println("kang : "+map1.get("kang"));
		} else {
			System.out.println("키가 kang인 요소는 존재하지 않습니다.");
		}
		
		if(map1.containsKey(100)) {
			System.out.println("100 만점자가 존재합니다.");
		} else {
			System.out.println("100 만점자가 없습니다.");
		}
		
		map2.put("김", "1코스"); 	//키는 중복될 수 없음
		map2.put("이", "2코스");
		map2.put("박", "3코스");
		map2.put("이", "2코스");
		map2.put("박", "3코스");
		map2.put("김", "1코스");
		System.out.println(map2);
		map2.remove("강");
		System.out.println("******* 편집 후 *******");
		System.out.println(map2);
		map2.clear();
		System.out.println("******* 비우기 후 *******");
		System.out.println(map2);
		
		//배열의 값을 TreeMap에 대입
		String[] names = {"강민우","오주형","최진안","김기태","강범준","김민아","김윤정","김응원","김필규","김예은"};
		for(int i=0;i<=9;i++) {
			map3.put(i, names[i]);
		}
		System.out.println("/n인원수 : "+map3.size());
		for(Integer i : map3.keySet()) {
			int key = i;
			String value = map3.get(key);
			System.out.println(key + " : "+ value);
		}
		System.out.println();
		
		//Properties의 키(필드이름)과 값은 모두 문자열로 취급된다.
		map4.setProperty("name", "강민우");
		map4.setProperty("age", "26");
		map4.setProperty("height", "173.8");
		map4.setProperty("kor", "100");
		map4.setProperty("eng", "100");
		map4.setProperty("mat", "100");
		System.out.println("이름 : "+map4.getProperty("name"));
		System.out.println("나이 : "+map4.getProperty("age"));
		System.out.println("키 : "+map4.getProperty("height"));
		System.out.println("국어점수 : "+map4.getProperty("kor"));
		System.out.println("영어점수 : "+map4.getProperty("eng"));
		System.out.println("수학점수 : "+map4.getProperty("met"));
		}

}
