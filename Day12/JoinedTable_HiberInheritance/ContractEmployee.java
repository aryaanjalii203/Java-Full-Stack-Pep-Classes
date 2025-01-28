package JoinedHiber_Inheritance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="cont_empx")

@PrimaryKeyJoinColumn(name="id")
public class ContractEmployee extends Employee{
	@Column(name="rate_per_hr")
	int rate_per_hr;
	@Column(name="No_periods")
	int period;
	public int getRate_per_hr() {
		return rate_per_hr;
	}
	public void setRate_per_hr(int rate_per_hr) {
		this.rate_per_hr = rate_per_hr;
	}
	public int getperiod() {
		return period;
	}
	public void setperiod(int period) {
		this.period = period;
	}

}