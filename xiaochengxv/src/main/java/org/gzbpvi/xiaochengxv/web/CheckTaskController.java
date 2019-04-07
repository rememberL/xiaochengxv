package org.gzbpvi.xiaochengxv.web;

import java.util.List;

import org.gzbpvi.xiaochengxv.domain.CheckTaskDetail;
import org.gzbpvi.xiaochengxv.domain.CheckTaskInfo;
import org.gzbpvi.xiaochengxv.domain.ChecktaskEquipment;
import org.gzbpvi.xiaochengxv.service.CheckTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/saveDB")
public class CheckTaskController {
	
	@Autowired
	private CheckTaskService checkTaskService;
	
	/*检验员任务单首页数据
	 * */
	@RequestMapping(value = "/getUnit", method = RequestMethod.POST)
	public List<CheckTaskInfo> getCheckTaskByChecker(@RequestParam("OANum") String checker) {
		List<CheckTaskInfo> list = checkTaskService.getCheckTaskInfo(checker);
		return list;
	}
	
	@RequestMapping(value = "/getReg", method = RequestMethod.POST)
	public List<CheckTaskDetail> getChecktaskDetail(@RequestParam("OANum") String checker,String taskno){
		System.out.println("taskno="+taskno);
		List<CheckTaskDetail> list = checkTaskService.getChecktaskDetail(checker, taskno);
		return list;
	}
	
	@RequestMapping(value = "/getEquip", method = RequestMethod.POST)
	public List<ChecktaskEquipment> getChecktaskEqu(@RequestParam("registerno") String registerno){
		System.out.println("registerno="+registerno);
		List<ChecktaskEquipment> list = checkTaskService.getChecktaskEqu(registerno);
		return list;	
	}

}
