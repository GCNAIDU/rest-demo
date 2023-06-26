/**
 * 
 */
package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Order;

/**
 * @author Dell
 *
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
	
	@GetMapping("/all")
	public List<Order> getAll(){
		List<Order> orders= new ArrayList<Order>();
		Order order= new Order();
		order.setId(100);
		order.setItemName("Samsung TV");
		order.setValue(20000);
		orders.add(order);
		
		Order order1= new Order();
		order1.setId(100);
		order1.setItemName("Samsung TV");
		order1.setValue(20000);
		orders.add(order1);
		
		Order order2= new Order();
		order2.setId(100);
		order2.setItemName("Samsung TV");
		order2.setValue(20000);
		orders.add(order2);
		
		return orders;
	}

}
