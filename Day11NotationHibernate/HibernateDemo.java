package hibernateClasses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="employeetable")

public class HibernateDemo {
	@Id
	@GenericGenerator(name="xyz",strategy="increment")
	@GeneratedValue(generator="xyz")
	int id;
	@Column(name="FirstName")
	String fname;
	@Column(name="LastName")
	String lname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}

}