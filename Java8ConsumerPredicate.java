import java.util.function.Consumer;
public class Main
{
	public static void main(String[] args) {
		
		Consumer<Integer> cons=
		a->System.out.println(" just to print op"+a*2);
		cons.accept(5);
	}
}
