package cn.com.service;
 
import java.util.List;

import cn.com.bean.Address;
import cn.com.dao.IAddressDao;
import cn.com.service.IAddressService;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class AddressService implements IAddressService {

	@Resource
	private IAddressDao iAddressDao;
	public List<Address> selectAddress() {
		return iAddressDao.selectAddress();
	}

	public Address selectAddressByID(Short id) {
		return iAddressDao.selectAddressByID(id);
	}


}
