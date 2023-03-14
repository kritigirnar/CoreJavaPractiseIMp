import java.util.function.Function;
public class Main
{
	public static void main(String[] args) {
		
		Function<Integer,Integer> testFunctional=
		a-> a*a;
		System.out.println(testFunctional.apply(5));
		
	}
}
