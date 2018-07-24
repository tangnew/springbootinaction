/**
 * 
 */
package com.jw.springbootinaction.basic0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jw.springbootinaction.basic0.service.UseFunctionService;

/**
 * @author JW
 *
 * Create Time: Jul 24, 2018 6:19:23 PM
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ServiceConfig.class);
		UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
		String result = useFunctionService.sayHello("world1");
		System.out.println(result);
		context.close();
	}
}
