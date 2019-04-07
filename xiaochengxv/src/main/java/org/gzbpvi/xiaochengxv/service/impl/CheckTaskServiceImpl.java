package org.gzbpvi.xiaochengxv.service.impl;

import java.util.List;

import org.gzbpvi.xiaochengxv.dao.CheckTaskInfoDao;
import org.gzbpvi.xiaochengxv.domain.CheckTaskDetail;
import org.gzbpvi.xiaochengxv.domain.CheckTaskInfo;
import org.gzbpvi.xiaochengxv.domain.ChecktaskEquipment;
import org.gzbpvi.xiaochengxv.service.CheckTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckTaskServiceImpl implements CheckTaskService {

	@Autowired
	private CheckTaskInfoDao checkTaskInfoDao;
	
	@Override
	public List<CheckTaskInfo> getCheckTaskInfo(String checker) {
		List<CheckTaskInfo> list = checkTaskInfoDao.getCheckTaskInfoByChecker("%"+checker+"%");
		return list;
	}

	@Override
	public List<CheckTaskDetail> getChecktaskDetail(String checker, String taskno) {
		List<CheckTaskDetail> list = checkTaskInfoDao.getChecktaskDetail("%"+checker+"%", taskno);
		return list;
	}

	@Override
	public List<ChecktaskEquipment> getChecktaskEqu(String registerno) {
		List<ChecktaskEquipment> list = checkTaskInfoDao.getChecktaskEqu(registerno);
		return list;
	}

}
