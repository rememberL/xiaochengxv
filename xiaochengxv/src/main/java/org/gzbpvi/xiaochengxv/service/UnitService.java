package org.gzbpvi.xiaochengxv.service;

import java.util.List;

import org.gzbpvi.xiaochengxv.domain.NewUnit;
import org.gzbpvi.xiaochengxv.domain.AddressInfo;

public interface UnitService {

	int addAddressInfo(AddressInfo addressInfo);
	
	/* 新增采集到的单位
	 * */
	int addNewUnit(List<NewUnit> newUnitList);
}
