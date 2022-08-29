package com.xworkz.footballapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FootballAppRunner {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("bean.xml");
		System.out.println(container);
		FootballApp footballApp = container.getBean(FootballApp.class);
		System.out.println(footballApp.brand);
		System.out.println(footballApp.isAirFilled);
		System.out.println(footballApp.color);
		System.out.println(footballApp.price);

		System.out.println("**************************");

		String string = container.getBean(String.class);
		System.out.println(string);

		System.out.println("**************************");
		Integer integer = container.getBean(Integer.class);
		System.out.println(integer);

		System.out.println("**************************");
		Byte by = container.getBean(Byte.class);
		System.out.println(by);

		System.out.println("**************************");
		Short sh = container.getBean(Short.class);
		System.out.println(sh);

		System.out.println("**************************");
		Long lo = container.getBean(Long.class);
		System.out.println(lo);

		System.out.println("**************************");
		Double db = container.getBean(Double.class);
		System.out.println(db);

		System.out.println("**************************");
		Float fl = container.getBean(Float.class);
		System.out.println(fl);

		System.out.println("**************************");
		Character ch= container.getBean(Character.class);
		System.out.println(ch);

	}
}
