package com.hibernatete.testproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		
		Address address = new Address();
		address.setAddressid(1);
		address.setCity("Teaneck");
		address.setCountry("USA");
		address.setStret("Cedar Lane");
		
		User user = new User();
		user.setUserid(1);
		user.setUserName("Kantharaj");
		user.setAddress(address);
		
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(address);
		session.getTransaction().commit();
		session.close();
	}

}
