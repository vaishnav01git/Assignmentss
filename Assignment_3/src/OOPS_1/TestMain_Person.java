package OOPS_1;

public class TestMain_Person {

	public static void main(String[] args) {

		Employee employee = new Employee(1015956, "karan", " Pune", "1/12/1994", 1000, "1/1/21", "hinjewadi",
				"development", "9999999999", "karan@gmail.com");

		Customer customer = new Customer(101, "virat", "Mumbai", "1/1/1984", "1/1/91", "moshi", "8888888888",
				"rahul@gmail.com");

		System.out.println(employee);
		System.out.println(customer);

	}

}
