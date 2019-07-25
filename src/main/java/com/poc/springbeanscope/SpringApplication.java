package com.poc.springbeanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
//		SingletonScopedBean singletonScopedBean1 = applicationContext.getBean("singletonBean", SingletonScopedBean.class);
//		
//		System.out.println(singletonScopedBean1.getValue());
//		
//		singletonScopedBean1.setValue("This is updated value");
//		
//		SingletonScopedBean singletonScopedBean2 = applicationContext.getBean("singletonBean", SingletonScopedBean.class);
//		System.out.println(singletonScopedBean2.getValue());
//		
//		System.out.println(singletonScopedBean1 == singletonScopedBean2);
		
//		PrototypeScopedBean prototypeScopedBean1 = applicationContext.getBean("prototypeBean", PrototypeScopedBean.class);
//		System.out.println(prototypeScopedBean1.getValue());
//		
//		prototypeScopedBean1.setValue("This is prototype updated value");
//		
//		PrototypeScopedBean prototypeScopedBean2 = applicationContext.getBean("prototypeBean", PrototypeScopedBean.class);
//		System.out.println(prototypeScopedBean2.getValue());
		
		SingletonScopedBean singletonScopedBean1 = applicationContext.getBean("singletonBean", SingletonScopedBean.class);
		PrototypeScopedBean prototypeScopedBean1 = singletonScopedBean1.getPrototypeScopedBean();
		System.out.println(prototypeScopedBean1.getValue());
		
		prototypeScopedBean1.setValue("This is prototype updated value");
		
		SingletonScopedBean singletonScopedBean2 = applicationContext.getBean("singletonBean", SingletonScopedBean.class);
		PrototypeScopedBean prototypeScopedBean2 = singletonScopedBean2.getPrototypeScopedBean();
		System.out.println(prototypeScopedBean2.getValue());
		
		System.out.println("Proxy Object : "+singletonScopedBean2);
		System.out.println("Original Object: "+prototypeScopedBean2);
		

	}

}
