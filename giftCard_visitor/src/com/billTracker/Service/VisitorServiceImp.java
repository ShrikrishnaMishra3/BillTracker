package com.billTracker.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.billTracker.dao.VisitorRepository;
import com.billTracker.model.VisitorModel;

@Service
@Transactional
public class VisitorServiceImp implements VisitorService {

	@Autowired
	private VisitorRepository visitorDao;

	@Override
	public List<VisitorModel> getAllVisitorModel() {
		// TODO Auto-generated method stub
		return visitorDao.getAllVisitorModels();
	}

	@Override
	public List<VisitorModel> listAll() {
		// TODO Auto-generated method stub
		return visitorDao.getAllVisitorModels();
	}

	@Override
	public void save(VisitorModel visitorNew) {

		visitorDao.saveVisitorModel(visitorNew);
	}

}
