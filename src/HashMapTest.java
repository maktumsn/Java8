import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTest {

public static void main(String[] args) {
	HashMap<Integer, Integer> mp = new HashMap<Integer,Integer>();
	mp.put(1, 1);
	mp.put(2, 2);
	mp.put(3, 3);
	mp.put(4, 4);
	mp.put(5, 5);
	
	for(Entry<Integer, Integer> m:mp.entrySet())
	{
		System.out.println(m);
	}
	
	mp.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
	
	mp.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
}
}
