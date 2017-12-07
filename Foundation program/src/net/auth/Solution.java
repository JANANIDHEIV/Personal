package net.auth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {

	public static void main(String[] args) throws IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		User user = new User();
		Address personalAddress = new Address();
		Address companyAddress = new Address();
		session.beginTransaction();
		//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		user.setUserId(2);
		user.setUserName("Janu");
		user.setEmailId("abc@gmail.com");
		user.setPhoneNo(9876543210L);
		user.setPersonalAddress(personalAddress);
		user.setCompanyAddress(companyAddress);
		session.save(user);
		session.getTransaction().commit();
		session.close();
		sf.close();
	}

}
