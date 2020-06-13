package com.billTracker.dao;

import java.util.List;

import com.billTracker.model.VisitorModel;

public interface VisitorRepository {

	public List<VisitorModel> getAllVisitorModels();

	public void saveVisitorModel(VisitorModel visitorNew);

}