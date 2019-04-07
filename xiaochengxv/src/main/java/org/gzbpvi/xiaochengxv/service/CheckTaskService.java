package org.gzbpvi.xiaochengxv.service;

import java.util.List;

import org.gzbpvi.xiaochengxv.domain.CheckTaskDetail;
import org.gzbpvi.xiaochengxv.domain.CheckTaskInfo;
import org.gzbpvi.xiaochengxv.domain.ChecktaskEquipment;

public interface CheckTaskService {

	List<CheckTaskInfo> getCheckTaskInfo(String checker);
	List<CheckTaskDetail> getChecktaskDetail(String checker,String taskno);
	List<ChecktaskEquipment> getChecktaskEqu(String registerno);
}
