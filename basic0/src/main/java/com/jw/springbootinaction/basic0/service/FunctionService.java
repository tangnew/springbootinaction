/**
 * 
 */
package com.jw.springbootinaction.basic0.service;

import org.springframework.stereotype.Service;

/**
 * @author JW
 *
 * Create Time: Jul 24, 2018 6:15:20 PM
 */

@Service
public class FunctionService {

	public String sayHello(String word) {
		return "Hello " + word + " !";
	}
}
