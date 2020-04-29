package com.iesvdc.acceso;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.iesvdc.acceso.beans.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = 
            new ClassPathXmlApplicationContext("com/iesvdc/acceso/xml/beans.xml");
        Moto miMoto = (Moto) ac.getBean("mi_moto");
        System.out.println(miMoto.toString());
    }
}
