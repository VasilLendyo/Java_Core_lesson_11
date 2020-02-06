package ua.lviv.lgs.second;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Random rnd = new Random();
		String[] material = { "Leather", "Alcantara" };

		Auto[][] auto = new Auto[rnd.nextInt(5)][rnd.nextInt(5)];

		for (int i = 0; i < auto.length; i++) {
			for (int j = 0; j < auto[i].length; j++) {
				auto[i][j] = new Auto(80 + rnd.nextInt(520), 1959 + rnd.nextInt(60),
						new Helm(20 + rnd.nextInt(50), material[rnd.nextInt(2)]), new Engine(2 + rnd.nextInt(10)));
			}
		}

		boolean flag = false;

		while (!flag) {

			menu();
			switch (new Scanner(System.in).nextLine()) {

			case "a": {
				System.out.println(Arrays.deepToString(auto));
				break;
			}
			case "b": {
				Auto myAuto = new Auto(120, 2001, new Helm(45, material[1]), new Engine(4));

				for (Auto[] element : auto) {
					Arrays.fill(element, myAuto);
					System.out.println(Arrays.deepToString(auto));
				}
				break;
			}
			default: {
				System.out.println("Please, press \"a\" or \"b\"");
				break;
			}
			}
		}
	}

	static void menu() {
		System.out.println("Press \"a\" to print toString () of the array data in the console. (deepToString ())");
		System.out.println("Press \"b\" to set the same object of class Auto (fill ()) for all objects in this array");
	}
}
