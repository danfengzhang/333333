package cn.com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.bean.Customer;

public interface ICustomerDao {
   
	public Customer selectCustomer(Customer cus);
	
	public Customer selectCustomerByID(Short id);
	
	public int selectAllnumber();
	
	public List<Customer> selectCustomerPage(@Param("num")int size, @Param("count")int j);
	
	public void addCustomer(Customer cus);
	
	public int delete(Short id);
	
	public int updateCustomer(Customer cus);
}