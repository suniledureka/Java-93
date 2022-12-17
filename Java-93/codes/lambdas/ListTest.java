package co.edureka.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		List<Integer> marks = Arrays.asList(86,74,93,65,82,76,99,80);

		System.out.println(marks);
		
		Collections.sort(marks,	(o1, o2) -> (o1>o2)?-1:1);

		System.out.println(marks);
	}

}
