package com.springcore.spring1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
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
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("Spring.xml"));
    	Alien obj = (Alien)factory.getBean("alien");
    	obj.code();
    }
}
