package test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.AutowiredService;

/*
 *@Author: XieLiang
 *@Date : 2018/6/29
 *@Comment :
 */
public class TestClass {

    @Test
    public void testAuto() {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath*:spring-autoWired.xml");

        AutowiredService autowiredService = (AutowiredService) applicationContext.getBean("autoWiredService");
        autowiredService.say("Hello AutoWired!!!" +"   ");
    }
}
