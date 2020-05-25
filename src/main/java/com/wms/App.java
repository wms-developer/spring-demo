package com.wms;

import com.wms.service.IMessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Classname App
 * @Description TODO
 * @Date 2020/5/25 15:04
 * @Author by wms
 */
public class App {
    public static void main(String[] args) {
        //使用配置文件来启动一个 ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-spring.xml");

        System.out.println("启动成功");

        //从context中取出我们的Bean,而不是使用new的方式
        IMessageService messageSerice = context.getBean(IMessageService.class);

        //获取成功打印输出
        System.out.println(messageSerice.getMessage());
    }
}
