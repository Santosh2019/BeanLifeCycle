package com.scoopen.BeanLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        @SuppressWarnings("resource")
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("SpringBean.xml");
        DemoBeanCycle demoBeanCycle= (DemoBeanCycle) context.getBean("demoBean");
        demoBeanCycle.setId(10);
        context.registerShutdownHook();
       System.out.println(demoBeanCycle);
     
    	
    }
}
