package OOPS_6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Class1 extends Class {

	@Override
	public void getNumbers(int number) {
		int count = 0;

		int remainder2 = 0;
		int remainder3 = 0;
		int flag;
		while (number > 0) {
			int temp = remainder2;
			remainder2 = number % 10;

			if (temp > remainder2) {
				flag = temp;
				remainder2 = temp;
				temp = flag;

			}

			number = number / 10;
			count++;
			if (count == 3) {
				break;

			}
		}
		ArrayList<Integer> al = new ArrayList<>();

		al.add(remainder2);

		List list = al.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		System.out.println("The maximum of three numbers" + list);

	}

}
