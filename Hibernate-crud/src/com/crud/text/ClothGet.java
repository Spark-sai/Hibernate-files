package com.crud.text;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClothGet {

	public static void main(String[] args) {

		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		ClothDto cl=session.get(ClothDto.class, 1);  // internally  it connects the default constructor
		System.out.println(cl);
		session.close();
		sf.close();
		System.out.println("App endzzzzzzzzz");
	}

}
