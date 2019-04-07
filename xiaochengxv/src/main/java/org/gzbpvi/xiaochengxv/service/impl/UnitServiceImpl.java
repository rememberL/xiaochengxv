package org.gzbpvi.xiaochengxv.service.impl;

import java.util.List;

import org.gzbpvi.xiaochengxv.dao.AddressInfoDao;
import org.gzbpvi.xiaochengxv.dao.NewUnitDao;
import org.gzbpvi.xiaochengxv.domain.NewUnit;
import org.gzbpvi.xiaochengxv.domain.AddressInfo;
import org.gzbpvi.xiaochengxv.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/*处理新增单位
 * 
 * */
@Service
public class UnitServiceImpl implements UnitService {

	@Autowired
	private AddressInfoDao addressInfoDao;
	
	@Autowired
	private NewUnitDao newUnitDao;
	
	@Transactional
	public int addAddressInfo(AddressInfo addressInfo) {
		
		return 0;
	}

	@Transactional
	public int addNewUnit(List<NewUnit> newUnitList) {
		int insertCount = newUnitDao.addNewUnit(newUnitList);
		return insertCount;
	}

}
