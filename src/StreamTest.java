import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

		int price ;
		String name;
		public StreamTest(int price, String name) {
			super();
			this.price = price;
			this.name = name;
		
	}
	
	public static void main(String[]args)
	{
		ArrayList<StreamTest> al = new ArrayList<>();
		al.add(new StreamTest(10,"mn"));
		al.add(new StreamTest(20,"mn"));
		al.add(new StreamTest(40,"mn"));
		al.add(new StreamTest(50,"mn"));
		al.add(new StreamTest(90,"mn"));
	
		List<Integer> res = new ArrayList<>();
		res=al.stream().filter(p->p.price<50).map(p->p.price).collect(Collectors.toList());
		
		System.out.println(res);
		
		
	}
}
