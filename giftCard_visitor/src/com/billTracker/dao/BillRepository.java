package com.billTracker.dao;

import java.util.List;

import com.billTracker.model.BillModel;

public interface BillRepository {

	public List<BillModel> getAllBillModel();

	public void saveBillModel(BillModel billNew);
}
