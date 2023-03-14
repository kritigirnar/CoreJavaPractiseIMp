import java.util.function.Predicate;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	
Predicate<String> predicateTestser= s-> s.length()>2;
System.out.println(predicateTestser.test("Kriti"));

Predicate<String> predicateEvenChecker=a-> a.length()%2==0;
System.out.println(predicateEvenChecker.test("kriti"));

System.out.println("Mergin* with and :"+ predicateTestser.and(predicateEvenChecker).test("kriti"));
	    System.out.println("Mergin* with or :"+ predicateTestser.or(predicateEvenChecker).test("kriti"));
System.out.println("Mergin* with negate  :"+ predicateTestser.negate().test("kriti"));

	}
}
