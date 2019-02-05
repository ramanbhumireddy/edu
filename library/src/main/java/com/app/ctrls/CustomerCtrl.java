//package com.app.ctrls;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.app.models.Customer;
//import com.app.services.CustomerService;
//
//@RequestMapping("/customer")
//@RestController
//public class CustomerCtrl {
//	
//	static int i = 6;
//	
//	@Autowired
//	private CustomerService customerService;
//	
//	
//	@GetMapping(value = "/new")
//	public ResponseEntity<?> newCustomer() {
//		Customer p = customerService.create(new Customer("customer" + i));
//		i++;
//		return new ResponseEntity<>("customer created success. customer Name : " + p.getName() , HttpStatus.OK);
//	}
//	
//	@GetMapping(value = "/details")
//	public ResponseEntity<Customer> get(@RequestParam(name="uid") Integer uid) {
//		Customer u = new Customer();
//		u.setId(uid.longValue());
//		return new ResponseEntity<Customer>(customerService.get(uid.longValue()) , HttpStatus.OK);
//	}
//	
//	@GetMapping(value = "/list")
//	public List<Customer> get() {
//		return customerService.getAll();
//	}
//
//}
