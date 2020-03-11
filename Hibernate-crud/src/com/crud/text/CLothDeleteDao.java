package com.crud.text;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CLothDeleteDao {

	public static void main(String[] args) {


		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tr=session.beginTransaction();
		
		ClothDto cl=session.get(ClothDto.class, 7); // fetch the data
		
		if(cl!=null)
		{
		session.delete(cl);
		tr.commit();
		}
		else
		{
			System.out.println("no data");
		}
		session.close();
		sf.close();
		System.out.println("data updated");
	}

}
