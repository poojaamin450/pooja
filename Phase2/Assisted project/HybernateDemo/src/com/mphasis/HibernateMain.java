package com.mphasis;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateMain {
    public static void main(String[] args) {
   	 
//SSR is used to map the config file and execute it   	 
   	 StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//the metadata in the config file should be executed   	 
   	 Metadata md=new MetadataSources(ssr).getMetadataBuilder().build();
//go the tag sessionfactory and execute the meta data in it   	 
   	 SessionFactory sf=md.getSessionFactoryBuilder().build();
//CRUD operations
   	 Session s=sf.openSession();
//ACID A-atomicity C-consistency I-isolation D-Durability
   	 Transaction t=s.beginTransaction();
   	 Employee e=new Employee();
   	 e.setEmpno(3);
   	 e.setEmpname("karthik");
   	 e.setEmpemail("k@c.c");
   	 // s.save(e);
   	 Employee e1=s.get(Employee.class,2);
   	  System.out.println(e1);
   	 t.commit();
   	 s.close();
   	 sf.close();
   	 
   	 
    }

}
