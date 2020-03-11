package com.crud.text;   // org.hibernate

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClothsaveDao 
{
	public static void main(String[] args)
	{
		
		Configuration cfg=new Configuration().configure();  // its reads hibernate.cfg.xml
		
		SessionFactory sf=cfg.buildSessionFactory(); // Db Connection , orm, DDl
		
		Session session =sf.openSession();    // dql dml operations crud operations
		
		//Transaction transaction =session.beginTransaction();   // begin transation
 		
		
		ClothDto jeans= new ClothDto();  // object
		
		jeans.setBrand("levis");
		jeans.setBrand("puma"); // its takes last values
		jeans.setType("demin");
		//jeans.setId(3);
		jeans.setPrice("4000");
		jeans.setColor("blue");
		
		Transaction transaction =session.beginTransaction();   // begin to crud operations

		session.save(jeans);
		
		transaction.commit();
		
		session.close();
		
		sf.close();
		
		System.out.println("App end");
	}

}