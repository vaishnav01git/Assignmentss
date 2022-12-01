package Com.OOPS_Electronics;

import java.util.Date;

public class Laptop extends Electronics {
	public void laptopdetails() {
		Electronics el3 = new Electronics();
		el3.setId(1001);
		el3.setSemiconductor_type("hp");
		el3.setDateofmanufacturing(new Date(23 / 04 / 2002));

		System.out.println(el3.getId());
		System.out.println(el3.getSemiconductor_type());
		System.out.println(el3.getDateofmanufacturing());
	}
}
