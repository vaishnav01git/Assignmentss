package Collection_7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test7 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		List<Student7> studentList = Arrays.asList(new Student7(101, "someshwar", 45), new Student7(102, "mahesh", 40),
				new Student7(103, "anurag", 70), new Student7(104, "nikhil", 75));
		List<Double> collect2 = studentList.stream().map(Student7::getAvg).collect(Collectors.toList());
		List<Double> firstThreeNumbers = collect2.stream().sorted().collect(Collectors.toList());
		firstThreeNumbers.forEach(System.out::println);
		List<Student7> nameBelowFiftyMarks = studentList.stream().filter(s -> s.getAvg() < 50)
				.collect(Collectors.toList());
		nameBelowFiftyMarks.forEach(System.out::println);
		List<Student7> nameBelowThirtyfive = studentList.stream().filter(s -> s.getAvg() < 35)
				.collect(Collectors.toList());
		nameBelowThirtyfive.forEach(System.out::println);
		List<String> byName = studentList.stream().map(Student7::getSname).collect(Collectors.toList());
		byName.forEach(System.out::println);
	}

}
