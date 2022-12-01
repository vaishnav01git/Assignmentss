package Collection_8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;

public class Test8 {

	public static void main(String[] args) {

		// pfFacility1
		ProductionFacility8 pd1 = new ProductionFacility8(101, "Developement", "wardha", 12,
				new String[] { "abc", "def", "aaa", "mmm", "nnnnn", "gdttyuio" }, LocalDate.of(2022, 8, 30));
		ProductionFacility8 pd2 = new ProductionFacility8(102, "Developement", "yavatmal", 13,
				new String[] { "pqr", "stu", "etryy", "uytrf" }, LocalDate.of(2022, 8, 29));
		ProductionFacility8 pd3 = new ProductionFacility8(103, "Developement", "kanpur", 14, new String[] { "vwx", "yz" },
				LocalDate.of(2022, 8, 28));

		// pfFacility2
		ProductionFacility8 pd11 = new ProductionFacility8(201, "Testing", "amravati", 11, new String[] { "abc", "def" },
				LocalDate.of(2022, 8, 20));
		ProductionFacility8 pd12 = new ProductionFacility8(202, "Testing", "washim", 12,
				new String[] { "pqr", "stu", "uytfd", "yfd", "kjhtr", "uytrfd" }, LocalDate.of(2022, 8, 19));
		ProductionFacility8 pd13 = new ProductionFacility8(203, "Testing", "buldhana", 13, new String[] { "vwx", "yz" },
				LocalDate.of(2022, 8, 18));

		// pfFacility3
		ProductionFacility8 pd21 = new ProductionFacility8(301, "Production", "shegaon", 22,
				new String[] { "abc", "def" }, LocalDate.of(2022, 8, 10));
		ProductionFacility8 pd22 = new ProductionFacility8(302, "Production", "nagpur", 3, new String[] { "pqr", "stu" },
				LocalDate.of(2022, 8, 9));
		ProductionFacility8 pd23 = new ProductionFacility8(303, "Production", "jalgaon", 14, new String[] { "vwx", "yz" },
				LocalDate.of(2022, 8, 8));

		ArrayList<ProductionFacility8> list = new ArrayList<>();
		list.add(pd1);
		list.add(pd2);
		list.add(pd3);

		list.add(pd11);
		list.add(pd12);
		list.add(pd13);

		list.add(pd21);
		list.add(pd22);
		list.add(pd23);

		// Print the details of facility with highest production per day. (you
		// have to
		// add at least 3 days details of each facility after that you have to
		// calculate
		// average of 3 days on the basis of average you have to print the
		// facility with
		// highest production
		highestProduction(list);
		// Print detail of facility on the basis of names
		basisOfName(list);

		// Print which facility is producing highest item.
		HighestItem(list);

		// Print production detail of each facility on the basis of production
		// date
	}

	private static void HighestItem(ArrayList<ProductionFacility8> list) {
		HashMap<String, Integer> map = new HashMap<>();
		int length = 0;
		int val = 0;
		String facName = "";
		for (ProductionFacility8 pf : list) {
			length = pf.getItemnames().length;
			System.out.println("length=" + length);
			if (map.containsKey(pf.getPro_facility_name())) {
				val = map.get(pf.getPro_facility_name());
				if (val > length) {
					map.put(pf.getPro_facility_name(), val);
				} else {
					map.put(pf.getPro_facility_name(), length);
				}
			} else {
				map.put(pf.getPro_facility_name(), length);
			}
		}

		for (Entry<String, Integer> m : map.entrySet()) {
			System.out.println(m.getKey() + " : " + m.getValue());
		}
	}

	private static void basisOfName(ArrayList<ProductionFacility8> list) {
		Collections.sort(list, new Comparator<ProductionFacility8>() {

			@Override
			public int compare(ProductionFacility8 o1, ProductionFacility8 o2) {
				String pfName1 = o1.getPro_facility_name();
				String pfName2 = o2.getPro_facility_name();
				return pfName2.compareTo(pfName1);
			}
		});
		System.out.println(list);
	}

	private static void highestProduction(ArrayList<ProductionFacility8> list) {
		// System.out.println(list);

	}
}
