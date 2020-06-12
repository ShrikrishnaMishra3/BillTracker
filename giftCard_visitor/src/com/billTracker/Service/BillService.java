package com.billTracker.Service;

import java.util.List;

import com.billTracker.model.BillModel;



public interface BillService {

	public List<BillModel> listAll();	

	public void save(BillModel billNew);

	}


