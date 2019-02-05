//package com.app.models;
//
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="customer")
//public class Customer {
//
//    @Id
//    @GeneratedValue(strategy=GenerationType.IDENTITY) 
//	@Column(name = "customer_id")
//    private Long id;
//    private String name;
//    private String phone;
//    
////    @OneToMany(mappedBy="customer")
////    private List<Order> orders = new ArrayList<>();
//    
//    public Customer() {
//    }
//
//    public Customer(String name) {
//        this.name = name;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
////	public List<Order> getOrders() {
////		return orders;
////	}
////
////	public void setOrders(List<Order> orders) {
////		this.orders = orders;
////	}
//
//	public String getPhone() {
//		return phone;
//	}
//
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
//    
//}
