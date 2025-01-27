package hibernateClasses;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DoaClass1 {
	public static void main(String[] args) {
		
	Department e=new Department();
	e.setDid(12);
	e.setDname("Anjali");
	e.setLocation("Dhanaura");
	Configuration con=new Configuration();
	con.configure("hibernate.cfg.xml");
	SessionFactory sf=con.buildSessionFactory();
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	s.save(e);
	t.commit();
	s.close();
	}

}
