package Single_Table_Inheritance;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertData {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session session=sf.openSession();
	Transaction ts=session.beginTransaction();
	Employee e1=new Employee();
	e1.setFname("Kashish");
	RegularEmployee re=new RegularEmployee();
	re.setFname("Simer");
	re.setBonus(5500);
	re.setSalary(55000);
	ContractEmployee ce=new ContractEmployee();
	ce.setFname("Rohit");
	ce.setRate_per_hr(1000);
	ce.setNo_periods(30);
	session.save(e1);
	session.save(ce);
	session.save(re);
	ts.commit();
	session.close();
	sf.close();
	System.out.println("Desired data has been added successfully");
}
}
