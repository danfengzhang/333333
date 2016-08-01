package cn.com.service;

import java.util.List;

import cn.com.bean.Customer;

public interface ICustomerService {
	
	public Customer selectCustomer(Customer customer);
	
	public Customer selectCustomerByID(Short id);
	
	public int selectAllnumber();
	
	public List<Customer> selectCustomerPage(int page,int j);
	
	public void addCustomer(Customer cus);
	
	public int delete(Short id);
	
	public int updateCustomer(Customer cus);
	
}

