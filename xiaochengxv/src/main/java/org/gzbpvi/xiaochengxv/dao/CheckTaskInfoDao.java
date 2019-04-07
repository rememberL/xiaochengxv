package org.gzbpvi.xiaochengxv.dao;

import java.util.List;

import org.gzbpvi.xiaochengxv.domain.CheckTaskDetail;
import org.gzbpvi.xiaochengxv.domain.CheckTaskInfo;
import org.gzbpvi.xiaochengxv.domain.ChecktaskEquipment;


public interface CheckTaskInfoDao {
	
	List<CheckTaskInfo> getCheckTaskInfoByChecker(String checker);
	List<CheckTaskDetail> getChecktaskDetail(String checker,String taskno);
	List<ChecktaskEquipment> getChecktaskEqu(String registerno);

}
