package com.xyz;

import java.util.ArrayList;
import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.xyz.Question;

public class StoreValue {

	public static void main(String[] args) {
StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		
		Session session=factory.openSession();
		
		Transaction t=session.beginTransaction();
		
        HashSet<String>list1=new HashSet<>();
        
        list1.add("Java is Programming");
        
        list1.add("Java is a Plaform");
        
        HashSet<String>list2=new HashSet<>();
        
        list2.add("C++ is Programming");
        
        list2.add("C++ is a Platform");
        
        
        Question e1=new Question();
        e1.setQname("What is Java");
        e1.setAnswers(list1);
        
        Question e2=new Question();
        e2.setQname("What is C++");
        e2.setAnswers(list2);
        
        session.persist(e1);
        session.persist(e2);
        
        t.commit();
        
        session.close();
        
        System.out.println("Sucess!!!");
        
        

	}

}
