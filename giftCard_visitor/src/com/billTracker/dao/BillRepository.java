
package com.billTracker.dao;

import java.io.Serializable;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.billTracker.model.BillModel;

public interface BillRepository {

	public List<BillModel> getAllBillModel();

}
