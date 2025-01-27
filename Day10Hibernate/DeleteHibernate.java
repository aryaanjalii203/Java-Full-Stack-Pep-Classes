package hibernateClasses;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



public class DeleteHibernate {
	public static void main(String arfgs[]) {
	Configuration con=new Configuration();
	con.configure("hibernate.cfg.xml");
	SessionFactory sf=con.buildSessionFactory();
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	Query q=s.createQuery("delete HibernateDemo e set fname=:name where id=:eid");
	q.setParameter("name","Abhisha");
	q.setParameter("eid",12);
	q.executeUpdate();
	t.commit();
	s.close();
	}
	
}
