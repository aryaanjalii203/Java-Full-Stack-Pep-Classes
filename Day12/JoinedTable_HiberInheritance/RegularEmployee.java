package JoinedHiber_Inheritance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="reg_empx")
@PrimaryKeyJoinColumn(name="id")
public class RegularEmployee extends Employee {
	@Column(name="salary")
	float salary;
	@Column(name="bonus")
	int bonus;
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

}