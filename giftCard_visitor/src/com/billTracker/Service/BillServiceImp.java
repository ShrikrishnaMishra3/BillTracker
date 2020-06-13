
package com.billTracker.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.billTracker.dao.BillRepository;
import com.billTracker.model.BillModel;

@Service

@Transactional
public class BillServiceImp implements BillService {

	public BillServiceImp(BillRepository billDao) {
		super();
		this.billDao = billDao;
	}

	@Autowired
	private BillRepository billDao;

	@Override
	public List<BillModel> listAll() {
		// TODO Auto-generated method
		System.out.println("------------" + billDao.getAllBillModel().size());

		return billDao.getAllBillModel();

	}

}
