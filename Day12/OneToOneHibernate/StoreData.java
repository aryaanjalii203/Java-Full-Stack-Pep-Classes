package OneToOneHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session session=sf.openSession();
	Transaction ts=session.beginTransaction();
	Employee e1=new Employee();
	e1.setName("Anjali");
	Address re=new Address();
	re.setPincode(144001);
	re.setLaneno("12");
	re.setCity("Dhanaura");
	re.setState("Uttar Pradesh");
	e1.setAddress(re);
	re.setEmployee(e1);
	session.save(e1);
	session.save(re);
	ts.commit();
	session.close();
	sf.close();
	System.out.println("Desired data has been added successfully");
}
}