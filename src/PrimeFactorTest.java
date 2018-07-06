import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by mcowles on 7/6/18.
 */
public class PrimeFactorTest {

	@Test(expected = NullPointerException.class)
	public void getPrimeFactorsNull() throws Exception {

		List<Integer> list = PrimeFactor.getPrimeFactors(null);
	}


	@Test
	public void getPrimeFactors0() throws Exception {

		List<Integer> list = PrimeFactor.getPrimeFactors(0);
		System.out.println(list);
		Assert.assertTrue(list.size() == 0);
	}

	@Test
	public void getPrimeFactors1() throws Exception {

		List<Integer> list = PrimeFactor.getPrimeFactors(1);
		System.out.println(list);
		Assert.assertTrue(list.size() == 0);
	}

	@Test
	public void getPrimeFactorsneg1() throws Exception {

		List<Integer> list = PrimeFactor.getPrimeFactors(-1);
		System.out.println(list);
		Assert.assertTrue(list.size() == 0);
	}
	@Test
	public void getPrimeFactorsneg100() throws Exception {

		List<Integer> list = PrimeFactor.getPrimeFactors(-100);
		System.out.println(list);
		Assert.assertTrue(list.size() == 0);
	}

	@Test
	public void getPrimeFactors21() throws Exception {

		List<Integer> list = PrimeFactor.getPrimeFactors(21);
		System.out.println(list);
		Collections.sort(list);
		Assert.assertArrayEquals(list.toArray(), new Integer []{3,7});
	}

	@Test
	public void getPrimeFactors64() throws Exception {

		List<Integer> list = PrimeFactor.getPrimeFactors(64);
		System.out.println(list);
		Collections.sort(list);
		Assert.assertArrayEquals(list.toArray(), new Integer []{2});
	}
	@Test
	public void getPrimeFactors20() throws Exception {

		List<Integer> list = PrimeFactor.getPrimeFactors(20);
		System.out.println(list);
		Collections.sort(list);
		Assert.assertArrayEquals(list.toArray(), new Integer []{2,5});
	}

	@Test
	public void getPrimeFactors100() throws Exception {

		List<Integer> list = PrimeFactor.getPrimeFactors(100);
		System.out.println(list);
		Collections.sort(list);
		Assert.assertArrayEquals(list.toArray(), new Integer []{2,5});
	}
	@Test
	public void getPrimeFactors95() throws Exception {

		List<Integer> list = PrimeFactor.getPrimeFactors(95);
		System.out.println(list);
		Collections.sort(list);
		Assert.assertArrayEquals(list.toArray(), new Integer []{5, 19});
	}

	@Test
	public void getPrimeFactorsPrimeInput() throws Exception {

		List<Integer> list = PrimeFactor.getPrimeFactors(89);
		System.out.println(list);
		Assert.assertArrayEquals(list.toArray(), new Integer []{89});
	}

}