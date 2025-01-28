package OneToOneHibernate;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="emp6")
public class Employee {
	@Id
	@GenericGenerator(name="xyz", strategy="increment")
	@GeneratedValue(generator="xyz")
	@PrimaryKeyJoinColumn
	int eid;
	String name;
	@OneToOne(targetEntity=Address.class, cascade=CascadeType.ALL)
	@JoinColumn(name="aid",unique=true)
	Address address;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}