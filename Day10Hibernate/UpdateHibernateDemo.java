package hibernateClasses;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



public class UpdateHibernateDemo {
	public static void main(String arfgs[]) {
	Configuration con=new Configuration();
	con.configure("hibernate.cfg.xml");
	SessionFactory sf=con.buildSessionFactory();
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	Query q=s.createQuery("update HibernateDemo e set fname=:name where id=:eid");
	q.setParameter("name","Abhisikha");
	q.setParameter("eid",12);
	q.executeUpdate();
	t.commit();
	s.close();
	}
	
}
