import java.util.function.Function;
public class Main
{
	public static void main(String[] args) {
		
	Function<Integer,Integer> funcSquare= a-> 2*a ;
	System.out.println(funcSquare.apply(2));
	
	Function<Integer,Integer> funcCube= a-> a*a*a;
	System.out.println(funcCube.apply(2));

    System.out.println(funcSquare.andThen(funcCube).apply
	(2));

System.out.println(funcSquare.compose(funcCube).apply
	(2));
}
}
