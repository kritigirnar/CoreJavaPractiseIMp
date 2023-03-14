import java.util.function.Supplier;
import java.util.Date;
public class Main
{
	public static void main(String[] args) {
		Supplier<Date> dateSupply= ()-> new Date();
	 System.out.println(dateSupply.get());
		}
}
