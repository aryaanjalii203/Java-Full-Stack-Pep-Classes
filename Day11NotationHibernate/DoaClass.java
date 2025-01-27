package hibernateClasses;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DoaClass {
	public static void main(String[] args) {
		
	HibernateDemo e=new HibernateDemo();
	e.setId(101);
	e.setFname("Anjali");
	e.setLname("Arya");
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
