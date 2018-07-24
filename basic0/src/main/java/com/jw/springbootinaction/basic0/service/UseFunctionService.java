/**
 * 
 */
package com.jw.springbootinaction.basic0.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author JW
 *
 * Create Time: Jul 24, 2018 6:16:34 PM
 */
@Service
public class UseFunctionService {

	@Autowired
	private FunctionService functionService;
	
	public String sayHello(String word) {
		return functionService.sayHello(word);
	}
}
