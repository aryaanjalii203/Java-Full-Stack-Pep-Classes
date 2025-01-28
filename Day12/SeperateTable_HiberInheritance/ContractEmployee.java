package Seperate_Inheritance;


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="cont2_emp2")

@AttributeOverrides({
	@AttributeOverride(name="id",column=@Column(name="id")),
	@AttributeOverride(name="fname",column=@Column(name="fname")),


})
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