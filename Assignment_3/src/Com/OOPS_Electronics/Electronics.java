package Com.OOPS_Electronics;

import java.util.Date;

public class Electronics {
	private int id;
	private String semiconductor_type;
	private Date dateofmanufacturing;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSemiconductor_type() {
		return semiconductor_type;
	}

	public void setSemiconductor_type(String semiconductor_type) {
		this.semiconductor_type = semiconductor_type;
	}

	public Date getDateofmanufacturing() {
		return dateofmanufacturing;
	}

	public void setDateofmanufacturing(Date dateofmanufacturing) {
		this.dateofmanufacturing = dateofmanufacturing;
	}
}
