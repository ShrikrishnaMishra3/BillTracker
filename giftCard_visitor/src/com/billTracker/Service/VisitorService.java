package com.billTracker.Service;

import java.util.List;

import com.billTracker.model.VisitorModel;

public interface VisitorService {

	// This method is to get All notes
	public List<VisitorModel> getAllVisitorModel();

	public List<VisitorModel> listAll();

	public void save(VisitorModel visitorNew);

}
