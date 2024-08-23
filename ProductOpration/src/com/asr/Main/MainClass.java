package com.asr.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.asr.Opration.Product;

public class MainClass {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		Configuration configure = cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session openSession = sessionFactory.openSession();
		Transaction beginTransaction = openSession.beginTransaction();
		Product p = new Product();
		p.setPname("Lakme");
		p.setPrice(499);
		p.setPdetails("Foundation for all skin type");
		openSession.save(p);
		beginTransaction.commit();
	
	}

}
