package ua.lviv.lgs.first;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Application {
	public static void main(String[] args) {

		Integer[] array = new Integer[8];
		Random rnd = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt();
		}

		System.out.println("Sort by asc");
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));

		System.out.println("Sort by decs");
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println(Arrays.toString(array));
	}
}
