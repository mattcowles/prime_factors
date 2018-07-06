import java.util.ArrayList;
import java.util.List;

/**
 * Created by mcowles on 7/6/18.
 */
public class PrimeFactor {

	public static List<Integer> getPrimeFactors(Integer number) {

		List<Integer> list = new ArrayList<>();
		for(int i = 1; i < number; i++) {

			Integer rem = number % i;
			Integer val = number / i;
			if(rem == 0 && isPrime(val))  {
				list.add(val);
			}
		}
		return list;

	}
	public static boolean isPrime(Integer num) {

		for(int i = 2; i < num; i++) {
			if((num % i) == 0) {
				return false;
			}
		}
		return true;
	}
}
