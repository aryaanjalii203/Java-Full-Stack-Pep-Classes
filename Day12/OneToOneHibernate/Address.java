package OneToOneHibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="add6")
public class Address {
	@Id
	@GenericGenerator(name="xyz", strategy="increment")
	@GeneratedValue(generator="xyz")
	int aid;
	String laneno, city, state;
	int pincode;
	@OneToOne(targetEntity=Employee.class)
	@JoinColumn(name="eid",unique=true)
	Employee employee;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getLaneno() {
		return laneno;
	}
	public void setLaneno(String laneno) {
		this.laneno = laneno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
