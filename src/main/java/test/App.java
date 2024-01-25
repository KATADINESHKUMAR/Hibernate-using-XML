package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		//person p1 = new person(23, "Ravi", "VIGNAN", "8186906603");
		//person p2 = new person(34, "Kishore", "VIGNAN", "9642759276");
		//person p3 = new person(194, "Dinesh", "VIGNAN", "799328560");
		//person p4 = new person(34, "Kiran", "VIGNAN", "9632759276");
		Book b2=new Book(2,"ddsfdsf");
		//Book b1=new Book(1,"abc");
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
        //session.persist(p1);
		//session.persist(p2);
        //session.persist(p4);
        session.persist(b2);
		tx.commit();

		factory.close();
	}

}
