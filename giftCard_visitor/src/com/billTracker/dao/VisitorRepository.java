package com.billTracker.dao;

import java.util.List;

import com.billTracker.model.VisitorModel;

public interface VisitorRepository {

	public List<VisitorModel> getAllVisitorModels();

	public void saveVisitorModel(long id);

	public Object saveVisitorModel(VisitorModel visitorNew);


}