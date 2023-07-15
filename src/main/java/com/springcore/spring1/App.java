package com.springcore.spring1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*
    	 * BeanFactory is an interface having getBean method.
    	 * XmlBeanFactory is the class we are creating an object with and assigning to factory object.
    	 * XmlBeanFactory is deprecated.
    	 * FileSystemResource is used to provide the parameter xml configuration file.
    	 * We are type casting the bean in Alien object.
    	 * Calling Code method.
    	 * */
        //BeanFactory factory = new XmlBeanFactory(new FileSystemResource("Spring.xml"));
    	/*
    	 * BeanFactory and XmlBeanFactory are deprecated and new updated methods are not present in these interfaces and classes.
    	 * Hence we use Application Context interface to implement getBean method.
    	 * ClassPathXMLApplicationContext and all the other ApplicationContext files are extended by Application Context itself.
    	 * 
    	 *  We have to move Spring.xml to class path directory which is main/java since it is looking in class path directory itself.
    	 */
    	ApplicationContext factory = new ClassPathXmlApplicationContext("Spring.xml");
    	
    	Alien obj1 = (Alien)factory.getBean("alien");
    	obj1.age=15;
    	System.out.println(obj1.age);
    	
    	Alien obj2 = (Alien)factory.getBean("alien");
    	System.out.println(obj2.age);
    }
}
