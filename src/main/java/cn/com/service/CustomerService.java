package cn.com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.bean.Customer;
import cn.com.dao.*;
import cn.com.service.ICustomerService;

@Service
@Transactional
public class CustomerService implements ICustomerService {

	@Resource
	private ICustomerDao iCustomerDao;

	public Customer selectCustomer(Customer customer) {
		Customer cus;
		if (iCustomerDao.selectCustomer(customer) == null) {
			System.out.println("1");
			cus = null;
		} else {
			System.out.println("2");
			cus = iCustomerDao.selectCustomer(customer);
		}
		return cus;
	}

	public Customer selectCustomerByID(Short id) {
		return iCustomerDao.selectCustomerByID(id);
	}

	public int selectAllnumber() {
		return iCustomerDao.selectAllnumber();
	}

	public List<Customer> selectCustomerPage(int page, int j) {
		int size = (page - 1) * j;
		return iCustomerDao.selectCustomerPage(size, j);
	}

	public void addCustomer(Customer cus) {
		iCustomerDao.addCustomer(cus);

	}

	public int delete(Short id) {
		return iCustomerDao.delete(id);
	}

	public int updateCustomer(Customer cus) {
		return iCustomerDao.updateCustomer(cus);
	}
}

