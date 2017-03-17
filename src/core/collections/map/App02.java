package core.collections.map;

import java.util.HashMap;
import java.util.Map;

public class App02 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.isEmpty());
				
		map.put("kilka", 25);
		map.put("sardina", 5);
		System.out.println(map);
				
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
	}
}
