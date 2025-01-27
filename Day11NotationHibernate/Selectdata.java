package hibernateClasses;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Selectdata {

	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Query q=s.createQuery("from HibernateDemo");
		List list=q.list();
		Iterator<HibernateDemo> itr=list.iterator();
		while(itr.hasNext()) {

			HibernateDemo h=itr.next();
			System.out.println(h.getId()+" "+h.getFname()+" "+h.getLname()); 
		}
		

	}

}
