package com.kodali.setup;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * This class sets up for Testing, any initializations required for unit test classes to proceed with testing
 * 
 * @author kodali
 */
public class TestSetup {

    public static ApplicationContext getApplicationContext(String config) {
        if (config == null || config.isEmpty()) {
        	config = "classpath:applicationContext.xml";
        }
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        return applicationContext;
    }

    public static ApplicationContext getApplicationContext() {
        return getApplicationContext(null);
    }

}
