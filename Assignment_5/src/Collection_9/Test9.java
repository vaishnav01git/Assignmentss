package Collection_9;

import java.util.concurrent.CopyOnWriteArrayList;

public class Test9 {

	public static void main(String[] args) {
		CopyOnWriteArrayList<Employee9> empList = new CopyOnWriteArrayList<>();
		Employee9 employee1 = new Employee9(101, "ketan", 1000, "dev", "pune");
		Employee9 employee2 = new Employee9(103, "rahul", 2000, "dev", "nagpur");
		Employee9 employee3 = new Employee9(102, "amol", 4000, "dev", "mumbai");

		empList.add(employee1);
		empList.add(employee2);
		empList.add(employee3);
		for (Employee9 employee : empList) {
			int objectElement = employee.getEid();
			int index = objectElement % 10;
			empList.add(index, employee);
		}
		empList.forEach(System.out::println);
	}

}
