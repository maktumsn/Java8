
public class ThrowandThrows {
	
static void check(int num) 
{
	if (num<1)
		throw new ArithmeticException("nengative integer");
	else 
		System.out.println(num*num);
}

static void checkThrows(int num) throws ArithmeticException
{
		System.out.println(num*num);
}

	
	
	
public static void main(String[] args) {
	
	ThrowandThrows.check(-3);
	
	try {
		ThrowandThrows.checkThrows(-3);
	}
	
	catch(Exception e){
		System.out.println(e);
	}
	
}
}
