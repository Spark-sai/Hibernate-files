package com.crud.text;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClothUpdateDao  // first fetch the data(get method) and  update the data  (update method)
{
	public static void main(String[] args) {

		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		
		
		Transaction tr=session.beginTransaction();
		
		ClothDto cl=session.get(ClothDto.class, 2); // fetch the data
		
	//	System.out.println(cl);
		
		if(cl!= null)
		{
		cl.setPrice("4500");  // set the data
		session.update(cl);  // update the data
		tr.commit();
		}
		else
		{
			System.out.println("no data");
		}
		session.close();
		sf.close();
		System.out.println("App endddddd");
	}

}



