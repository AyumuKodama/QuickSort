import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class QuickSorterTester {

	@Test
	public void testQuickSort() {
		int[] test1 = {2, 0, 1, 7, 3};
		
		QuickSorter.quickSort(test1, 0, 4);
		
		assertTrue("Test 1", test1[2] == 2);
		for (int i = 0; i < test1.length; i++) {
			System.out.println(test1[i]);
		}
		
	}

	@Test
	public void testPartition() {
		int[] test2 = {2, 0, 3, 5, 10, 4, 7, 6, 8, 1};
		assertTrue("Test 2", QuickSorter.partition(test2, 0, 9) == 2);
		System.out.println(QuickSorter.partition(test2, 0, 9));
		
		int [] test3 = {1, 3, 9, 8, 6, 7, 0};
		assertTrue("Test 3", QuickSorter.partition(test3, 0, 6) == 1);
		System.out.println(QuickSorter.partition(test3, 0, 6));
	}

}
