package Collection_8;

import java.time.LocalDate;
import java.util.Arrays;

public class ProductionFacility8 {

	int plid;
	String pro_facility_name;
	String pro_fa_location;
	int totalproduction_perday;
	String itemnames[];
	LocalDate prod_date;

	public int getPlid() {
		return plid;
	}

	public void setPlid(int plid) {
		this.plid = plid;
	}

	public String getPro_facility_name() {
		return pro_facility_name;
	}

	public void setPro_facility_name(String pro_facility_name) {
		this.pro_facility_name = pro_facility_name;
	}

	public String getPro_fa_location() {
		return pro_fa_location;
	}

	public void setPro_fa_location(String pro_fa_location) {
		this.pro_fa_location = pro_fa_location;
	}

	public int getTotalproduction_perday() {
		return totalproduction_perday;
	}

	public void setTotalproduction_perday(int totalproduction_perday) {
		this.totalproduction_perday = totalproduction_perday;
	}

	public String[] getItemnames() {
		return itemnames;
	}

	public void setItemnames(String[] itemnames) {
		this.itemnames = itemnames;
	}

	public LocalDate getProd_date() {
		return prod_date;
	}

	public void setProd_date(LocalDate prod_date) {
		this.prod_date = prod_date;
	}

	@Override
	public String toString() {
		return "ProductionFacility [plid=" + plid + ", pro_facility_name=" + pro_facility_name + ", pro_fa_location="
				+ pro_fa_location + ", totalproduction_perday=" + totalproduction_perday + ", itemnames="
				+ Arrays.toString(itemnames) + ", prod_date=" + prod_date + "]";
	}

	public ProductionFacility8(int plid, String pro_facility_name, String pro_fa_location, int totalproduction_perday,
			String[] itemnames, LocalDate prod_date) {
		super();
		this.plid = plid;
		this.pro_facility_name = pro_facility_name;
		this.pro_fa_location = pro_fa_location;
		this.totalproduction_perday = totalproduction_perday;
		this.itemnames = itemnames;
		this.prod_date = prod_date;
	}

	public ProductionFacility8() {
		super();
		// TODO Auto-generated constructor stub
	}
}
