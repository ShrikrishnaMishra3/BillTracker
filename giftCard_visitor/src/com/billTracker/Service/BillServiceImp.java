package com.billTracker.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
		// TODO Auto-generated method stub
		return billDao.getAllBillModel();
	}

	@Override
	public void save(BillModel billNew) {
		// TODO Auto-generated method stub
		billDao.saveBillModel(billNew);

	}

}
