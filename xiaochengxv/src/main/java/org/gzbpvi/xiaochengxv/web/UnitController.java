package org.gzbpvi.xiaochengxv.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.gzbpvi.xiaochengxv.domain.NewUnit;
import org.gzbpvi.xiaochengxv.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * 根据小程序采集来的参数新增单位信息
 * 
 * 
 */

@RestController
@RequestMapping(value = "/saveDB")
public class UnitController {
	
	@Autowired
	private UnitService unitService;

	/*
	 * 此方法好像没有使用的地方
	 * */
	@RequestMapping(value = "/addAdressInfo", method = RequestMethod.POST)
	public String addAdressInfo() {

		return "0";
	}

	/*在管线巡检的时候用作添加隐患点
	 * 由于在前端传来的数据有些是大写，有些与实体名称不一致，所以手动填值
	 * */
	@RequestMapping(value = "/addNewUnit", method = RequestMethod.POST)
	public String addNewUnit(HttpServletRequest request) {
		Object object = request.getParameter("new_data");
        int insertCount = 0;
		if (object != null) {
			JSONArray jsonArray = JSONArray.fromObject(object.toString());
			List<NewUnit> newUnitList = new ArrayList<NewUnit>();
			JSONObject jsonObj = null;
			for (int i = 0; i < jsonArray.size(); i++) {
       		NewUnit newUnit = new NewUnit();
       		jsonObj = jsonArray.getJSONObject(i);
       		newUnit.setChecker(jsonObj.getString("OANum"));
       		newUnit.setLatitude(jsonObj.getString("latitude"));
       		newUnit.setLongitude(jsonObj.getString("longitude"));
       		newUnit.setAddress(jsonObj.getString("address"));
       		newUnit.setNewunit(jsonObj.getString("cmp_eqmt"));
       		newUnit.setPickdate(jsonObj.getString("adddate"));
       		newUnit.setGrade(jsonObj.getString("grade"));
       		newUnit.setCategory(jsonObj.getString("category"));
       		newUnit.setDescribe(jsonObj.getString("describe"));
       		newUnit.setFilenamelist(jsonObj.getString("fileNameListStr"));
       		newUnit.setPointid(jsonObj.getString("pointId"));
       		newUnit.setPolylineid(jsonObj.getString("polylineId"));
       		newUnitList.add(newUnit);
       		}
			insertCount = unitService.addNewUnit(newUnitList);
			
			//由于页面接受0或1表示成功和失败
			if(insertCount>1)insertCount=1;
		}
		
		return insertCount+"";
	}

}
